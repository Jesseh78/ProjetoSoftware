package entidades;

public class Roupas {
   public String marca, tipo, tamanho;
   public int quantidade;
   public double valor;

   public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
       this.marca = marca;
       this.tipo = tipo;
       this.tamanho = tamanho;
       this.quantidade = quantidade;
       this.valor = valor;
   }
   public double totalEstoque() {
       return valor * quantidade;
   }
   public double adicionarEstoque(int quantidade) {
       return quantidade += this.quantidade;
   }
}
