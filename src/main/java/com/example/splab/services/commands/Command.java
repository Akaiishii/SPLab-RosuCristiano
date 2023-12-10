package com.example.splab.services.commands;

public interface Command<TReturn, TCommandContext> {
    public TReturn execute();
    public default void setCommandContext(TCommandContext commandContext){}
    public Command<TReturn, TCommandContext> getClone();
}
