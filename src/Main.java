public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Hozirgi vaqt: " + time);

        time.nextSecond();
        System.out.println("Bir soniyadan keyin: " + time);

        time.nextMinute();
        System.out.println("Bir daqiqadan keyin: " + time);

        time.nextHour();
        System.out.println("Bir soatdan keyin: " + time);

        time.previousSecond();
        System.out.println("Bir soniya oldin: " + time);

        time.previousMinute();
        System.out.println("Bir daqiqa oldin: " + time);

        time.previousHour();
        System.out.println("Bir soat oldin: " + time);
    }
}