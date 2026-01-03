public class triangle {
    public static void main(String[] args) {
        trngle(4,0);
    }
    static void trngle(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("*");
            trngle(r,c+1);
        }else {
            System.out.println("");
            trngle(r-1,0);
        }
    }
}
