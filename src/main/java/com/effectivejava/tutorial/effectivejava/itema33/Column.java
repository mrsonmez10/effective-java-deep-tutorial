package com.effectivejava.tutorial.effectivejava.itema33;

public class Column<T> {

    private final Class<T> type;

    public Column(Class<T> type) 
    {
        this.type = type;
    }

    public T cast(Object obj) 
    {
        return obj == null ? null : type.cast(obj);
    }
    
}