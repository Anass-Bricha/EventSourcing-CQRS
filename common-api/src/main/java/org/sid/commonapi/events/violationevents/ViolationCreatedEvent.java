package org.sid.commonapi.events.violationevents;

import lombok.Getter;
import org.sid.commonapi.dtos.violationdtos.ViolationRequestDto;
import org.sid.commonapi.events.BaseEvent;

@Getter
public class ViolationCreatedEvent extends BaseEvent<Long> {
    private ViolationRequestDto violationRequestDto;

    public ViolationCreatedEvent(ViolationRequestDto violationRequestDto) {
        super(violationRequestDto.getViolationId());
        this.violationRequestDto = violationRequestDto;
    }
}
