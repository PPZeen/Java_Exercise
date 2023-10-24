public class testOctagon {
    public static void main(String args[]) throws CloneNotSupportedException {
        Octagon object1 = new Octagon(5, "Gray", true);
        Octagon object2 = (Octagon) object1.clone();

        System.out.println(object1.toString() + "\n--------------------------------------------");
        System.out.println(object2.toString() + "\n--------------------------------------------");

        System.out.println("Compare object 1 with object 2.");
        if (object1.compareTo(object2) == 1){System.out.println(">> Both objects have the same area");}
        else {System.out.println(">> Both objects have unequal areas.");}
    }
}
