package io.swagger.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Context;
import io.swagger.model.Context.ActionEnum;
import io.swagger.model.Domain;
import io.swagger.model.mobility.onselect.Amount;
import io.swagger.model.mobility.onselect.Breakup;
import io.swagger.model.mobility.onselect.ComputedValue;
import io.swagger.model.mobility.onselect.Contact;
import io.swagger.model.mobility.onselect.Driver;
import io.swagger.model.mobility.onselect.EstimatedValue;
import io.swagger.model.mobility.onselect.Fare;
import io.swagger.model.mobility.onselect.Info;
import io.swagger.model.mobility.onselect.ListedValue;
import io.swagger.model.mobility.onselect.Mobile;
import io.swagger.model.mobility.onselect.OfferedValue;
import io.swagger.model.mobility.onselect.Rating;
import io.swagger.model.mobility.onselect.Service;
import io.swagger.model.mobility.onselect.Traveller;
import io.swagger.model.mobility.select.Trip;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
@Controller
public class OnSelectApiController implements OnSelectApi {

    private static final Logger log = LoggerFactory.getLogger(OnSelectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OnSelectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> onSelectPost(@ApiParam(value = "TODO"  )  @Valid @RequestBody Object body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	 try {
                 //return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"context\" : \"{}\",\n  \"message\" : \"{}\"\n}", Object.class), HttpStatus.NOT_IMPLEMENTED);
             	ObjectMapper m = new ObjectMapper();
         		m.setSerializationInclusion(Include.NON_NULL);
         		ObjectNode ctx = m.createObjectNode();
         		
             	Context c = new Context();
         		c.setAction(ActionEnum.ON_SEARCH);
         		c.setDomain(Domain.MOBILITY);
         		c.setMessageId("MessageID123");
         		//c.setTimestamp(OffsetDateTime.now());
         		c.setTransactionId("TransactionID");
         		c.setVersion("0.0.8");
         		
         		ctx.putPOJO("context", c);
         		
         		//TODO set messgae - nikhilW
         		io.swagger.model.mobility.onselect.Message msg =  getMessage();
         		
         		ctx.putPOJO("message", msg);
         		        		
         		return new ResponseEntity<Object>(m.writeValueAsString(ctx), HttpStatus.OK);
             	
             } catch (Exception e) {
                 log.error("Couldn't serialize response for content type application/json", e);
                 return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
             }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    private io.swagger.model.mobility.onselect.Message getMessage() {
    	
    	io.swagger.model.mobility.select.Message msg =  new io.swagger.model.mobility.select.Message();
    	
    	msg.setService(getService());
    	
    	//TODO get trip 
    	Trip trip = new Trip();
    	
    	//trip.setFareMedia(fareMedia);
    	//trip.setFareProduct(fareProduct);
    	
    	//trip.setStops(stops);
    	//trip.setTravellers(travellers);
    	msg.setTrip(trip);
    	
    	io.swagger.model.mobility.onselect.Message m = new io.swagger.model.mobility.onselect.Message();
    	Service s = new Service();
    	s.setId("Service1");
    	io.swagger.model.mobility.onselect.Trip t = new io.swagger.model.mobility.onselect.Trip();
    	t.setId("TripId1");
    	
    	List<Traveller> tv = getTravellers();
    	
    	t.withTravellers(tv);
    	t.withDriver(new Driver().withRating(new Rating().withValue("5")));
    	Fare fare = getFare();
    	t.withFare(fare);
    	
    	//TODO set trip details here - nikhilW
    	m.withService(s).withTrip(t);
    	
		
		return m;
	}

	private Fare getFare() {
		Fare f = new Fare();
		f.setCurrency("INR");
		
		ComputedValue computedValue = new ComputedValue();computedValue.setFractional("00");computedValue.setIntegral("10");
		EstimatedValue estimatedValue =  new EstimatedValue();estimatedValue.setFractional("00");estimatedValue.setIntegral("20");
		ListedValue listedValue = new ListedValue();listedValue.setFractional("00");listedValue.setIntegral("30");
		
		OfferedValue offeredValue =  new OfferedValue(); offeredValue.setFractional("00");offeredValue.setIntegral("15");
		
		Amount amount =  new Amount();amount.setFractional("00");amount.setIntegral("20");
		Breakup breakup = new Breakup();breakup.setTitle("Net Amount");breakup.setAmount(amount);
		
		f.setBreakup(Arrays.asList(breakup));
		f.setEstimatedValue(estimatedValue);
		f.setListedValue(listedValue);
		f.setOfferedValue(offeredValue);
		
		return f;
	}

	private List<Traveller> getTravellers() {
		
		List<Traveller> l = new ArrayList<Traveller>();
		Traveller tv = new Traveller();
		Info i = new Info();
		i.setFirstName("Ramu");i.setFullName("Ramu Ghungru");i.setGender("M");i.setTitle("Dr");i.setDob("12/12/2002");
		
		Contact c = new Contact();
		c.setEmail("ramu@gmail.com");c.setMobile(new Mobile().withCountryCode("91").withNumber("1234567890"));
		
		i.withContact(c);
		i.withImage(new io.swagger.model.mobility.onselect.Image().withFormat(".jpg"));
		tv.withInfo(i);
    	
    	l.add(tv);
    	
    	return l;
	}

	private io.swagger.model.mobility.select.Service getService() {
		
		io.swagger.model.mobility.select.Service s = new io.swagger.model.mobility.select.Service();
		
		s.setId("Service1");
		
		
		return s;
	}

}
