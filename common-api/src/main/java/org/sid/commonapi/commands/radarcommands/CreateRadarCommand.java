package org.sid.commonapi.commands.radarcommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.dtos.radardtos.RadarRequestDto;

@Getter
public class CreateRadarCommand extends BaseCommand<Long> {
    private RadarRequestDto radarRequestDto;

    public CreateRadarCommand(RadarRequestDto radarRequestDto) {
        super(radarRequestDto.getRadarId());
        this.radarRequestDto = radarRequestDto;
    }
}
