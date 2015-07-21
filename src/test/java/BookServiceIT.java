import com.constgor.eepractice.ch02.Book;
import com.constgor.eepractice.ch02.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Assert;
import org.junit.Test;

public class BookServiceIT {
    @Test
    public void isMock(){
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("TestBookName", "TestDescription", 100500f);

        Assert.assertTrue(book.getNumber().startsWith("Mock"));
    }
}
