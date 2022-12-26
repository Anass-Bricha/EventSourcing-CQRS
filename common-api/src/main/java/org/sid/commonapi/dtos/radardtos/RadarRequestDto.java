package org.sid.commonapi.dtos.radardtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class RadarRequestDto {
    private Long radarId;
    private double maxSpeed;
    private double longitude;
    private double latitude;
}
