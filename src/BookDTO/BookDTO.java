package BookDTO;

public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int price;

    public BookDTO(String isbn, String title, String author, String publisher, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // Getters and Setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() {
        return "*"+"ISBN: " + isbn + ", Title: " + title + ", Author: " + author +
                ", Publisher: " + publisher + ", Price: " + price;
    }
}
