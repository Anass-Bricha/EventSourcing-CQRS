package org.sid.commonapi.dtos.registrationdtos.ownerdtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OwnerRequestDto {
    private String name;
    private String birthDate;
    private String email;
}
