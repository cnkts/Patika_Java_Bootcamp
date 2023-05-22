public class Teacher {
    String Name;
    String Mpno;
    String Branch;

    Teacher(String name, String mpno, String branch) {

        this.Name = name;
        this.Mpno = mpno;
        this.Branch = branch;

    }

    void print() {
        System.out.print("İsim: " + this.Name + "\n Telefon : " + this.Mpno + "\n Bölüm: " + this.Branch);
    }

}