import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {
    public static Object[] addPerson (Object[] people, Person person){
        Object[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = person;
        System.out.println(Arrays.toString(newArray));
//        prints name but doesnt add to original array
        return newArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person [] newPeople = new Person[3];
        newPeople[0] = new Person("Alex");
        newPeople[1] = new Person("Jerome");
        newPeople[2] = new Person("Reginald");
        System.out.println(Arrays.toString(newPeople));
        for (Object person: newPeople) {
            System.out.println(person.toString());
        }
        addPerson(newPeople, new Person("Romulus"));
        System.out.println(Arrays.toString(newPeople));
    }
}