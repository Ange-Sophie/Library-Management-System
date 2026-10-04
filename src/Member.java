public abstract class Member {
    private int memberId;
    private String name;
    private String email;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }
    public abstract double calculateLateFees(int  lateDays);

}
