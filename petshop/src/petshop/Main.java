package petshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		ArrayList<Owner> ownerList = new ArrayList<Owner>();
		ArrayList<AnimalBelonging> animalBelongingList = new ArrayList<AnimalBelonging>();
		ArrayList<Bird> birdList = new ArrayList<Bird>();
		ArrayList<DogCat> dogCatList = new ArrayList<DogCat>();
		ArrayList<Animal> animalList = new ArrayList<Animal>();

		Owner owner = new Owner("Felipe", 01, "Rua do Felipe", "032156422");
		ownerList.add(owner);

		owner = new Owner("Ana", 02, "Rua da Ana", "032156422");
		ownerList.add(owner);

		owner = new Owner("Jose", 03, "Rua da Jose", "032156422");
		ownerList.add(owner);

		DogCat dogCat = new DogCat("Tunico", "Branco", 10, "Dog", "Masc", 01, "Peq", 15.67);
		Animal animal = new Animal("Tunico", "Branco", 10, "Dog", "Masc", 01);
		dogCatList.add(dogCat);
		animalList.add(animal);

		dogCat = new DogCat("Tinoco", "Preto", 15, "Cat", "Masc", 02, "Grande", 15.67);
		animal = new Animal("Tinoco", "Preto", 15, "Cat", "Masc", 02);
		dogCatList.add(dogCat);
		animalList.add(animal);

		Bird bird = new Bird("Maiara", "Amarelo", 8, "Sabia", "Fem", 03, "001");
		animal = new Animal("Maiara", "Amarelo", 8, "Sabia", "Fem", 03);
		birdList.add(bird);
		animalList.add(animal);

		bird = new Bird("Maraisa", "Amarelo", 8, "Sabia", "Fem", 04, "002");
		animal = new Animal("Maraisa", "Amarelo", 8, "Sabia", "Fem", 04);
		birdList.add(bird);
		animalList.add(animal);

		AnimalBelonging belongs = new AnimalBelonging(01, 01);
		animalBelongingList.add(belongs);

		belongs = new AnimalBelonging(02, 02);
		animalBelongingList.add(belongs);

		belongs = new AnimalBelonging(03, 03);
		animalBelongingList.add(belongs);

		belongs = new AnimalBelonging(03, 04);
		animalBelongingList.add(belongs);

		for (Animal animals : animalList) {
			Owner owners = null;
			for (AnimalBelonging ab : animalBelongingList) {
				if (ab.getAnimalCode().equals(animals.getAnimalCode())) {
					for (Owner o : ownerList) {
						if (o.getClientCode().equals(ab.getClientCode())) {
							owners = o;
							break;
						}
					}
					break;
				}
			}

			System.out.println(animals.getName() + " (" + animals.getBreed() + ", " + animals.getColor() + ")");
			if (owner != null) {
				System.out.println("Dono: " + owners.getName());
			} else {
				System.out.println("Dono: desconhecido");
			}
			System.out.println();
		}

		for (Owner owners : ownerList) {
			System.out.println("Dono: " + owners.getName());
			System.out.println("Endereço: " + owners.getAddress());

			for (AnimalBelonging belonging : animalBelongingList) {
				if (belonging.getClientCode().equals(owners.getClientCode())) {

					for (Animal animals : animalList) {
						if (animals.getAnimalCode().equals(belonging.getAnimalCode())) {
							System.out.println("Animal-> Nome: " + animals.getName() + ", Cor: " + animals.getColor()
									+ ", Idade: " + animals.getAge());

						}
					}
				}
			}

			System.out.println();
		}

		// entreguei atrasado pq tava brigando com esse sort, sorry =(

		Collections.sort(animalList, Comparator.comparing(Animal::getAge));

		for (Animal animals : animalList) {
			for (AnimalBelonging belonging : animalBelongingList) {
				if (belonging.getAnimalCode().equals(animals.getAnimalCode())) {
					for (Owner owners : ownerList) {
						if (belonging.getClientCode().equals(owners.getClientCode())) {
							System.out.println("Dono: " + owners.getName() + ", Animal: " + animals.getName()
									+ ", Cor: " + animals.getColor() + ", Idade: " + animals.getAge());
						}
					}
				}
			}
		}

	}

}