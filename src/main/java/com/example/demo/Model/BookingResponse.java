package com.example.demo.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class BookingResponse {
    private int pnrNumber;
    private int seatNumber;
    private String coach;



   // @Override
    //public String toString() {
       // return "{" +
           //     "pnrNumber=" + pnrNumber +
           //     ", seatNumber=" + seatNumber +
           //     ", coach='" + coach + '\'' +
            //    '}';
   // }
}
