public class produto {
    String marca;
    String fabricante;
    String cod_barras;
    Float preco;

    void status(){
        System.out.println("marca: " + this.marca);
        System.out.println("fabricante: " + this.fabricante);
        System.out.println("codigo de barras: " + this.cod_barras);
        System.out.println("preco: " + this.preco);
    }
    
}