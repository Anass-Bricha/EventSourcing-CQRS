package org.sid.commonapi.commands.radarcommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;

@Getter
public class DeleteRadarCommand extends BaseCommand<Long> {

    public DeleteRadarCommand(Long id) {
        super(id);
    }
}
