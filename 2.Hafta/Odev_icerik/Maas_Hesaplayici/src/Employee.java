public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0.0;
        if (this.salary > 1000) {//Maaş 1000 tl den büyükse
            tax = (salary * 0.03); // maaştan %3 vergi kes
        }
        return tax;
    }

    double bonus() {
        int overtime;
        int bonus = 0;
        if (this.workHours > 40) { //eğer haftalık çalışma saati 40 saatten fazlaysa
            overtime = (this.workHours - 40); //haftalık saatten fazla çalışauı çıkar
            bonus = overtime * 30; //fazla çalışılan toplam saati 30 tl ile çarp. fazla çalışma ücreti hesaplandı.
        }

        return bonus; //Metodun çağrıldığı yere fazla çalışma ücertini gönder.
    }

    double raiseSalary() {
        int currentYear = 2021;
        double increase = 0.0;
        int seniority = 2021 - hireYear;  //güncel yıldan işe başlama yılını çıkartıp çalışanın kıdemi bulunur
        if (seniority < 10) {               //10 yıldan az sa maaşın %5 i zam olarak hesaplanır
            increase = (this.salary * 5 / 100);
            return increase;
        } else if (seniority == 10 && seniority <= 19) {  //10 yıl ve üzeri 19 yıl altı maaş zammı %10
            increase = (this.salary * 10 / 100);
            return increase;
        } else if (seniority >= 20) { //20 yıl ve üzeri maaş zammı %15
            increase = (this.salary * 15 / 100);
            System.out.println("Maaş Artışı : " + increase);
            return increase;
        }
        return increase;
    }

    void writeEmpInfo() { //Çalışan Bilgilerini Ekrana Yazdıran Metod
        System.out.println("Adı : " + this.name + "\n" + "" +
                "Maaşı : " + this.salary + "\n" + "" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax() + "\n" + "" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi Kesintisi ve Fazla Çalışma Ücretiyle Hesaplantıktan Sonra Zamlı Toplam Maaş : " + ((this.salary + bonus()) - tax() + raiseSalary()) + "\n");

    }
}

