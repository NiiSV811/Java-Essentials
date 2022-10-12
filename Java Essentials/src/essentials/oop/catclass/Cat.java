package essentials.oop.catclass;

public class Cat {
    //Define Attributes
    private String catName;
    private double catWeightKg;
    private String furColor;
    private boolean isVaccinated;

    //Define methods

    //builder
    public Cat(String catName, double catWeightKg, String furColor, boolean isVaccinated){
        //set attributes to build a neeko jsjsj
        this.catName = catName;
        this.catWeightKg = catWeightKg;
        this.furColor = furColor;
        this.isVaccinated = isVaccinated;

        System.out.println(" Meow Meow ");
    }

    public void setCatName( String catName){
        this.catName = catName;
    }

    public void setCatWeight( double catWeightKg){
        this.catWeightKg = catWeightKg;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public void setIsVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }

    public void jump(){
        System.out.println("* Cat jumps *");
    }

    public void  eat(){
        System.out.println(" * yummi sounds *");
    }

    public void sleep(){
        System.out.println(" * cat goes to sleep * ");
    }

}
