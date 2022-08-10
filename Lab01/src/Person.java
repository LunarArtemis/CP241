public class Person implements PersonADT {

    private int age;
    private String favouriteColour;

    public void setAge(int newAge){
        if (newAge >= 1 && newAge <= 120){
                age = newAge;
        } 
    }

    public int getAge() {
        return age;
    }

    public void setFavouriteColour(String newColour) {
        if (newColour.length() >= 1 && newColour.length() <= 10)
            favouriteColour = newColour;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    @Override
    public int caculateAge() {
        return age+1;
    }

}
