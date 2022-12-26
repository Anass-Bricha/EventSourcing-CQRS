package org.sid.ownercommandside.controllers;


import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.sid.commonapi.commands.registrationcommands.ownercommands.CreateOwnerCommand;
import org.sid.commonapi.commands.registrationcommands.ownercommands.DeleteOwnerCommand;
import org.sid.commonapi.commands.registrationcommands.ownercommands.UpdateOwnerCommand;
import org.sid.commonapi.dtos.registrationdtos.ownerdtos.OwnerRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
@RequestMapping("/owners/command")
public class OwnerCommandController {
    private CommandGateway commandGateway;

    @PostMapping("/create")
    public CompletableFuture<String> createOwner(@RequestBody OwnerRequestDto ownerRequestDto) {
        CompletableFuture<String> response = commandGateway.send(
                new CreateOwnerCommand(
                        UUID.randomUUID().toString(),
                        ownerRequestDto.getName(),
                        ownerRequestDto.getBirthDate(),
                        ownerRequestDto.getEmail())
        );
        return response;
    }


    @PutMapping("/update")
    public CompletableFuture<String> updateOwner(@RequestParam String id,@RequestBody OwnerRequestDto ownerRequestDto){
        CompletableFuture<String> response = commandGateway.send(
                new UpdateOwnerCommand(
                        id,
                        ownerRequestDto.getName(),
                        ownerRequestDto.getBirthDate(),
                        ownerRequestDto.getEmail()
                )
        );
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public CompletableFuture<String> deleteOwner(@PathVariable String id){
        CompletableFuture<String> response = commandGateway.send(new DeleteOwnerCommand(id));
        return response;
    }
}
