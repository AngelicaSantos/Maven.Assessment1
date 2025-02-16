package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {

        this.name=name;
        this.pets=pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets = new Pet[3];
        pets[0]=pet;


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets[0]=null;

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        boolean own = false;
        for (Pet eachPet : pets) {
            if(pet.equals(eachPet)) {
                own=true;
            }
        }
        return own;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {


        int age= 100;
        for (Pet pet : pets) {
            Integer temp = pet.getAge();
            if(temp<age) {
                age=temp;
            }
        }
        return age;
    }





    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        int age= 0;
        for (Pet pet : pets) {
            Integer temp = pet.getAge();
            if(temp>age) {
                age=temp;
            }
        }
        return age;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sum =0;
        Float numOfPets = (float)this.pets.length;

        for (Pet pet : pets) {
           sum += pet.getAge();



        }
        return sum/numOfPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets;
    }
}
