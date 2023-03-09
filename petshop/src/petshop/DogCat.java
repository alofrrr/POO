package petshop;

public class DogCat extends Animal {

    private String size;
    private Double weight;

    public DogCat(String name, String color, Integer age, String breed, String gender, Integer animalCode, String size, Double weight) {
        super(name, color, age, breed, gender, animalCode);
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}