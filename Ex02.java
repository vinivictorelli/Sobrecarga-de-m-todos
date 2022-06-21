public class Ex02 {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        System.out.println(impressora.exibir(0.9f));
        System.out.println(impressora.exibir(1f, 2f));
        System.out.println(impressora.exibir(1f, "s1"));
        System.out.println(impressora.exibir("s1", 1f));
        System.out.println(impressora.exibir("s1", "s2", "S3"));
        System.out.println(impressora.exibir(1, 2, "s1"));
    }
}
