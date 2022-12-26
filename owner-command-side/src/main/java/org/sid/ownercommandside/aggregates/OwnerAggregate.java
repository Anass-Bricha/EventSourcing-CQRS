package org.sid.ownercommandside.aggregates;

import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.sid.commonapi.commands.registrationcommands.ownercommands.CreateOwnerCommand;
import org.sid.commonapi.commands.registrationcommands.ownercommands.DeleteOwnerCommand;
import org.sid.commonapi.commands.registrationcommands.ownercommands.UpdateOwnerCommand;
import org.sid.commonapi.dtos.registrationdtos.ownerdtos.OwnerRequestDto;
import org.sid.commonapi.events.registrationevents.ownerevents.OwnerCreatedEvent;
import org.sid.commonapi.events.registrationevents.ownerevents.OwnerDeletedEvent;
import org.sid.commonapi.events.registrationevents.ownerevents.OwnerUpdatedEvent;

import java.util.UUID;

@Aggregate
@NoArgsConstructor
public class OwnerAggregate {
    @AggregateIdentifier
    private String ownerId;
    private String name;
    private String birthDate;
    private String email;

    @CommandHandler
    public OwnerAggregate(CreateOwnerCommand createOwnerCommand) {
        AggregateLifecycle.apply(new OwnerCreatedEvent(
                createOwnerCommand.getId(),
                createOwnerCommand.getName(),
                createOwnerCommand.getBirthDate(),
                createOwnerCommand.getEmail()

        ));
    }

    @EventSourcingHandler
    public void on(OwnerCreatedEvent event){
        this.ownerId = event.getId();
        this.name = event.getName();
        this.birthDate = event.getBirthDate();
        this.email = event.getEmail();
    }

    //update handlers
    @CommandHandler
    public void on(UpdateOwnerCommand updateOwnerCommand) {
        AggregateLifecycle.apply(new OwnerUpdatedEvent(
                updateOwnerCommand.getId(),
                updateOwnerCommand.getName(),
                updateOwnerCommand.getBirthDate(),
                updateOwnerCommand.getEmail()
        ));
    }

    @EventSourcingHandler
    public void on(OwnerUpdatedEvent event){
        this.ownerId = event.getId();
        this.name = event.getName();
        this.birthDate = event.getBirthDate();
        this.email = event.getEmail();
    }

    //delete handlers
    @CommandHandler
    public void on(DeleteOwnerCommand deleteOwnerCommand) {
        AggregateLifecycle.apply(new OwnerDeletedEvent(
                deleteOwnerCommand.getId()
        ));
    }

    @EventSourcingHandler
    public void on(OwnerDeletedEvent event){

    }
}
