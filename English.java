public class English implements LanguageCourse{
    @Override
    public void duration() {
        System.out.println("Course Duration: 3 months");
    }

    @Override
    public void price() {
        System.out.println("Course charges: Rs. 15000");
    }
}
