package br.com.agrosync.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PhoneDTO {

    String number;

    String DDI;

    String DDD;
}
