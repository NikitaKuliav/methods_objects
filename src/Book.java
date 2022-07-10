public class Book {

    private final String bookTitle;
    private final Author author;
    private int publishYear;

    public Book(String bookTitle, Author author, int publishYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int newYear) {
        this.publishYear = newYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) {
            return true;
        } else if (this.bookTitle == ob.getBookTitle() && this.author == ob.getAuthor() && this.publishYear == ob.getPublishYear()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.bookTitle.hashCode();
    }

    @Override
    public String toString() {
        return "Название книги: " + this.bookTitle + ". " + "Год выпуска: " + this.publishYear;
    }
}
