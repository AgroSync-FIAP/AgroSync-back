package br.com.agrosync.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class AddressDTO {

    String number;

    String street;

    String neighborhood;

    String city;

    String state;

    String CEP;

    String country;

}
