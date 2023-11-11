package br.com.agrosync.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UserRegisterDTO {

    String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    String birthday;

    String username;

    String email;

    String password;

    AddressDTO address;

    PhoneDTO phone;
}
