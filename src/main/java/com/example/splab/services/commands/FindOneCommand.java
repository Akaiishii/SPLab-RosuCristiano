package com.example.splab.services.commands;

import lombok.Setter;
import com.example.splab.models.Repository;

public class FindOneCommand<T> implements Command<T, String> {
    private final Repository<T> repository;
    @Setter
    private String commandContext;

    public FindOneCommand(Repository<T> repository) {
        this.repository = repository;
    }
    private FindOneCommand(FindOneCommand<T> foc) {
        this.repository = foc.repository;
        this.commandContext = foc.commandContext;
    }

    @Override
    public T execute() {
        return repository.find(commandContext);
    }

    @Override
    public Command<T, String> getClone() {
        return new FindOneCommand<>(this);
    }
}
