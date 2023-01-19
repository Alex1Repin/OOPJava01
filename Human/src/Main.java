public class Main {
    public static void main(String[] args) {
        Human father = new Human("Папа");
        Human husband = new Human("Муж");
        Human mother = new Human(" Мама");
        Human wife = new Human("Жена");
        Human son = new Human("Сын");
        Human brother = new Human("Брат");
        Human daughter = new Human("Дочь");
        Human sister = new Human("Сестра");
        Human granddaughter = new Human("Внучка");
        Human grandson = new Human("Внук");
        father.AddName(mother);
        father.AddName(son);
        father.AddName(daughter);
        daughter.AddName(granddaughter);
        son.AddName((grandson));
        husband.AddName(wife);
        brother.AddName(sister);
        Treeview.view(father, 0);
        Treeview.view(husband, 0);
        Treeview.view(brother, 0);
        wife.Voice();
    }

}