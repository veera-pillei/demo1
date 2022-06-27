package com.example.demo.Controller;

import com.example.demo.Model.BookingResponse;
import com.example.demo.Model.BookingRequest;
import com.example.demo.Service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;



@RestController
@RequestMapping("/users")

public class Controller {

@Autowired

    Service serve;
    private final Logger LOGGER=
            LoggerFactory.getLogger(Controller.class);
    @GetMapping

    public Map<String, BookingRequest> getMethod() {
        Map<String, BookingRequest> data = serve.getAll();
        System.out.println(data);
        return data;

    }
    @GetMapping("/{pnr}")
    public BookingResponse getID(@PathVariable String pnr){
        LOGGER.info("Getting details");
        BookingResponse data = serve.getDataByPnr(pnr);
        System.out.println(data);
        return data;
    }

    @PostMapping
    public String postMethod (@RequestBody BookingRequest userdetails) {
        LOGGER.info("Posting user details");
        System.out.println(userdetails);
        return serve.addUser(userdetails);
    }

    @PutMapping

    public String putMethod() {
        return "put method called";

    }
}
