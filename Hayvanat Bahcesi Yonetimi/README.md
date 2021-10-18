# Hayvanat Bahçesi Yönetimi UML Diyagram

_______________________________________________

Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyoruz.

* Hayvanlar;
  * Atlar (atlar, zebralar, eşekler vb.),
  * Kedigiller (kaplanlar, aslanlar vb.),
  * Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
* Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır. (tür adı, ağırlığı, yaşı vb.)
* Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
* Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()

Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarladık.

Bunun gibi daha fazla bilgi için [tıklayınız](https://f-yesilyurt.medium.com/).

![](https://github.com/furkanyesilyurt/patika-object-oriented-programming/blob/b5cabb9894abbf16ed683905f57b4f03525aa5b2/Hayvanat%20Bahcesi%20Yonetimi/hayvanat-bahcesi-y%C3%B6netimi.PNG)