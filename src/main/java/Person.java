public class Person {
    private String name;

    public Person(){
        this.name = "";
    };

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        System.out.println("the name is " + this.name);
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println(name + " set");
    }
    public void sayHello(){
        System.out.println(this.name + " says hello!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person alex = new Person();
        alex.setName("Alex");
        alex.sayHello();
        alex.getName();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }
}
