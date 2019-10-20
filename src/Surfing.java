public class Surfing extends Hobby {
    private int high;
    private String place;

    public Surfing(String hobby, int age, int high, String place) {
        super(hobby, age);
        this.high = high;
        this.place = place;
    }

    public Surfing()
    {

    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    protected void tellAboutHobby()
    {
        System.out.println(super.getName() +" " + super.getAge() + " " + high + " " + place );
    }
}
