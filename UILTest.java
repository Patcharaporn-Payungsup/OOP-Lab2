public class UILTest {
    public static void main(String[] args) {
        Mother mom = new Mother();
        mom.setFirstName("Alice");
        System.out.println(mom.getFirstName());
        Father dad = new Father(mom);
        dad.setFirstName("Bob");
        System.out.println(dad.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName()); 
    }
}