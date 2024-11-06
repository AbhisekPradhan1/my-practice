package com.Flight_Book.repository;

import com.Flight_Book.controller.FlightBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBookRepository extends MongoRepository <FlightBook,String>  {


      //  FlightBook findByResultIndex(String resultIndex);


}
