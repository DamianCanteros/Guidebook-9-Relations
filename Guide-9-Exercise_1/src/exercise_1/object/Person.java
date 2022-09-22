
package exercise_1.object;

/**
 *
 * @author Damian
 */
public class Person {
    
    private String name;
    private String lastname;
    private Integer age;
    private Integer identification;
    private Dog Dog;

    public Person() {
    }

    public Person(String name, String lastname, Integer age, Integer identification) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.identification = identification;
    }

    public void setDog(Dog Dog) {
        this.Dog = Dog;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getIdentification() {
        return identification;
    }

    public Dog getDog() {
        return Dog;
    }

    @Override
    public String toString() {
        return "PERSON: " + name + " " + lastname + "\n" +
        "Age: " + age + "\n" +
        "Identification: " + identification + "\n" +
         Dog + "\n";
    }    
}



