package com.infnet.br.user.validation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Long id;
    private String name;
    private String lastName;
    private String zipCode;
    private Integer number;

}
