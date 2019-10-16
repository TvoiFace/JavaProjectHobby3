public class Hobby
{
    private String hobby;
    private int age;
    private char quant;
    private long love;
    private float howlong;
    private double hour;
    private short times;
    private boolean key;
    private byte mark;

    public Hobby()
    {

    }

    public Hobby(String hobby, int age, char quant, long love, float howlong, double hour, boolean key)
    {
        this.hobby = hobby;
        this.age = age;
        this.quant = quant;
        this.love = love;
        this.howlong = howlong;
        this.hour = hour;
        this.times = times;
        this.key = key;
        this.mark = mark;
    }

    public Hobby(String hobby, int age, char quant, long love, float howlong, double hour, short times, boolean key, byte mark)
    {
        this.hobby = hobby;
        this.age = age;
        this.quant = quant;
        this.love = love;
        this.howlong = howlong;
        this.hour = hour;
        this.times = times;
        this.key = key;
        this.mark = mark;
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getQuant() {
        return quant;
    }

    public void setQuant(char quant) {
        this.quant = quant;
    }

    public long getLove() {
        return love;
    }

    public void setLove(long love) {
        this.love = love;
    }

    public float getHowlong() {
        return howlong;
    }

    public void setHowlong(float howlong) {
        this.howlong = howlong;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public short getTimes() {
        return times;
    }

    public void setTimes(short times) {
        this.times = times;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public byte getMark() {
        return mark;
    }

    public void setMark(byte mark) {
        this.mark = mark;
    }

    protected void tellAboutHobby()
    {
        System.out.println("Ur hobby is " + hobby + ".\nU are " + age + ".\nU have  " + quant + " hobby.\n" +
                 "U love it " + love + "/10.\nU have been doing this for " + howlong + "years.\nU do it" + hour +
                " hours a day.\n" + times + " a week.\n" + "Our mark is " + key + "/10");
    }
}
