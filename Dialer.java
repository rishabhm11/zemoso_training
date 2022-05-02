public class Dialer {

    long number;
    private SimCardManager simCardManager;

    public Dialer(SimCardManager simCardManager){
        this.simCardManager=simCardManager;
    }

    public SimCardManager getSimCardManager() {
        return simCardManager;
    }

    public void setSimCardManager(SimCardManager simCardManager) {
        this.simCardManager = simCardManager;
    }

    public void call(){
        simCardManager.call();
    }
}
