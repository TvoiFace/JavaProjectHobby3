public class Cooking extends Hobby{
    private String dish;
    private int howlon;

    public Cooking(String name, int age, String dish, int howlon)
    {
        super.setName(name);
        super.setAge(age);
        this.dish = dish;
        this.howlon = howlon;
    }

    public Cooking()
    {

    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public int getHowlon() {
        return howlon;
    }

    public void setHowlon(int howlon) {
        this.howlon = howlon;
    }

    @Override
    protected void tellAboutHobby()
    {
        System.out.println(super.getName() + " " + super.getAge() + " " + dish + " " + howlon);
    }
}
