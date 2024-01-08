package com.example.splab.commands;

import lombok.Setter;
import com.example.splab.persistence.CrudRepository;

public class FindOneCommand<T> implements Command<T, Long> {
    private final CrudRepository<T, Long> repository;
    @Setter
    private Long commandContext;

    public FindOneCommand(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }
    private FindOneCommand(FindOneCommand<T> foc) {
        this.repository = foc.repository;
        this.commandContext = foc.commandContext;
    }

    @Override
    public T execute() {
        return repository.findById(commandContext);
    }

    @Override
    public Command<T, Long> getClone() {
        return new FindOneCommand<>(this);
    }
}
