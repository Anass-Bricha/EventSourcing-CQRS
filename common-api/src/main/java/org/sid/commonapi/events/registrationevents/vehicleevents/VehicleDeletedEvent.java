package org.sid.commonapi.events.registrationevents.vehicleevents;

import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.events.BaseEvent;

public class VehicleDeletedEvent extends BaseEvent<Long> {

    public VehicleDeletedEvent(Long id) {
        super(id);
    }
}
