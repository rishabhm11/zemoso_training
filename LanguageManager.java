public class LanguageManager {
    private LanguageCourse english;
    private LanguageCourse spanish;
    private LanguageCourse french;
    public LanguageManager(){
        english=new English();
        spanish=new Spanish();
        french=new French();
    }
    public void englishCourse(){
        english.duration();
        english.price();
    }
    public void spanishCourse(){
        spanish.duration();
        spanish.price();
    }
    public void frenchCourse(){
        french.duration();
        french.price();
    }
}
