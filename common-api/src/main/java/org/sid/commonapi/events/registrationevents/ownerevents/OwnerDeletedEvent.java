package org.sid.commonapi.events.registrationevents.ownerevents;

import lombok.Getter;
import org.sid.commonapi.events.BaseEvent;
@Getter

public class OwnerDeletedEvent extends BaseEvent<String> {

    public OwnerDeletedEvent(String id) {
        super(id);
    }
}
