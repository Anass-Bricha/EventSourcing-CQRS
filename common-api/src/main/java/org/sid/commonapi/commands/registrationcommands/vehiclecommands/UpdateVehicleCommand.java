package org.sid.commonapi.commands.registrationcommands.vehiclecommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.dtos.registrationdtos.vehicledtos.VehicleRequestDto;

@Getter
public class UpdateVehicleCommand extends BaseCommand<Long> {
    private VehicleRequestDto vehicleRequestDto;


    public UpdateVehicleCommand(VehicleRequestDto vehicleRequestDto) {
        super(vehicleRequestDto.getVehicleId());
        this.vehicleRequestDto = vehicleRequestDto;
    }
}
