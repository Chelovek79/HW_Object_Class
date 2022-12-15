public class Main {

    public static void main(String[] args) {

    Author bookAuthor_001 = new Author("Лев","Толстой");
    Author bookAuthor_002 = new Author("Гарри","Гаррисон");
    Author bookAuthor_003 = new Author("Лев","Толстой");

    Book book_001 = new Book("Воскресение", 1899, bookAuthor_001);
    Book book_002 = new Book("Стальная крыса", 1961, bookAuthor_002);
    Book book_003 = new Book("Живой труп", 1900, bookAuthor_003);

    book_002.setYearpublish(1989);

        System.out.println(bookAuthor_001);

        System.out.println(book_001);
        System.out.println(book_002);

        System.out.println(bookAuthor_001.equals(bookAuthor_003));
        System.out.println(book_001.equals(book_003));

    }
}