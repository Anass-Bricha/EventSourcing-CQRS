package org.sid.commonapi.commands.radarcommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.dtos.radardtos.RadarRequestDto;

@Getter
public class UpdateRadarCommand extends BaseCommand<Long> {
    private RadarRequestDto radarRequestDto;

    public UpdateRadarCommand(RadarRequestDto radarRequestDto) {
        super(radarRequestDto.getRadarId());
        this.radarRequestDto = radarRequestDto;
    }
}
