package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class BookingRequest {
    private String name;
    private String age;
    private String id;
    private String date;
    private String source;
    private String destination;
    private String email;
    private BookingResponse pnrStatus;

//    public BookingRequest() {
//
//    }
}
