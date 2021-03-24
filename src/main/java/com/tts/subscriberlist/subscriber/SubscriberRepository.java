package com.tts.subscriberlist.subscriber;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//We aren't actually making a repository class....
//We are describing what one should be and thymeleaf will make it for us
public interface SubscriberRepository extends CrudRepository<Subscriber, Long>
{
	//I can add query methods to this, all will start with findBy___();
	//select * from SUBSCRIBER where lastName = 'x' ;
	List<Subscriber> findBylastName(String lastname);
}
