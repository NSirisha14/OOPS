package OOPS.Youtube;

public class TestVedios {
    public static void main(String[] args)
    {
        Vedios vedios=new Offline();
        vedios.play();
        vedios=new Online();
        vedios.play();
        Offline offline=new Offline();
        offline.delete();

        Online online=new Online();
        online.like();;
        online.comment();
    }
}
