public class BookTest {
    public static void main(String[] args) {
        Author[] authors = {
            new Author("John Doe", "john@example.com", 'M'),
            new Author("Jane Smith", "jane@example.com", 'F')
        };

        Book book = new Book("Java Programming", authors, 49.99, 10);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Book Quantity: " + book.getQty());

        String[] authorNames = book.getAuthorNames();
        System.out.print("Author Names: ");
        for (String name : authorNames) {
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println("Book Details: " + book.toString());

        book.setPrice(54.99);
        book.setQty(15);

        System.out.println(book);
    }
}    