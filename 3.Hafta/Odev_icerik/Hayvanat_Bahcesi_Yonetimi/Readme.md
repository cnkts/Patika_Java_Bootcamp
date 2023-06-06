#  Zoo Management System Class Diagram
Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyoruz.

Hayvanlar:
Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.

Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlandı

<img src="Animal.jpg">

## Author

👤 **Can A.**

- LinkedIn: [Can A.](https://www.linkedin.com/in/can-a-2929a0250/)
- GitHub: [Can A.](https://github.com/cnkts)
- Twitter: [@cn_coderr](https://twitter.com/cn_coderr)

## Show your support

Give a ⭐️ if you like this project!

## Acknowledgments

- This repo is created for www.patika.dev and www.kodluyoruz.org 6 Months Full Stack Development Practicum
