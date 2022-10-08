import java.util.ArrayList;

public class Box {
    private ArrayList<Item> items = new ArrayList<>();

    private ArrayList<Box> boxes = new ArrayList<>();
    private short id;
    private boolean isMainParent;

    public Box(short id, boolean isMainParent) {
        this.id = id;
        this.isMainParent = isMainParent;
    }

    public void setItems(Item ...items) {
        for (Item item : items)
            this.items.add(item);
    }

    public void setBoxes(Box ...boxes) {
        for (Box box : boxes)
            this.boxes.add(box);
    }

    public short getId() {
        return id;
    }

    public boolean isMainParent() {
        return isMainParent;
    }

    public void showItems(){
        for (Item item : this.items )
            System.out.println(item);
    }

    public Item getItemById(short id) {
        return this.items.get(id);
    }

    public Box getBoxeById(short id) {
        return this.boxes.get(id);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Box> getBoxes() {
        return boxes;
    }

    @Override
    public String toString() {
        return "\nBox Id : " + getId() + " || isMainParent : " + isMainParent() + " || Contains : \n" ;
    }
}
