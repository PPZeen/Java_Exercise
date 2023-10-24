import java.util.ArrayList;

public class testSquare {
    public static void main(String args[]){
        ArrayList<GeomericObject> object = new ArrayList<GeomericObject>();
        object.add(new Square(2, 5, "Red", true));
        object.add(new Square(12, 7, "Green", false));
        object.add(new Square(4, 8, "Blue", false));
        object.add(new Square(6, 15, "Purple", true));
        object.add(new Square(32, 5, "Grey", true));

        for(int i = 0; i < 5; i++){
            System.out.println(object.get(i).toString());
            if(object.get(i) instanceof Colorable){
                ((Colorable)object.get(i)).howToColor();
            }
            System.out.println("---------------------------");
        }
    }
}
