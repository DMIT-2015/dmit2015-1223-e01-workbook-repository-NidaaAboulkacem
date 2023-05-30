package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @ParameterizedTest(name= "weight = {0}, height = {1}: expected bmi = {2}")
    @CsvSource({
            "100, 66, 16.1",
            "140, 66, 22.6",
            "175, 66, 28.2",
            "200, 66, 32.3",
            "200, 66, 32.3"

    })
    void bmi(int weight, int height, double expectedBmi) {
        BMI bmi = new BMI();
        bmi.setHeight(height);
        bmi.setWeight(weight);

        assertEquals(expectedBmi, bmi.bmi(), 5.0E-02);
    }

    @ParameterizedTest(name = "{0}, {1}:{2}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
            Weight, Height, Expected_Weight
            100, 66, underweight
            140, 66, normal
            175, 66, overweight
            200, 66, obese
            200, 62, obese
            """)
    void bmiCategory(int weight, int height, String expectedBmi){
        BMI bmi = new BMI(weight, height);

        assertEquals(expectedBmi, bmi.bmiCategory());

    }


}