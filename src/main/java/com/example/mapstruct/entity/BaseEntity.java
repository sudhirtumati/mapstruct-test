package com.example.mapstruct.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class BaseEntity {

    @EqualsAndHashCode.Include
    protected Long id;

    protected String uuid;
}
