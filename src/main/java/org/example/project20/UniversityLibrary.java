package org.example.project20;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {

    public String returnBook() {
        int a = 10/0;
        System.out.println("Мы вернули книгу в UniversityLibrary");
        return "Война и мир";
    }
}
