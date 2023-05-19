public class StandardSensor implements Sensor {
    private int a;
    public StandardSensor(int a) {
        this.a = a;
    }
    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
    public boolean isOn() {
        return true;
    }
    public void setOn() {

    }
    public void setOff() {

    }
    public int read() {
       return a;
    }
}
