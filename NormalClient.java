

public class NormalClient {

    public boolean checkBookLent(Library lib) {
        return lib.getBook().isLent();       
    }
}
