public class Ex04 {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        System.out.println(calculadora.raiz("16"));
        System.out.println(calculadora.raiz(16.0));
        System.out.println(calculadora.raiz(25));
        System.out.println(calculadora.potencia("2", "4"));
        System.out.println(calculadora.potencia(1, 2.0));
    }  
}
