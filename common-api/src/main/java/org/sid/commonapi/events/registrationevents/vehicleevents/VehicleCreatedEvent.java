package org.sid.commonapi.events.registrationevents.vehicleevents;

import lombok.Getter;
import org.sid.commonapi.dtos.registrationdtos.vehicledtos.VehicleRequestDto;
import org.sid.commonapi.events.BaseEvent;

@Getter
public class VehicleCreatedEvent extends BaseEvent<Long> {
    private VehicleRequestDto vehicleRequestDto;


    public VehicleCreatedEvent(VehicleRequestDto vehicleRequestDto) {
        super(vehicleRequestDto.getVehicleId());
        this.vehicleRequestDto = vehicleRequestDto;
    }
}
