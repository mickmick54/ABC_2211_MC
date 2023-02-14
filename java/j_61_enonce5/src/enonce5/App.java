package enonce5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // date donnée
        String dateString = "2023-02-14";

        // format de la date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // utilisation de la fonction pour retourner le jour de la semaine
        System.out.println("Jour de la semaine : " + getDayOfWeek(date));
    }

    public static String getDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return "Lundi";
            case Calendar.TUESDAY:
                return "Mardi";
            case Calendar.WEDNESDAY:
                return "Mercredi";
            case Calendar.THURSDAY:
                return "Jeudi";
            case Calendar.FRIDAY:
                return "Vendredi";
            case Calendar.SATURDAY:
                return "Samedi";
            case Calendar.SUNDAY:
                return "Dimanche";
            default:
                return "Inconnu";
        }
    }
}
