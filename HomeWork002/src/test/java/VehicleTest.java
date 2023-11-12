import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;
    @BeforeAll
    public static void setVehicle(){
        car = new Car("Company 1","Model 1", 2023);
        motorcycle = new Motorcycle("Company 2", "Model 2", 2022);
    }

    @Test
    @DisplayName("Проверка что Car тоже Vehicle")
    void testCarInVehicle(){
        assertEquals(true, car instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверка количества колес у Car")
    void testCarWheels(){
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Проверка количества колес у Motorcycle")
    void testMotorcycleWheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Проверка скорости Car в режиме testDrive")
    void testSpeedTestDriveCar(){
        car.testDrive();
        assertEquals(60, car.getSpeed());
        car.park();
    }

    @Test
    @DisplayName("Проверка скорости Motorcycle в режиме testDrive")
    void testSpeedTestDriveMotorcycle(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
        motorcycle.park();
    }

    @Test
    @DisplayName("Проверка скорости Car в режиме Park")
    void testSpeedParkCar(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Проверка скорости Motorcycle в режиме Park")
    void testSpeedParkMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }






}
