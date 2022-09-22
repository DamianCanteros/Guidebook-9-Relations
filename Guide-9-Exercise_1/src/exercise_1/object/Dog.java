
package exercise_1.object;

/**
 *
 * @author Damian
 */
public class Dog {
    
    private String name;
    private String breed;
    private Integer age;
    private Double size;

    public Dog() {
    }

    public Dog(String name, String breed, Integer age, Double size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "DOG: " + name + "\n" +
        "Age: " + age + "\n" +
        "Breed: " + breed + "\n" +
        "Size: " + size + "\n";
    } 
}
