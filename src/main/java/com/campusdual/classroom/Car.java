package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    // Constructores
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    // Encender el coche
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("Vehículo ya está encendido");
        }
    }

    // Apagar el coche
    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }

    // Acelerar
    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
        }
    }

    // Frenar
    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }
    }

    // Girar ruedas
    public void turnAngleOfWheels(int angle){
            if (angle > 45) {
                this.wheelsAngle = 45;
            } else if (angle < -45) {
                this.wheelsAngle = -45;
            } else {
                this.wheelsAngle = angle;
            }
        }

    // Mostrar el ángulo de las ruedas
    public String showSteeringWheelDetail() {
        return "El ángulo de las ruedas es: " + this.wheelsAngle + " grados.";
    }

    // Saber si está en marcha atrás
    public boolean isReverse() {
        return this.reverse;
    }

    // Cambiar marcha atrás
    public void setReverse(boolean reverse) {
        if (reverse) {
            if (this.speedometer == 0) {
                this.reverse = true;
                this.gear = "R";
            }
        } else {
            this.reverse = false;
            this.gear = "N";
        }
    }

    // Mostrar detalles del coche
    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad: " + this.speedometer);
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
        System.out.println("Marcha atrás: " + this.reverse);
        System.out.println("Ángulo ruedas: " + this.wheelsAngle);
    }

    // Tacómetro mayor que cero
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    // Tacómetro igual a cero
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.turnAngleOfWheels(20);
        c1.brake();
        c1.stop();
        c1.setReverse(true);
        c1.showDetails();
    }
}
