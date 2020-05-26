package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.CustomerDTO;
import com.example.mapstruct.entity.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerMapperTests {

	private CustomerMapper customerMapper = new CustomerMapperImpl();

	@Test
	void given_customer_entity_mapper_should_map_all_fields_to_customer_dto() {
		Customer customer = new Customer();
		customer.setLogin("Login");
		customer.setPassword("Password");
		customer.setId(10l);
		customer.setUuid("UUID");
		CustomerDTO customerDTO = customerMapper.toDto(customer);
		assertThat(customerDTO.getId()).isEqualTo(10l);
		assertThat(customerDTO.getUuid()).isEqualTo("UUID");
		assertThat(customerDTO.getLogin()).isEqualTo("Login");
		assertThat(customerDTO.getPassword()).isEqualTo("Password");
	}

	@Test
	void given_customer_dto_mapper_should_map_all_fields_to_customer_entity() {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setLogin("Login");
		customerDTO.setPassword("Password");
		customerDTO.setId(10l);
		customerDTO.setUuid("UUID");
		Customer customer = customerMapper.toEntity(customerDTO);
		assertThat(customer.getId()).isEqualTo(10l);
		assertThat(customer.getUuid()).isEqualTo("UUID");
		assertThat(customer.getLogin()).isEqualTo("Login");
		assertThat(customer.getPassword()).isEqualTo("Password");
	}

}
