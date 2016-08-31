

public class LibraryMain {

    public static void main(String[] args) {
        Library lib = new Library();

        boolean isLent = lib.getBook().isLent();
        
        System.out.println("Initilized - Book is lent: " + isLent);
        
        MaliciousClient mClient = new MaliciousClient();
        isLent = mClient.checkBookLent(lib);
        System.out.println("MaliciousClient - Book is lent: " + isLent);
        
        NormalClient nClient = new NormalClient();
        isLent = nClient.checkBookLent(lib);
        System.out.println("NormalClient - Book is lent: " + isLent);
    }

}
