
package springpet;

/**
 *
 * @author asmith86
 */
public class Person {
    private String name;
    private Animal pet;

    public Person() {
    }

    public Person(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    
    public void askPetToSpeak(){
        pet.speak();
    }
}
