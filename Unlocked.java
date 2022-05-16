public class Unlocked implements State{

    Mobile mobile;

    public Unlocked(Mobile mobile){
        this.mobile=mobile;
    }

    @Override
    public void transitioningTo(State nextState) {
        this.mobile.setState(nextState);
    }

    @Override
    public void currentState() {
        System.out.println("Mobile is Unlocked!");
    }
}
