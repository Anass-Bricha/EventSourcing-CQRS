package org.sid.commonapi.events.radarevents;

import lombok.Getter;
import org.sid.commonapi.events.BaseEvent;
@Getter

public class RadarDeletedEvent extends BaseEvent<Long> {

    public RadarDeletedEvent(Long id) {
        super(id);
    }
}
