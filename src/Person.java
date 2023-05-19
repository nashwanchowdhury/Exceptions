public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        if (initialName.equals("") || initialName.equals(null) || initialName.length() > 40) {
            throw new IllegalArgumentException("Grade must be between 0 and 5.");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Grade must be between 0 and 5.");
        }
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " +   this.age + " years");
    }

    public String getName() {
        return this.name;
    }
}