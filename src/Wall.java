public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(20, 30);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        if(width < 0) {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        if(height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
