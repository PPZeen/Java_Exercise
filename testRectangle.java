public class testRectangle {
    public static void main(String args[]){
        Rectangle object1 = new Rectangle(10, 8, "Gray", true);
        Rectangle object2 = new Rectangle(6, 15, "red", false);
        Rectangle object3 = new Rectangle(20, 4, "Purple", true);

        System.out.println(object1.toString() + "\n--------------------------------------------");
        System.out.println(object2.toString() + "\n--------------------------------------------");
        System.out.println(object3.toString() + "\n--------------------------------------------");

        System.out.println("Compare object 1 with object 2.");
        if (object1.compareTo(object2) == 1){System.out.println(">> Both objects have the same area");}
        else {System.out.println(">> Both objects have unequal areas.");}

        System.out.println("Compare object 1 with object 3.");
        if (object1.compareTo(object3) == 1){System.out.println(">> Both objects have the same area");}
        else {System.out.println(">> Both objects have unequal areas.");}
    }
}
