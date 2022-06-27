package com.example.demo.Service;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.Model.BookingRequest;
import com.example.demo.Model.BookingResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
//before
    //after
    //test
    @Autowired
    private Service serve;
    BookingRequest book;
    @BeforeEach
    public void setup(){

        serve = new Service();
    }

    @AfterEach
    public void teardown(){
        System.out.println("Test is Done");
    }

    @Test
    public void shouldAddNewUserAndCheckStringReturn(){
        //given
        BookingRequest book = BookingRequest.builder().pnrStatus(BookingResponse.builder().build()).name("name").email("mail.com").source("source").destination("destination").age("age").id("id").date("date").build();

        //when
        String s =serve.addUser(book);
        //then
        assertThat(s).isEqualTo("user added");

    }
    @Test
    public void shouldCheckGetAllData(){
        //given
        BookingRequest book = BookingRequest.builder().pnrStatus(BookingResponse.builder().build()).name("name").email("mail.com").source("source").destination("destination").age("age").id("id").date("date").build();
        String s=serve.addUser(book);

      //  Map<String, BookingRequest> data = new HashMap<>();
       // data.put(String.valueOf(pnr),book);
        //when
        Map<String,BookingRequest> actual=serve.getAll();
        String pnr="";
      var l1=  actual.keySet();
        Iterator value=l1.iterator();
        while(value.hasNext()) {
             pnr = (String) value.next();
        }
        System.out.println(pnr);
        //then
        assertThat(actual.get(pnr).getName()).isEqualTo("name");
        assertThat(actual.get(pnr).getAge()).isEqualTo("age");
        assertThat(actual.get(pnr).getEmail()).isEqualTo("mail.com");
        assertThat(actual.get(pnr).getAge()).isEqualTo("age");
        assertThat(actual.get(pnr).getSource()).isEqualTo("source");
        assertThat(actual.get(pnr).getDestination()).isEqualTo("destination");

    }

//    @Test
//    public void shouldAddNewUserAndCHeckMap(){
//        BookingRequest book = BookingRequest.builder().pnrStatus(BookingResponse.builder().build()).name("name").email("mailmail.com").source("source").destination("destination").age("age").id("id").date("date").build();
//        serve.addUser(book);
//        Map<String,BookingRequest> data = serve.getAll();
//        for(String e: data.keySet()){
//            assertEquals(true, e.matches([+-]?=[0-9]+));
//            }

//        assertThat(data).isEqualTo(new HashMap<String,BookingRequest>());

//    @Test
//    public void shouldGetData(){
//        BookingRequest book = BookingRequest.builder().pnrStatus(BookingResponse.builder().build()).name("name").email("mailmail.com").source("source").destination("destination").age("age").id("id").date("date").build();
//        serve.addUser(book);
//        Map<String,BookingRequest> data = serve.getAll();
//
//        assertThat(data).isEqualTo(new HashMap<String,BookingRequest>());
//    }
////    @Test
//    public void whenValidName_thenNameShouldFound(){
//        String name="name";
//        BookingRequest found= serve.
//
//    }
}