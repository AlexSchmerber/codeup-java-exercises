import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueBob;
        String statementToBob;
        String bobReply = "Bob replies: ";
        do {
            System.out.println("Say something to Bob.");
            statementToBob = sc.nextLine();
            if(statementToBob.endsWith("?")) {
                System.out.println(bobReply + "Sure.");
            } else if(statementToBob.endsWith("!")){
                System.out.println(bobReply + "Woah. Chill out!");
            } else if( statementToBob.trim().length() == 0){
                System.out.println(bobReply + "Fine. Be that way!");
            } else{
                System.out.println(bobReply + "Whatever.");
            }
            System.out.println("Continue talking to Bob? [y/n]");
            continueBob = sc.nextLine();
        } while (!"n".equalsIgnoreCase(continueBob));
        sc.close();
    }
}
