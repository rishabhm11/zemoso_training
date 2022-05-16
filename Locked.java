public class Locked implements State{

    Mobile mobile;
    public Locked(Mobile mobile){
        this.mobile=mobile;
    }

    @Override
    public void transitioningTo(State nextState) {
        this.mobile.setState(nextState);
    }

    @Override
    public void currentState() {
        System.out.println("Mobile is Locked!");
    }
}
