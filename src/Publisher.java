public class Publisher extends Member {


    public Publisher(int memberId, String name, String email) {
        super(memberId, name, email);
    }
    @Override
    public double calculateLateFees(int  lateDays) {
        return lateDays *1000;
    }
}
