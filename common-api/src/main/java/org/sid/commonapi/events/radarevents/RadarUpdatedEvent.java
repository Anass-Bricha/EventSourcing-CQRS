package org.sid.commonapi.events.radarevents;

import lombok.Getter;
import org.sid.commonapi.events.BaseEvent;
@Getter

public class RadarUpdatedEvent extends BaseEvent<Long> {
    private double maxSpeed;
    private double longitude;
    private double latitude;

    public RadarUpdatedEvent(Long id, double maxSpeed, double longitude, double latitude) {
        super(id);
        this.maxSpeed = maxSpeed;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
