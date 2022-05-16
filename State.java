public interface State {
    void transitioningTo(State state);
    void currentState();
}
