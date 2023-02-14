import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"lively", "ostentatious", "lovely", "bodacious", "limp", "sour", "inquisitive", "sensative", "quacky", "tricky"};
    public static String[] nouns = {"bird", "whale", "ostrich", "anteater", "mole", "lionfish", "squirrel", "jaguar", "donkey", "cow"};
    public static String randomIndex (String[] array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    public static void main(String[] args) {
        System.out.println(randomIndex(adjectives) + "-" + randomIndex(nouns));
    }
}
