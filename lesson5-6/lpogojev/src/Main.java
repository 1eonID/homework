public class Main {
    public static void main(String ...args) {
        Book LOTR = new Book("Lord of the rings: The Fellowship of the Ring",
                "J. R. R. Tolkien", 100);
        Book algorithms = new Book("Algorithms, 4th Edition", "Robert Sedgewick",
                "Kevin Wayne", 120);
        Book anCombinatorics = new Book("Analytic combinatorics", "Robert Sedgewick",
                "Philippe Flajolet", 90);
        Author Tolkien = new Author("J. R. R. Tolkien");
        Author Sedgewick = new Author("Robert Sedgewick", "rs@cs.princeton.edu");
        Author Wayne = new Author("Kevin Wayne", "wayne@cs.princeton.edu");

        System.out.println(Book.toString(LOTR));
        System.out.println(Book.toString(algorithms));
        System.out.println(LOTR.equals(algorithms));
        System.out.println(algorithms.equals(anCombinatorics));

        System.out.println(Author.toString(Tolkien));
        System.out.println(Author.toString(Sedgewick));
        System.out.println(Tolkien.equals(Tolkien));
        System.out.println(Sedgewick.equals(Wayne));
    }

    public static class Book {
        String bookName;
        String authorName1, authorName2, authorName3;
        int price;
        public Book(String bookName, String authorName1, int price) {
            this.bookName = bookName;
            this.authorName1 = authorName1;
            this.price = price;
        }

        public Book(String bookName, String authorName1, String authorName2, int price) {
            this.bookName = bookName;
            this.authorName1 = authorName1;
            this.authorName2 = authorName2;
            this.price = price;
        }

        public Book(String bookName, String authorName1, String authorName2, String authorName3, int price) 
{
            this.bookName = bookName;
            this.authorName1 = authorName1;
            this.authorName2 = authorName2;
            this.authorName3 = authorName3;
            this.price = price;
        }

        boolean equals(Book that) {
            if (this == that) return true;
            return bookName == that.bookName;
        }

        public static String toString(Book book) {
            String str;
            if (book.authorName2 != null && book.authorName3 == null) {
                str = (book.bookName + ", authors: " + book.authorName1
                        + ", " + book.authorName2 + ", price: " + book.price);
            } else if (book.authorName2 != null && book.authorName3 != null) {
                str = (book.bookName + ", authors: " + book.authorName1
                        + ", " + book.authorName2 + ", " + book.authorName3 + ", price: " + book.price);
            } else {
                str = (book.bookName + ", author: " + book.authorName1
                         + ", price: " + book.price);
            }
        return str;
      }
    }

    public static class Author {
        String name, email;
        public Author(String name) {
            this.name = name;
        }
        public Author(String name, String email) {
            this.name = name;
            this.email = email;
        }

        boolean equals(Author that) {
            if (this == that) return true;
            return name == that.name;
        }

        public static String toString(Author author) {
            String str;
                if (author.email != null) {
                    str = (author.name + ", e-mail: " + author.email);
                } else {
                    str = (author.name);
                }
            return str;
        }
    }
}
