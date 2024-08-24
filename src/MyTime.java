public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){}

    public MyTime(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second){
        if (hour<0||hour>23||minute<0||minute>59||second<0||second>59){
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya");
        }else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour>=0&&hour<=23) {
            this.hour = hour;
        }else {
            System.out.println("Yaroqsiz soat!");
        }
    }

    public void setMinute(int minute) {
        if (minute>=0&&minute<=59) {
            this.minute = minute;
        }else {
            System.out.println("Yaroqsiz daqiqa!");
        }
    }

    public void setSecond(int second) {
        if (second>=0&&second<=59){
            this.second = second;
        }else {
            System.out.println("Yaroqsiz soniya!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        if (second==59){
            second = 0;
            nextMinute();
        }else {
            second++;
        }
        return this;
    }
    public MyTime nextMinute(){
        if (minute==59){
            minute = 0;
            nextHour();
        }else {
            minute++;
        }
        return this;
    }
    public MyTime nextHour(){
        if (hour==23){
            hour = 0;
        }else {
            hour++;
        }
        return this;
    }
    public MyTime previousSecond(){
        if (second==0){
            second = 59;
            previousMinute();
        }else {
            second--;
        }
        return this;
    }
    public MyTime previousMinute(){
        if (minute==0){
            minute= 59;
            previousHour();
        }else {
            minute--;
        }
        return this;
    }
    public MyTime previousHour(){
        if(hour==0){
            hour = 23;
        }else {
            hour--;
        }
        return this;
    }
}

