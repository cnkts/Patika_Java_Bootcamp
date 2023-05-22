public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int snote;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.snote = 0;
    }

    void addTeacher(Teacher teacher) {
        //Öğretmen branşı ve ders aynı ise derse öğretmen ekleniyor
        if (this.prefix.equals(teacher.Branch)) {
            this.teacher = teacher;
            System.out.print("Öğretmen Eklendi");
        } else {
            System.out.println("Öretmen Branş Uyumsuzluğu var. Öğretmen Eklenemedi");
        }
    }
}