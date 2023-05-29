package domain;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class ChineseZodiacTest {

    public static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
    @Test
    public void testGetAnimalRat() {
        int animalYear = 1900;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("rat", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalOx() {
        int animalYear = 1901;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("ox", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalTiger() {
        int animalYear = 1902;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("tiger", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }

    @Test
    public void testGetAnimalRabbit() {
        int animalYear = 1903;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("rabbit", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalDragon() {
        int animalYear = 1904;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("dragon", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
    @Test
    public void testGetAnimalSnake() {
        int animalYear = 1905;
        while (animalYear <= CURRENT_YEAR) {
            assertEquals("snake", ChineseZodiac.animal( animalYear ).toLowerCase() );
            animalYear += 12;
        }
    }
}