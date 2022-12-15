import java.util.Objects;

public class Book {

    private String nameBook;
    private int yearpublish;
    private Author author;

    public Book (String nameBook, int yearpublish, Author author) {
        this.nameBook = nameBook;
        this.yearpublish = yearpublish;
        this.author = author;
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
    @Override
    public String toString() {
        return nameBook + ". " + author + ". Год издания: " + yearpublish ;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearpublish == book.yearpublish && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearpublish, author);
    }
}
