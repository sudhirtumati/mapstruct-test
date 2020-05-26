package com.example.mapstruct.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends BaseEntity {

	private String login;

	private String password;

}
