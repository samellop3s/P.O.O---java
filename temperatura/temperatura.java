public class temperatura {
    public static void main(String[] args) {
        
        //double serve para armazenar valorez de ponto-flutuante
        double  C, K, F, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Kelvin (K) é: " + K);
        System.out.println("A temperatura em Réaumur (Re) é: " + Re);
        System.out.println("A temperatura em Rankine (Ra) é: " + Ra);
        System.out.println("A temperatura em Fahrenheit (F) é: " + F);
    }
}