public class Book {

    private String nameBook;
    private int yearpublish;
    private Author author;

    public Book (String nameBook, int yearpublish, Author author) {
        this.nameBook = nameBook;
        this.yearpublish = yearpublish;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setYearpublish(int yearpublish) {
        this.yearpublish = yearpublish;
    }

    public int getYearpublish() {
        return yearpublish;
    }
}
