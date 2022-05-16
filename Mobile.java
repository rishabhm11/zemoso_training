import java.util.HashMap;

public class Mobile {
    State currentState;
    HashMap<State,State> mobileStates=new HashMap<>();
    public Mobile(){
        State locked=new Locked(this);
        State unlocked= new Unlocked(this);
        mobileStates.put(locked,unlocked);
        mobileStates.put(unlocked,locked);
        currentState=locked;
    }

    public void setState(State nextState){
        currentState=nextState;
    }
    public void displayState(){
        this.currentState.currentState();
    }

    public void change(){
        this.currentState.transitioningTo(mobileStates.get(currentState));
    }

}
