package services;

import dto.BookDto;
import model.Author;
import model.Book;
import repositories.BooksRepository;
import repositories.IBooksRepository;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService {

    private final IBooksRepository repository;

    public BookService() {
        repository = new BooksRepository();
    }

    @Override
    public void addBook(BookDto book) {
        Book bookToRepository = new Book();
        bookToRepository.setAuthor(new Author(book.getAuthorName()));
        bookToRepository.setBorrow(book.isBorrowed());
        bookToRepository.setTitle(book.getTitle());
        bookToRepository.setIsbn(book.getIsbn());
        bookToRepository.setSummary(book.getSummary());
        bookToRepository.setCategory("Category");
        repository.save(bookToRepository);
    }

    @Override
    public void deleteBook(BookDto book) {

    }

    @Override
    public void editBook(BookDto book) {

    }

    @Override
    public List<BookDto> showBooks() {
        List<Book> allBooks = repository.findAll();
        List<BookDto> listToReturn = new ArrayList<>();
        for (Book book:allBooks) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getBookId());
            bookDto.setAuthorName(book.getAuthor().getFirstName()+" "+book.getAuthor().getLastName());
            bookDto.setBorrowed(book.isBorrow());
            bookDto.setIsbn(book.getIsbn());
            bookDto.setSummary(book.getSummary());
            bookDto.setTitle(book.getTitle());
            listToReturn.add(bookDto);
        }
        return listToReturn;
    }
}
