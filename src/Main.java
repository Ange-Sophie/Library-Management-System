public class Main {
    public static void main(String[] args) {

        Member student = new Student(1, "Sonia", "sonia@email.com");
        Member publisher = new Publisher(2, "ABC Publishing", "abc@email.com");
        Member librarian = new Librarian(3, "John", "john@email.com");

        System.out.println(student.calculateLateFees(3));
        System.out.println(publisher.calculateLateFees(3));
        System.out.println(librarian.calculateLateFees(3));

        Repository<Book> bookRepository = new Repository<>();
        Book book1 = new Book(
                1,
                "Java Programming",
                "John Smith",
                "Programming",
                2025,
                null,
                true
        );
        Book book2 = new Book(
                2,
                "python",
                "sonia lola",
                "programming",
                2020,
                null,
                false
        );
        bookRepository.add(book1);
        bookRepository.add(book2);
        System.out.println(bookRepository.getAll());
    }
}