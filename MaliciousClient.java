

public class MaliciousClient {
    public boolean checkBookLent(Library lib) {                
        Book book = lib.getBook();
        book.setLent(true);        
        return book.isLent();
    }
}
