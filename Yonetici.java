public class Yonetici extends Calisan{
    int sorumlu_kisi_sayisi;
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayı sayısı: " + sorumlu_kisi_sayisi);

    }
    public void zamYap(int zamMiktari){

        System.out.println(getAd() + " çalışanlara " + zamMiktari + " TL zam yapıyor." );
    }
}
