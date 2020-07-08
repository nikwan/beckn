package io.swagger.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.Context;
import io.swagger.model.Context.ActionEnum;
import io.swagger.model.Domain;
import io.swagger.model.Intent;
import io.swagger.model.Item;
import io.swagger.model.Message;
import io.swagger.model.Provider;
import io.swagger.model.search.test.SearchMobility;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		try {
			t.testSearch();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testSearch() throws JsonProcessingException {
		Context c = new Context();
		
		
		c.setAction(ActionEnum.SEARCH);
		c.setDomain(Domain.MOBILITY);
		c.setMessageId("MessageID123");
		//c.setTimestamp(OffsetDateTime.now());
		c.setTransactionId("TransactionID");
		c.setVersion("0.0.8");
		
		Message msg = new Message();
		Intent i = new Intent();

		Item item = new Item();
		item.setId("xyz");
		
		Provider p = new Provider();
		p.setId("PV12345");
		
		i.setItem(item);
		i.setProvider(p);

		msg.setIntent(i);
		
		SearchMobility s =  new SearchMobility();
		
		s.setContext(c);
		s.setMessage(msg);
		
		ObjectMapper map =  new ObjectMapper();
				
		String r = map.writerWithDefaultPrettyPrinter().writeValueAsString(s);
		
		System.out.println(r);
				
	}

}
