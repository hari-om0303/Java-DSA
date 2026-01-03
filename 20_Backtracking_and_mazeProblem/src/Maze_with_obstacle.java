public class Maze_with_obstacle {
    public static void main(String[] args) {
        path("" ,3,3);

        System.out.println("            ");

        boolean [] [] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        path2("" , board , 0,0);
    }

//    1st method = it is not a good solution of this problem

    static void path(String p , int r ,int c){
        if (r==1 && c==1 ){
            System.out.println(p);
            return;
        }
        if (r==2 && c==2){
            return;
        }

        if (r>1){
            path(p+"D" , r-1 , c);
        }
        if (c>1){
            path(p+"R" , r, c-1 ) ;
        }
    }

//    2nd method

    static void path2(String p, boolean [][] maze, int r, int c){
        if (r== maze.length-1 && c== maze.length-1 ){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        if (r<maze.length-1){
            path2(p+"D", maze, r+1, c);
        }
        if (c<maze.length-1){
            path2(p+"R", maze, r, c+1);
        }
    }

}
