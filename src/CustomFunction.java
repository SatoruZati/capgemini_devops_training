public class CustomFunction {

    public static Boolean isGOAT(String name) {
        if (name.equals("Lionel Messi") || name.equals("Cristiano Ronaldo") || name.equals("Sergio Ramos") || name.equals("Neymar") || name.equals("Kevin De Bruyne")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String name = "Lionel Messi";
        Boolean result = isGOAT(name);
        System.out.println(name + " is GOAT: " + result);

        String goatName = "Lamine Yamal";
        Boolean goatResult = isGOAT(goatName);
        System.out.println(goatName + " is GOAT: " + goatResult);
    }
}
