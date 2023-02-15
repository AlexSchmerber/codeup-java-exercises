import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {
    public static Object[] addPerson (Object[] people, Person person){
        Object[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = person;
//        prints name but doesn't add to original array
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
            System.out.println(person);
        }
        Object[] newArray = addPerson(newPeople, new Person("Romulus"));
        System.out.println(Arrays.toString(newArray));

    }
}
