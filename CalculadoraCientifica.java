public class CalculadoraCientifica {
    public double raiz (int i1) {
        return Math.sqrt(i1);
    }
    public double raiz (double i1) {
        return Math.sqrt(i1);
    }
    public double raiz (String i1) {
        return Math.sqrt(Double.parseDouble(i1));
    }
    public double potencia (byte a,byte b){
        return Math.pow(a, b);
    }
    public double potencia (String a,String b){
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }
    public double potencia (int a, double b){
        return Math.pow(a, b);
    }
}
