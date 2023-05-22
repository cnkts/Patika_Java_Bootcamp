public class Student {
    String name, stuNo, classes;
    Course course1, course2, course3;
    Double avarage, savarage;
    Boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.savarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1,int note2,int note3)
    {
        //Girilen Sınav-Yazılı Notu 0 ile 100 arasında mı kontrol ediliyor
        if(note1>=0 && note1<=100){
            this.course1.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.course2.note=note2;
        }
        if(note3>=0 && note3<=100){
            this.course3.note=note3;
        }
        System.out.println("Ders Notları Eklendi");
        //Eklenen notlar ekrana yazdırılıyor
        printNote();
    }
    void addBulkSNote(int snote1,int snote2,int snote3)
    {
        //Sözlü notları 0 ile 100 arasında mı kontrol ediliyor
        if(snote1>=0 && snote1<=100){
            this.course1.snote=snote1;
        }
        if(snote2>=0 && snote2<=100){
            this.course2.snote=snote2;
        }
        if(snote3>=0 && snote3<=100){
            this.course3.snote=snote3;
        }
        System.out.println("Sözlü Ders Notları Eklendi");
        //Eklenen sözlü notları ekrana yazdırılıyor
        printsNote();
    }
    void isPass(){
        //Yazılı notlarının ortalamasının %80 i alınıyor
        this.avarage=(this.course1.note+this.course2.note+this.course3.note)/3.0*0.80;
        //Sözlü notlarının ortalamasınız %20 si alınıyor
        this.savarage=(this.course1.snote+this.course2.snote+this.course3.snote)/3.0*0.20;
        //Alınan yüzdeler toplanıyor. Bu şekilde sınıf geçme notu hesaplanmış oldu.
        double result=avarage+savarage;
        //Sınıf Geçme Notu 55 ten büyükse sınıf geçildi
        if(result>=55){
            System.out.print("Yazılı Not Ortalamanız : "+this.avarage+"\t"+
                    "Sözlü Not Ortalamanız : "+this.savarage+"\n"+
                    "Sınıf Geçme Notunuz "+result+" Tebrikler Sınıfı Geçtiniz!"+
                    "\n*Yazılı notlarınızın %80'i ve Sözlü Notlarınızın %20 si alınarak sınıf geçme notunuz hesaplanmıştır.");
        }else {
            System.out.print("Sınıfı Geçemediniz.");
        }
    }
    void printNote(){
        System.out.println( this.course1.name+": "+ this.course1.note+"\t"+ this.course2.name+" :"+  this.course2.note+"\t"+ this.course3.name+" :"+ this.course3.note);
    }
    void printsNote(){
        System.out.println( this.course1.name+": "+ this.course1.snote+"\t"+ this.course2.name+" :"+  this.course2.snote+"\t"+ this.course3.name+" :"+ this.course3.snote);
    }
}