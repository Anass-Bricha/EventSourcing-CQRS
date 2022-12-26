package org.sid.commonapi.commands.registrationcommands.ownercommands;

import lombok.Getter;
import org.sid.commonapi.commands.BaseCommand;
import org.sid.commonapi.dtos.registrationdtos.ownerdtos.OwnerRequestDto;

@Getter
public class UpdateOwnerCommand extends BaseCommand<String> {
    private String name;
    private String birthDate;
    private String email;

    public UpdateOwnerCommand(String id,String name, String birthDate, String email) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }


}
