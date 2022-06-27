package com.example.demo.Service;


import com.example.demo.Model.BookingResponse;
import com.example.demo.Model.BookingRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@org.springframework.stereotype.Service
public class Service {
  Map<String, BookingRequest> allUsers = new HashMap<>();
    BookingRequest addValue;
    BookingResponse pnrStatus;
    Random random = new Random();

    public Map<String, BookingRequest> getAll() {
        return allUsers;
    }

    public BookingResponse getDataByPnr(String pnr) {
        if(allUsers.containsKey(pnr)){
            return allUsers.get(pnr).getPnrStatus();
        }
        return null;
    }

    public String addUser(BookingRequest userdetails) {
        System.out.println("user:"+userdetails);
        int pnr = random.nextInt(1000);
        allUsers.put (String.valueOf(pnr),
                BookingRequest.builder().name(userdetails.getName()).age(userdetails.getAge()).id(userdetails.getId()).date(userdetails.getDate()).destination(userdetails.getDestination()).source(userdetails.getSource()).email(userdetails.getEmail())
                .pnrStatus(BookingResponse.builder().pnrNumber(pnr)
                        .seatNumber(random.nextInt(99))
                        .coach((char)(random.nextInt(26)+'a') + String.valueOf(random.nextInt(15)))
                        .build())
                .build());

//        addValue.setName (userdetails.getName());
//        addValue.setAge (userdetails.getAge());
//        addValue.setEmail(userdetails.getEmail());
//        addValue.setId(userdetails.getId());
//        addValue.setDate(userdetails.getDate());
//        addValue.setSource(userdetails.getSource());
//        addValue.setDestination(userdetails.getDestination());
//        int pnr =  random.nextInt(10000);
//        int seatNumber = random.nextInt(99);
//        String coach = (char)(random.nextInt(26)+'a') + String.valueOf(random.nextInt(15));
//        addValue.setPnrStatus(new BookingResponse(pnr,seatNumber,coach));


        return "user added";
    }
    }

