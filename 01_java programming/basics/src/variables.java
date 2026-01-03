    class myy {
    private int mic;
    private int cam;

    void setvalue() {
        mic = 2;
        cam = 40;
    }
    void display(){
            System.out.println(mic);
            System.out.println(cam);
        }}

    class variables{
    public static void main(String [] args) {
      myy v = new myy();
      v.display();
      v.setvalue();
      v.display();
    }}
