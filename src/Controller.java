public class Controller {

    private final int buttons;
    private final ps4Features features;

    public Controller(int buttons, ps4Features features) {
        this.buttons = buttons;
        this.features = features;
    }

    public int getButtons() {
        return buttons;
    }

    public ps4Features getFeatures() {
        return features;
    }

    public String toString () {
        return "No of buttons : " + buttons + " and features are : " + getFeatures();
    }
}
