package com.mkanchwala;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkanchwala.domain.BusinessObject;
import com.mkanchwala.domain.BusinessObjects;
import com.mkanchwala.domain.PolymorphicBusinessObjectMixIn;

/**
 * 
 {
    "businessobjects": [
        {
        	"id":1,
        	"objType": "person",
            "name": "ABC",
            "gender": "M"
        },
        {
        	"id":2,
            "objType": "address",
            "address1": "H",
            "address2": "Apt"
        }
    ]
 }
 *
 * @author mkanchwala
 */
public class SerializationApp {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.addMixInAnnotations(BusinessObject.class, PolymorphicBusinessObjectMixIn.class);
		BusinessObjects businessObjects = mapper.readValue(new File("src/main/resources/businessobject.json"), BusinessObjects.class);
		System.out.println(mapper.writeValueAsString(businessObjects));
	}
}
