package org.sid.commonapi.commands.violationcommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.dtos.violationdtos.ViolationRequestDto;

@Getter
public class CreateViolationCommand extends BaseCommand<Long> {
    private ViolationRequestDto violationRequestDto;

    public CreateViolationCommand(ViolationRequestDto violationRequestDto) {
        super(violationRequestDto.getViolationId());
        this.violationRequestDto = violationRequestDto;
    }
}
