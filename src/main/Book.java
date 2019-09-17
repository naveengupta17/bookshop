package main;

class Book {
    String bookName;
    String authorName;
    String isbn;

    public Book(String bookName, String authorName, String isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String b) {
        bookName = b;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String a) {
        authorName = a;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String i) {
        isbn = i;
    }

    public String toString() {
        return "-----------------------------" + "\n" +
                "Author Name:\t" + getAuthorName() + "\n" +
                "ISBN:\t" + getIsbn() + "\n" +
                "-----------------------------";
    }
}
