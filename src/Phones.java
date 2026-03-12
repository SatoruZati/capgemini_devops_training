public class Phones {

    public static void phone(String name) {
        System.out.println("The phone is: " + name);
        if (name.equals("iPhone")) {
            System.out.println("The iPhone is a popular smartphone developed by Apple Inc.");
        } else if (name.equals("Samsung Galaxy")) {
            System.out.println("The Samsung Galaxy is a series of Android smartphones developed by Samsung Electronics.");
        } else if (name.equals("Google Pixel")) {
            System.out.println("The Google Pixel is a line of smartphones designed and developed by Google.");
        } else if (name.equals("OnePlus")) {
            System.out.println("OnePlus is a Chinese smartphone manufacturer known for producing high-quality devices at competitive prices.");
        } else if (name.equals("Xiaomi")) {
            System.out.println("Xiaomi is a Chinese electronics company that produces a wide range of smartphones and other consumer electronics.");
        } else {
            System.out.println("Unknown phone model.");
        }
    }

    public static void main(String[] args) {
        String[] phones = {"iPhone", "Samsung Galaxy", "Google Pixel", "OnePlus", "Xiaomi"};
        for  (String phone : phones) {
            phone(phone);
        }
    }
}
