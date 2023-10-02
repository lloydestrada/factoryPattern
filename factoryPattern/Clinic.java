package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while (true) {
        
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("[3] Exit");
        System.out.print("\n\nChoose your pet number: ");
        Integer choice = input.nextInt();
        
        if ( choice == 3) {
        	System.out.print("Exiting the Program");
        			break;
        }
        	

        PetRecord petFile = new PetRecord();
        Pet pet = null;

        switch(choice){
            case 1: // Dog
                pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepherd"); // Set the breed for a dog
                break;
            case 2: // Cat
                pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9); // Set the number of lives for a cat
                break;
        }

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + petFile.getPet().makeSound());
        
        // Check pet if it is a Dog or a Cat and display the corresponding attribute
        if (pet instanceof Dog) {
            System.out.println("Breed: " + ((Dog) pet).getBreed());
        } else if (pet instanceof Cat) {
            System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
        }

        System.out.println("Play mode: " + petFile.getPet().play());
        
        }
    }
}
