package petshop;

public class Bird extends Animal {

    private String ringNumber;

    public Bird(String name, String color, Integer age, String breed, String gender, Integer animalCode, String ringNumber) {
        super(name, color, age, breed, gender, animalCode);
        this.ringNumber = ringNumber;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }
}
