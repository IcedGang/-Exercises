package Lista3;

public class TimeExample {
    public static void main(String[] args) {
        Time t1 = new Time(12, 0, 0);
        //Time t2 = new Time(10, 0, 0);

        t1.showTime();
        // t2.showTime();

        t1.addSegundos(3600);
        t1.showTime();

        // System.out.println(t1.isAm());
    }
}
