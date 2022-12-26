package org.sid.commonapi.events.registrationevents.vehicleevents;

import lombok.Getter;
import org.sid.commonapi.dtos.registrationdtos.vehicledtos.VehicleRequestDto;
import org.sid.commonapi.events.BaseEvent;

@Getter
public class VehicleUpdatedEvent extends BaseEvent<Long> {
    private VehicleRequestDto vehicleRequestDto;


    public VehicleUpdatedEvent(VehicleRequestDto vehicleRequestDto) {
        super(vehicleRequestDto.getVehicleId());
        this.vehicleRequestDto = vehicleRequestDto;
    }
}
