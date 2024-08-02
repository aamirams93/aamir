package com.image.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.image.binding.Address;
import com.image.binding.Persons;

public class ConvertJavaTOXML
{
	public static void main(String[] args) throws Exception
	{
		Address ad = new Address();
		ad.setCountryName("India");
		ad.setCity("Kne");
		ad.setPinCode(855108);

		Persons p = new Persons();
		p.setId(101);
		p.setName("aamur");
		p.setAge(18);
		p.setPhoneNo("8982");
		p.setAddress(ad);

		JAXBContext instance = JAXBContext.newInstance(Persons.class);
		Marshaller m = instance.createMarshaller();
		m.marshal(p, new File("Persons.xml"));
		System.out.println("Marshalling completeed...!!");
	}
}
