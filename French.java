public class French implements LanguageCourse{
    @Override
    public void duration() {
        System.out.println("Course Duration: 6 months");
    }

    @Override
    public void price() {
        System.out.println("Course charges: Rs.25000");
    }
}
