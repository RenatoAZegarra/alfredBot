public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Testing basicGreeting()
        String testGreeting = alfredBot.basicGreeting();
        System.out.println(testGreeting);
        
        // Testing guestGreeting()
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        System.out.println(testGuestGreeting);
        
        // Testing guestGreeting(String name, String dayPeriod)
        String testGuestGreetingWithPeriod = alfredBot.guestGreeting("Bruce Wayne", "evening");
        System.out.println(testGuestGreetingWithPeriod);
        
        // Testing guestGreeting() with dynamic day period
        String testDynamicGuestGreeting = alfredBot.guestGreeting();
        System.out.println(testDynamicGuestGreeting);
        
        // Testing dateAnnouncement()
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
        
        // Testing respondBeforeAlexis()
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        System.out.println(alexisTest);
        
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        System.out.println(alfredTest);
        
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
        System.out.println(notRelevantTest);
        
        // Testing alfredYell()
        String yelledPhrase = alfredBot.alfredYell("Don't touch that!");
        System.out.println(yelledPhrase);
    }
}
