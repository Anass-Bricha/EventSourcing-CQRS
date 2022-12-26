package org.sid.commonapi.commands.registrationcommands.vehiclecommands;

import org.sid.commonapi.commands.BaseCommand;

public class DeleteVehicleCommand extends BaseCommand<Long> {

    public DeleteVehicleCommand(Long id) {
        super(id);
    }
}
