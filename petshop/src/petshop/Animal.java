package petshop;

public class Animal implements Comparable<Animal> {

    private String name;
    private String color;
    private Integer age;
    private String breed;
    private String gender;
    private Integer animalCode;

    public Animal(String name, String color, Integer age, String breed, String gender, Integer animalCode) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.animalCode = animalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAnimalCode() {
        return animalCode;
    }

    public void setAnimalCode(Integer animalCode) {
        this.animalCode = animalCode;
    }


    public int compareTo(Animal anotherAnimal) {
        return Integer.compare(this.age, anotherAnimal.age);
    }

}
