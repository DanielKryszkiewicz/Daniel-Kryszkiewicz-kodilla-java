package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {

        //Given

        Library library = new Library("Library");
        Book book1 = new Book("book1", "author1", LocalDate.of(2022, 1, 1));
        Book book2 = new Book("book2", "author2", LocalDate.of(1966, 6, 23));
        Book book3 = new Book("book3", "author3", LocalDate.of(2001, 12, 4));
        library.books.add(book3);
        library.books.add(book2);
        library.books.add(book1);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("SoftClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("DeepClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());

    }
}

