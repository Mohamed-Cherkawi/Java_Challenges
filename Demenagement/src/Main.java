import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Creating A Default Boxes That Contains  an object created that is created by default
        Box TempBox;
        ArrayList<Box> Boxes = new ArrayList<Box>();
        Collections.addAll(Boxes , new Box((short) 1 ,true) , new Box((short) 2 , true) );
        // Filling the boxes With Either Items Or under boxes
        Boxes.get(0).setItems(new Item("Smart TV" , "Electronics"),new Item("Telephone","Electronics"));
        Boxes.get(1).setItems(new Item("The Mistery Box","Books") , new Item("Last Day Of A Convict" , "Books"));
        Boxes.get(1).setBoxes(new Box((short) 3 , false));
        TempBox = Boxes.get(1).getBoxeById((short) 0);
        TempBox.setItems(new Item("Pair Of Pens" , "Pens") , new Item("Bloc Note" , "NoteBooks"));
        System.out.println(Boxes.get(1));
        Boxes.get(1).showItems();
        System.out.println(TempBox);
        TempBox.showItems();

    }

}
