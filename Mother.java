public class Mother extends Parent {
    private Father husband;

    public Mother() {
        super(0);
    }

    public void setHusband(Father husband) {
        this.husband = husband;
    }

    public Father getHusband() {
        return this.husband;
    }

    @Override
    public String getFirstName() {
        return "Ms. " + this.firstName;
    }
}