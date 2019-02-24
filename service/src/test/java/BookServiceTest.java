import dto.BookDto;
import model.Author;
import model.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import repositories.IBooksRepository;
import services.BookService;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    IBooksRepository booksRepository = Mockito.mock(IBooksRepository.class);

    BookService bookService = new BookService(booksRepository);

    @Before
    public void initializeMockito(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIfBookDtosIsCorrectBasedOnBookFromDb(){

        Book book = new Book(false,"Category","dfawf2",
                "summary","title",new Author("mamma mia"));

        Mockito.when(booksRepository.find(Mockito.any(Integer.class)))
                .thenReturn(book);


        BookDto bookDto = bookService.findBook(2);
        BookDto expected = new BookDto("title","mamma mia"
                ,"dfawf2","summary",false);

        Assert.assertEquals(bookDto,expected);

    }
}
