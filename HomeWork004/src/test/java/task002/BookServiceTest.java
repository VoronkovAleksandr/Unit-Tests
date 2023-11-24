package task002;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        //Перед каждым тестом создаем
        //mock BookRepository с помощью Mockito
        //и экземпляр BookService на его основе
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @AfterEach
    void tearDown() {
        //После каждого теста обнуляем
        //mock BookRepository и BookService
        bookRepository = null;
        bookService = null;

    }

    @Test
    void findBookById() {
        //Вызываем метод findBookById
        bookService.findBookById("1");
        //Проверяем что метод findById был вызван с правильными аргументами
        verify(bookRepository).findById("1");
    }

    @Test
    void findAllBooks() {
        //Вызываем метод findAllBooks
        bookService.findAllBooks();
        //Проверяем что метод findAll был вызван с правильными аргументами
        verify(bookRepository).findAll();
    }
}