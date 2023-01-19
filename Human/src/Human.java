import java.util.ArrayList;

public class Human{
    public String FullName;
    public Human(String Name){
        this.FullName = Name;
    }
    ArrayList<Human> listName = new ArrayList<>();

    public void AddName(Human human) {
        listName.add(human);
    }

    public ArrayList<Human> getListName() {
        return listName;
    }

        public void Voice(){
        System.out.println("Открой шкаф");
    }
}
