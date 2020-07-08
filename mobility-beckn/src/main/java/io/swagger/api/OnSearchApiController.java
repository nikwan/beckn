package io.swagger.api;

import java.util.Arrays;

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
import io.swagger.model.mobility.onsearch.Amount;
import io.swagger.model.mobility.onsearch.Brand;
import io.swagger.model.mobility.onsearch.Breakup;
import io.swagger.model.mobility.onsearch.Catalog;
import io.swagger.model.mobility.onsearch.ComputedValue;
import io.swagger.model.mobility.onsearch.Descriptor;
import io.swagger.model.mobility.onsearch.EstimatedValue;
import io.swagger.model.mobility.onsearch.FareProduct;
import io.swagger.model.mobility.onsearch.Image;
import io.swagger.model.mobility.onsearch.Landline;
import io.swagger.model.mobility.onsearch.ListedValue;
import io.swagger.model.mobility.onsearch.Message;
import io.swagger.model.mobility.onsearch.OfferedValue;
import io.swagger.model.mobility.onsearch.Poc;
import io.swagger.model.mobility.onsearch.Policy;
import io.swagger.model.mobility.onsearch.Price;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-29T10:47:12.208Z[GMT]")
@Controller
public class OnSearchApiController implements OnSearchApi {

    private static final Logger log = LoggerFactory.getLogger(OnSearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OnSearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> onSearchPost(@ApiParam(value = "TODO"  )  @Valid @RequestBody Object body
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
        		
        		//TODO get services - nikhilW
        		io.swagger.model.mobility.onsearch.Service[] services = getServices();
        		
        		//TODO set messgae - nikhilW
        		Message msg1 = new Message();
        		msg1.setServices(Arrays.asList(services));
        		
        		ctx.putPOJO("message", msg1);
        		
        		        		
        		return new ResponseEntity<Object>(m.writeValueAsString(ctx), HttpStatus.OK);
            	
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

	private io.swagger.model.mobility.onsearch.Service[] getServices() {
		io.swagger.model.mobility.onsearch.Service[] services = new io.swagger.model.mobility.onsearch.Service[1];
		
		io.swagger.model.mobility.onsearch.Service s = new io.swagger.model.mobility.onsearch.Service();
		
		io.swagger.model.mobility.onsearch.Provider provider = new io.swagger.model.mobility.onsearch.Provider();
		
		s.setId("Service1");
		
		io.swagger.model.mobility.onsearch.Info info = new io.swagger.model.mobility.onsearch.Info();
		info.setId("PROV1234"); info.setName("NSDL Mobility");
		
		Image img = new Image();
		img.setLabel("img1");img.setUrl("http://nsdl/images");
		info.setImages(Arrays.asList(img));
		
		Poc poc = new Poc();
		Image pocImg = new Image();pocImg.setUrl("http://nsdl/images");
		poc.setFirstName("Nikhil"); poc.setFullName("Nikhil DW");poc.setImage(pocImg);
		
		io.swagger.model.mobility.onsearch.Contact contact = new io.swagger.model.mobility.onsearch.Contact();
		Landline landline = new Landline();
		landline.setCountryCode("91");landline.setNumber("9372512233");
		
		contact.setLandline(landline);
		poc.setContact(contact);
		
		//set info and poc
		provider.setInfo(info);
		provider.setPoc(poc);
		
		//create catalog
		
		
		//create category
		io.swagger.model.mobility.onsearch.Category[] categories = new io.swagger.model.mobility.onsearch.Category[1];
		io.swagger.model.mobility.onsearch.Category cat = new io.swagger.model.mobility.onsearch.Category();
		Descriptor descriptor = new Descriptor();
		descriptor.setId("DSC1");descriptor.setName("Maruti Swift");descriptor.setLongDesc("Maruti Swift");descriptor.setImages(Arrays.asList(pocImg));
		cat.setId("CATID1");cat.setDescriptor(descriptor);
		
		//TODO create catalog
		Catalog catalog = new Catalog();
		catalog.setId("CATALOG1");
		
		//TODO get categories - nikhilW
		categories[0] = cat;
		catalog.setCategories(Arrays.asList(categories));
		//s.setCategories(Arrays.asList(categories));
		
		//TODO get items - nikhilW
		io.swagger.model.mobility.onsearch.Item[] items =  getItems(pocImg);
		
		//TODO get brands - nikhilW
		Brand[] brands = getBrands(pocImg);
		
		//TODO get fare products
		FareProduct[] fareProducts = getFareProducts(pocImg);
		
		catalog.setBrands(Arrays.asList(brands));
		catalog.setFareProducts(Arrays.asList(fareProducts));
		catalog.setItems(Arrays.asList(items));
		
		
		//TODO set provider - nikhilW
		s.setProvider(provider);
		
		//TODO set catalog
		s.setCatalog(catalog);
		
		//TODOS get/set policies
		Policy[] policies = getPolicies(pocImg);
		s.setPolicies(Arrays.asList(policies));
		
		//TODO set service array - nikhilW
		services[0] = s;
		
		return services;
	}

	private Policy[] getPolicies(Image pocImg) {
		Policy[] policies =  new Policy[1];
		Policy p = new Policy();
		Descriptor descriptor = new Descriptor();
		descriptor.setId("DSC1");descriptor.setName("Maruti Swift");descriptor.setLongDesc("Maruti Swift");descriptor.setImages(Arrays.asList(pocImg));
		
		p.setId("PolicyId");p.setDescriptor(descriptor);
		//p.setTerms(terms);
		policies[0] = p;
		return policies;
	}

	private FareProduct[] getFareProducts(Image pocImg) {
		
		FareProduct[] fareProducts = new FareProduct[1];
		Descriptor descriptor = new Descriptor();
		descriptor.setId("DSC1");descriptor.setName("Maruti Swift");descriptor.setLongDesc("Maruti Swift");descriptor.setImages(Arrays.asList(pocImg));
		FareProduct f = new FareProduct();
		f.setId("FAREProd_1");f.setDescriptor(descriptor);
		
		Policy policy = new Policy();
		policy.setDescriptor(descriptor);policy.setDescriptor(descriptor);
		//policy.setTerms(terms);
				
		fareProducts[0] = f;
		
		return fareProducts;
	}

	private Brand[] getBrands(Image pocImg) {
		Brand[] brands =  new Brand[1];
		
		Brand b = new Brand();
		Descriptor descriptor = new Descriptor();
		descriptor.setId("BRAND");descriptor.setName("Ford");descriptor.setLongDesc("Ford Icon");descriptor.setImages(Arrays.asList(pocImg));
		
		
		b.setId("BRAND_1"); b.setDescriptor(descriptor);
		
		brands[0] = b;
		
		return brands;
	}

	/*
	 * private Offer[] getOffers(Image pocImg) {
	 * 
	 * Offer[] offers = new Offer[1];
	 * 
	 * Offer of = new Offer(); String[] ids = {"id1", "id2"}; AppliesTo appliesTo =
	 * new
	 * AppliesTo();appliesTo.setScope("SERVICE");appliesTo.setIds(Arrays.asList(ids)
	 * ); Descriptor descriptor = new Descriptor();
	 * descriptor.setId("DSC1");descriptor.setName("Maruti Swift");descriptor.
	 * setLongDesc("Maruti Swift");descriptor.setImages(Arrays.asList(pocImg));
	 * 
	 * of.setId("OfferId1");of.setStartDate("2020-07-06T14:00:40.904Z");of.
	 * setEndDate("2020-07-16T14:00:40.904Z");of.setDescriptor(descriptor);of.
	 * setAppliesTo(appliesTo);
	 * 
	 * offers[0] = of;
	 * 
	 * return offers; }
	 */

	private io.swagger.model.mobility.onsearch.Item[] getItems(Image pocImg) {
		io.swagger.model.mobility.onsearch.Item[] items =  new io.swagger.model.mobility.onsearch.Item[1];
		
		io.swagger.model.mobility.onsearch.Item item = new io.swagger.model.mobility.onsearch.Item();
		Descriptor descriptor = new Descriptor();
		descriptor.setId("DSC1");descriptor.setName("Maruti Swift");descriptor.setLongDesc("Maruti Swift");descriptor.setImages(Arrays.asList(pocImg));
		item.setId("1_DSC1");item.setParentItemId("DSC1");item.setDescriptor(descriptor);
		Price price = new Price();
		
		ComputedValue computedValue = new ComputedValue();computedValue.setFractional("fractional");computedValue.setIntegral("integral");
		EstimatedValue estimatedValue =  new EstimatedValue();estimatedValue.setFractional("fractional");estimatedValue.setIntegral("integral");
		ListedValue listedValue = new ListedValue();listedValue.setFractional("fractional");listedValue.setIntegral("integral");
		OfferedValue offeredValue =  new OfferedValue(); offeredValue.setFractional("fractional");offeredValue.setIntegral("integral");
		
		Amount amount =  new Amount();amount.setFractional("fractional");amount.setIntegral("integral");
		Breakup breakup = new Breakup();breakup.setTitle("Net Amount");breakup.setAmount(amount);
		
		price.setComputedValue(computedValue);price.setEstimatedValue(estimatedValue);price.setListedValue(listedValue);price.setOfferedValue(offeredValue);
		price.setBreakup(Arrays.asList(breakup));
		
		item.setPrice(price);
		
		items[0] = item;
		
		return items;
	}

}
