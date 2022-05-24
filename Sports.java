public interface Sports {
    public void players();
    public void duration();
    public void ground();
    default void play(){
        players();
        duration();
        ground();
        System.out.println("With all this, lets get the game started!");
    }
}
