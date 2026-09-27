public class ClubTest {
    public static void main(String[] args) {
        SportsClub sports = new SportsClub("Sports Zone", 10);
        sports.addMember(5);
        System.out.println("SportsClub Name: " + sports.getName());
        System.out.println("SportsClub Budget: " + sports.determineBudget());

        sports.changeName("New Sports Zone"); // พยายามแก้ชื่อ
        System.out.println("SportsClub Name (After Change attempt): " + sports.getName());

        System.out.println("------------------------------------");

        MarketingClub marketing = new MarketingClub("Biz Market", 6, 1200);
        System.out.println("MarketingClub Budget (Initial > 1000): " + marketing.determineBudget());

        boolean deducted = marketing.useBudget(400);
        System.out.println("Used budget successfully? " + deducted);
        System.out.println("MarketingClub Budget (After deduction <= 1000): " + marketing.determineBudget());

        boolean overdrawn = marketing.useBudget(2000);
        System.out.println("Can overdraw budget? " + overdrawn);
    }
}