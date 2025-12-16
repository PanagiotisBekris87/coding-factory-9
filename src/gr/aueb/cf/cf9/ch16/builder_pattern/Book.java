package gr.aueb.cf.cf9.ch16.builder_pattern;

/**
 * Builder design pattern.
 */
public class Book {

    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    private Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }


    // Nested Class - Builder
    public static class Builder {

        private final long id;
        private final String isbn;
        private String title = "";
        private String author = "";


        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // Ειδικοί setters
        // Fluent Setter - returns the builder object - chaining
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    // το Book εν τέλη δίνει μόνο getters οπότε είναι πράγματι immutable.
    // και γίνεται initialize μόνο μέσω του Builder

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
