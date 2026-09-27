public class Father extends Parent {
    private Mother wife;

    public Father(Mother wife) {
        super(0);
        this.wife = wife;
    }

    public Mother getWife() {
        return this.wife;
    }

    @Override
    public String getFirstName() {
        return "Mr." + this.firstName;
    }
}