public class mainWall {
    public static void main(String[] args) {

        Wall w1 = new Wall();
        Wall w2 = new Wall(10, 20);

        w1.setWidth();
        w1.setHeight();
        System.out.println(w1.getArea());

        w2.setHeight();
        System.out.println(w2.getArea());
    }
}
