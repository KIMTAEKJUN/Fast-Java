package ch21;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");

        copylibrary[0] = new Book();
        copylibrary[1] = new Book();
        copylibrary[2] = new Book();
        copylibrary[3] = new Book();
        copylibrary[4] = new Book();

        for(int i=0; i<library.length; i++) {
            copylibrary[i].setTitle(library[i].getTitle());
            copylibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("== library ==");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copy library ==");
        for(Book book : copylibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
