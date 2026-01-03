import java.util.ArrayList;

public class Maze_right_down_diagnonal_move {
    public static void main(String[] args) {
        System.out.print(paths("" , 3,3));
    }
     static ArrayList<String> paths(String p , int r , int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(paths(p+"d" , r-1 , c));
        }
        if (c>1){
            list.addAll(paths(p+"r" , r , c-1));
        }
        if (r>1 && c>1){
            list.addAll(paths(p+"D" , r-1 , c-1));
        }
        return  list;
     }
}
