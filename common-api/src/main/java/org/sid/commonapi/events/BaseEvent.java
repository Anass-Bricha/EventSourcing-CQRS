package org.sid.commonapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@AllArgsConstructor
public abstract class BaseEvent<T> {
    @Getter private T id;
}
