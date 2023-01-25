package ru.hse.booklibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookLibraryTest {

    @Test
    void noBooksInitially() {
        BookLibrary bookLibrary = ...;

        assertEquals(0, bookLibrary.count());
    }

    @Test
    void bookSaved() {
        BookLibrary bookLibrary = ....;

        Book newBook = bookLibrary.saveOne(new Book(null, "Effective Modern C++", "Scott Meyers"));

        assertNotNull(newBook.id());
    }

}