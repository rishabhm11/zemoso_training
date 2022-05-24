public class TemplateDemo {

    public static void main(String[] args) {
        Sports sports=(Sports) new Cricket();
        sports.play();
        System.out.println();
        sports=new Badminton();
        sports.play();
    }

}
