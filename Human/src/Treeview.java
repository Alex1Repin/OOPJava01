public class Treeview {
    public static void view(Human boss, int num){
        String line = "_".repeat(num);
        System.out.println(line + boss.FullName);
        for (Human a: boss.getListName()){
            view(a, num+1);
        }
    }
}
