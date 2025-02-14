public class PartyAffiliation {
    public static void main(String[] args) {
        String party = "D";//Choose the symbol you want

        if (party.equals("D")) {// Input is if you select D
            System.out.println("You get a Democratic Donkey.");// output you get Democratic Donkey
        } else if (party.equals("R")) {// Input is if you select R
            System.out.println("You get a Republican Elephant.");// output you get Republican Elephant
        } else if (party.equals("I")) {// Input is if you select I
            System.out.println("You get an Independent Person.");// output you get Independent Person
        } else {// Input is if you select any other letter
            System.out.println("You get an Other.");//Output you get other
        }
    }
}