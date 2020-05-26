package com.example.mapstruct.dto;

import lombok.Data;

@Data
public class CustomerDTO {

    protected Long id;

    protected String uuid;

    private String login;

    private String password;
}
