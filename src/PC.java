import Resolution.Case;

public class PC {

    private final Case theCase;
    private final Monitor monitor;
    private final Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLog();
    }

    private void drawLog() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}

