import java.util.Random;

public class ServerNameGenerator {

    private static Random random = new Random();
    private static String[] adjectives = {"lively", "ostentatious", "lovely", "bodacious", "limp", "sour", "inquisitive", "sensative", "quacky", "tricky"};
    private static String[] nouns = {"bird", "whale", "ostrich", "anteater", "mole", "lionfish", "squirrel", "jaguar", "donkey", "cow"};
    public static String randomIndex (String[] array){
        int rnd = random.nextInt(array.length);
        return array[rnd];
    }
    public static void main(String[] args) {
        System.out.println(randomIndex(adjectives) + "-" + randomIndex(nouns));
    }
}
