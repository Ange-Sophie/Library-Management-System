public class Librarian extends Member {

    public Librarian(int memberId, String name, String email) {
        super(memberId, name, email);
    }
    @Override
    public double calculateLateFees(int  lateDays) {
        return 0;
    }
}
