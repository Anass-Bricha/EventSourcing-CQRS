package org.sid.commonapi.dtos.registrationdtos.vehicledtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class VehicleRequestDto {
    private Long vehicleId;
    private String regNumber;
    private String brand;
    private int horsePower;
    private String model;
}
