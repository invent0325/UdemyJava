public class tshirtNike extends allTshirtsBrand {

    public tshirtNike(String size, String color) {
        super(size, color);
    }

    @Override
    public void displayTshirt() {
        System.out.println("Nike has Black and White Color tshirts");
        //super.displayTshirt();
    }
}
