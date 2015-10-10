package com.mkanchwala.domain;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.mkanchwala.domain.Person;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objType")
@JsonSubTypes({ 
	@Type(value = Person.class, name = "person"), 
	@Type(value = Address.class, name = "address") 
	})
public abstract class PolymorphicBusinessObjectMixIn {

}