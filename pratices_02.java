import java.time.LocalTime;

class Demo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());//6:25:12
    }
}


//If you want to show a specific time like 5:23:56, you can 
//manually create that time using LocalTime.of(hour, minute, second).

import java.time.LocalTime;

class Demo {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(5, 23, 56);
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
