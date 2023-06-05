import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }

    public String guestGreeting() {
        String dayPeriod;
        Date date = new Date();
        int hours = date.getHours();

        if (hours >= 0 && hours < 12) {
            dayPeriod = "morning";
        } else if (hours >= 12 && hours < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return guestGreeting("Guest", dayPeriod);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date.toString();
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String alfredYell(String phrase) {
        return phrase.toUpperCase() + "!!!";
    }
}