Çalışan Yönetim Sistemi (Java OOP)

Bu proje, Java’da OOP (Nesne Yönelimli Programlama) konularını pekiştirmek için geliştirdiğim basit bir çalışan yönetim uygulamasıdır.
Amaç; sınıflar arası ilişkiyi, kalıtımı ve temel OOP yapısını küçük bir senaryo üzerinde görmek.

Genel Bakış

Projede üç farklı sınıf bulunuyor:

Calisan

Temel sınıf

Ad, soyad, maaş gibi özellikler içerir

Yazilimci

Calisan sınıfından türeyen alt sınıf

Ek olarak bildiği programlama dillerini tutar

Basit bir örnek olarak “format atma” işlemi içerir

Yonetici

Calisan sınıfından türeyen alt sınıf

Sorumlu olduğu kişi sayısı bulunur

Çalışana zam yapma metodu vardır

Konsol üzerinde çalışan menüyle kullanıcı, bu iki çalışan türü arasında geçiş yaparak işlem gerçekleştirebilir.

Uygulamada Kullanılan OOP Mantığı

Inheritance: Alt sınıflar temel sınıftan türetilmiştir

Encapsulation: Değişkenler private, erişimler getter/setter ile yapılır

Constructor: Her sınıf kendi kurucu metoduna sahiptir

Metot Kullanımı: Alt sınıfların kendine ait fonksiyonları vardır

Bu yapı sayesinde OOP’nin temel prensipleri pratik bir şekilde uygulanmış oldu.

Proje Yapısı
src/
 ├─ Calisan.java
 ├─ Yazilimci.java
 ├─ Yonetici.java
 └─ Main.java

Nasıl Çalıştırılır?

Projeyi indirin veya klonlayın

Main.java dosyasını çalıştırın

Konsolda çıkan menü üzerinden işlemleri seçin

Amaç ve Notlar

Bu proje tamamen OOP mantığını pekiştirmek için hazırlanmıştır.
İlerleyen zamanlarda daha gelişmiş bir sürüm eklemeyi planlıyorum (örneğin dosya kaydı, ek çalışan türleri, farklı menüler vb.)

Geri bildirimlere açık bir proje.
