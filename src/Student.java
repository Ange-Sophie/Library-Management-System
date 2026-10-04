public class Student extends  Member {

    public Student(int memberId, String name, String email) {
        super(memberId, name, email);
    }
    @Override
    public double calculateLateFees(int lateDays) {
        return lateDays * 500;
    }
}
