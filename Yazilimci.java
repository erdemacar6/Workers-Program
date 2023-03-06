public class Yazilimci extends Calisan{
    String diller;
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formaAT(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + " işletim sistemini yüklüyor.");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller : " + diller);
    }
}
