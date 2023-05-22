public class Main {
    public static void main(String[] args) {

        //Teacher Sınıfından 3 Öğretmen Nesnesi Türetildi
        Teacher teacher1 = new Teacher("Mehmet", "505252525", "TRH");
        Teacher teacher2 = new Teacher("Şevval", "505252525", "MAT");
        Teacher teacher3 = new Teacher("Ahmet", "505252525", "TR");
        //Course Sınıfından 3 Ders Nesnesi Türetildi
        Course course1 = new Course("Tarih", "101", "TRH");
        Course course2 = new Course("Matematik", "102", "MAT");
        Course course3 = new Course("Türkçe", "103", "TR");
        //Derslere Çğretmenler Atandı
        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher3);
        //Student Sınıfından bir Öğrenci nesnesi türetildi
        Student s1 = new Student("şaban", "111", "4",course1,course2,course3);
        //Sınav-Yazılı Notları
        s1.addBulkExamNote(100,50,90);
        //Sözlü Notları
        s1.addBulkSNote(100,50,100);
        //Sınıf Geçti mi? Kaldı mı?
        s1.isPass();

    }
}

