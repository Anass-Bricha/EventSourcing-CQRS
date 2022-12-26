package org.sid.commonapi.events.registrationevents.ownerevents;

import lombok.Getter;
import org.sid.commonapi.dtos.registrationdtos.ownerdtos.OwnerRequestDto;
import org.sid.commonapi.events.BaseEvent;

import java.util.Date;
@Getter
public class OwnerCreatedEvent extends BaseEvent<String> {
    private String name;
    private String birthDate;
    private String email;

    public OwnerCreatedEvent(String id, String name, String birthDate, String email) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }


}
