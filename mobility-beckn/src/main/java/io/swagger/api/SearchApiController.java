package io.swagger.api;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.swagger.annotations.*;
import io.swagger.configuration.ProviderConfig;
import io.swagger.model.Ack;
import io.swagger.model.Ack.StatusEnum;
import io.swagger.model.Error;
import io.swagger.model.search.test.SearchMobility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
@Controller
public class SearchApiController implements SearchApi {

    private static final Logger log = LoggerFactory.getLogger(SearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    
    
    public ResponseEntity<Object> searchPost(@ApiParam(value = "Beckn App searches for the Services using an Intent."  )  @Valid @RequestBody SearchMobility body) {
    	log.info("@@inside searchPost");
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	String pid = body.getMessage().getIntent().getProvider().getId();
            	String mid = body.getContext().getMessageId();
            	String tid = body.getContext().getTransactionId();
            	
            	log.info("tid:" + tid + " mid:" + mid);
            	//TODO store tid/mid in db or redis memory on callback reference - nikhilW
            	//after provider call to search which onSearch fetch this tid/mid and retrun response to BApp - nikhilW
            	log.info("searchPost->id:" + pid);
            	//TODO validate provider list from memory/DB - nikhilW
            	//TODO validate request with schema - nikhilW
            	//TODO validate IP of requster - nikhilW
            	if(pid.equals(ProviderConfig.providers[0])) {
            		ObjectMapper m = new ObjectMapper();
            		m.setSerializationInclusion(Include.NON_NULL);
            		ObjectNode on = m.createObjectNode();
            		ObjectNode on1 = m.createObjectNode();
            		
            		Ack ack = new Ack();
            		ack.setStatus(StatusEnum.ACK);
            		
            		on.putPOJO("ack", ack);
            		
            		on1.put("message", on);
            		
            		return new ResponseEntity<Object>(m.writeValueAsString(on1), HttpStatus.OK);
            	}else {
            		Error er = new Error();
            		er.setRError("invalid provider:" + pid);
            		//er.addFErrorItem("invalid provider:" + pid);
            		return new ResponseEntity<Object>(er, HttpStatus.OK);
            	}
            	
            	
                //return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"context\" : {\n    \"transaction_id\" : \"transaction_id\",\n    \"domain\" : \"{}\",\n    \"action\" : \"search\",\n    \"message_id\" : \"message_id\",\n    \"version\" : \"version\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"message\" : {\n    \"error\" : \"{}\",\n    \"status\" : \"ACK\"\n  }\n}", Object.class), HttpStatus.NOT_IMPLEMENTED);
            	
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
