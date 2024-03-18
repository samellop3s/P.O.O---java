public class testarproduto {
    public static void main(String[] args) {
        produto pacote = new produto();
        pacote.marca = "camisa";
        pacote.fabricante = "nike";
        pacote.cod_barras = "8949461894984651564891665489646311668";
        pacote.preco = 1000000.00f ;
        pacote.status();
    }
}
