package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Ack;
import io.swagger.model.Ack.StatusEnum;
import io.swagger.model.Error;
import io.swagger.model.mobility.select.SelectMobility;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
@Controller
public class SelectApiController implements SelectApi {

    private static final Logger log = LoggerFactory.getLogger(SelectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SelectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> selectPost(@ApiParam(value = "TODO"  )  @Valid @RequestBody SelectMobility body ){
    	
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	String sid = body.getMessage().getService().getId();
        	String mid = body.getContext().getMessageId();
        	String tid = body.getContext().getTransactionId();
        	
        	log.info("travellers:" + body.getMessage().getTrip().getTravellers());
        	
        	log.info("tid:" + tid + " mid:" + mid);
        	//TODO store tid/mid in db or redis memory on callback reference - nikhilW
        	//after provider call to search which onSearch fetch this tid/mid and retrun response to BApp - nikhilW
        	log.info("selectPost->sid:" + sid);
        	//TODO validate provider list from memory/DB - nikhilW
        	//TODO validate request with schema - nikhilW
        	//TODO validate IP of requster - nikhilW
        	if(true) {
        		ObjectMapper m = new ObjectMapper();
        		m.setSerializationInclusion(Include.NON_NULL);
        		ObjectNode on = m.createObjectNode();
        		ObjectNode on1 = m.createObjectNode();
        		
        		Ack ack = new Ack();
        		ack.setStatus(StatusEnum.ACK);
        		
        		on.putPOJO("ack", ack);
        		
        		on1.put("message", on);
        		
        		try {
					return new ResponseEntity<Object>(m.writeValueAsString(on1), HttpStatus.OK);
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}else {
        		Error er = new Error();
        		er.setRError("invalid service id:" + sid);
        		//er.addFErrorItem("invalid provider:" + pid);
        		return new ResponseEntity<Object>(er, HttpStatus.OK);
        	}
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
