package com.example.demo.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingRequestTest {
    private BookingRequest br=new BookingRequest();

    @BeforeEach
    void setUp() {
       // br = new BookingRequest();
    }


@Test
   public void nameTest(){
      br.setName("name");
     assertEquals("name",br.getName());
     System.out.println(br.getName());
  }
    @Test
    public void ageTest(){
        br.setAge("21");
        assertEquals("21",br.getAge());
        System.out.println(br.getAge());
    }
    @Test
    public void emailTest(){
        br.setEmail("name@gmail.com");
        assertEquals("name@gmail.com",br.getEmail());
        System.out.println(br.getEmail());
    }
    @Test
    public void sourceTest(){
        br.setSource("kkd");
        assertEquals("kkd",br.getSource());
        System.out.println(br.getSource());
    }
    @Test
    public void DestinationTest(){
        br.setDestination("Rjy");
        assertEquals("Rjy",br.getDestination());
        System.out.println(br.getDestination());
    }
    @Test
    public void IdTest(){
        br.setId("23");
        assertEquals("23",br.getId());
        System.out.println(br.getId());
    }



//    @Test
//    public void whenValidName_thenNameShouldFound(){
//        String br="name";
//        String found= br.
//        assertEquals("name",Str
//    }

}