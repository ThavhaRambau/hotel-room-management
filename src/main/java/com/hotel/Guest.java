package com.hotel;

import jakarta.persistence.*;


@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;

    private String name;
    private String phone;
    private String email;

    // getters and setters
}
