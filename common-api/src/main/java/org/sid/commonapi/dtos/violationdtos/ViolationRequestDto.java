package org.sid.commonapi.dtos.violationdtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ViolationRequestDto {
    private Long violationId;
    private Date violationDate;
    private Long radarId;
    private String regNumber;
    private double speed;
    private double radarMaxSpeed;
    private double violationFine;
}
