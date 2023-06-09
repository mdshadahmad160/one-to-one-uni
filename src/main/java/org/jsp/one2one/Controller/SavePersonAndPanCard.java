package org.jsp.one2one.Controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.one2one.dto.PanCard;
import org.jsp.one2one.dto.Person;

public class SavePersonAndPanCard {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Shad");
		p.setAge(24);
		p.setPhone(78987);
		   
		PanCard card=new PanCard();
		card.setDob(LocalDate.parse("2000-01-15"));
		card.setNumber("CXUV657DE");
		card.setPincode(824201);
		p.setCard(card);//Here We Assign Pancard For Person For Mapping
	
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(p);
		transaction.begin();
		transaction.commit();
		System.out.println("Your Data Will Be Saved: ");
	}

}
