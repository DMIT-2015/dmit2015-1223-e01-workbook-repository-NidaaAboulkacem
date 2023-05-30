package domain;

public class BMI {


    // 5. Java Class Fields
    private int weight;
    private int height;

    // 7. Generate getters
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }

    // Generate Setters
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 6. Generate default no argument
    public BMI() {
    }

    public BMI(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
    public double bmi(){
        return (703 * this.weight) / Math.pow(this.height, 2);
    }
    // integer
    public String bmiCategory(){
        double bmi = this.bmi();
        String category = "";
        if (bmi < 18.5){
            category = "underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            category = "normal";
        }
        else if (bmi >= 25 && bmi <= 29.9){
            category = "overweight";
        }
        else if (bmi >= 30){
            category = "obese";
        }
        return category;
    }
}
