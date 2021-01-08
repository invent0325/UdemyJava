public class vipCustomer {

    private String vipName;
    private final int vipCreditLimit;
    private final String vipEmailAddress;

    public vipCustomer() {
        this("John", 2000, "john@email.com");
    }

    public vipCustomer(String vipName, int vipCreditLimit) {
        this(vipName, vipCreditLimit, "Mark@email.com");
    }

    public vipCustomer(String vipName, int vipCreditLimit, String vipEmailAddress) {
        this.vipName = vipName;
        this.vipCreditLimit = vipCreditLimit;
        this.vipEmailAddress = vipEmailAddress;
    }

    public String getVipName() {
        if(this.vipName.equals(vipName.toLowerCase())) {
            this.vipName = vipName.toUpperCase();
        }
        return vipName;
    }

    public int getVipCreditLimit() {
        return vipCreditLimit;
    }

    public String getVipEmailAddress() {
        return vipEmailAddress;
    }
}
