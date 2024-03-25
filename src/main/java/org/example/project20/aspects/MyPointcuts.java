package org.example.project20.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(public String returnBook())")
    public void returnBook() {}
}
