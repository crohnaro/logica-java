public class sleepIn {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;
        
            System.out.println(sleepIn(weekday, vacation));
    }



    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if ( weekday != true || vacation ==true) {
        return true;
        } else {
        return false;
        }
    }
}    