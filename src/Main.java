public class Main {

    public static void main(String[] args) {

    Author bookAuthor_001 = new Author("Лев","Толстой");
    Author bookAuthor_002 = new Author("Гарри","Гаррисон");

    Book book_001 = new Book("Воскресение", 1899, bookAuthor_001);
    Book book_002 = new Book("Стальная крыса", 1961, bookAuthor_002);

    book_002.setYearpublish(1989);

        System.out.println(book_001.getNameBook() + " " + bookAuthor_001.getName() + " " + bookAuthor_001.getSurname() +
                " " + book_001.getYearpublish());
        System.out.println(book_002.getNameBook() + " " + bookAuthor_002.getName() + " " + bookAuthor_002.getSurname() +
                " " + book_002.getYearpublish());
    }
}