public class Produto  {
  int id;
  int quantidade;
  boolean disponivel;
  int preco;
  int resultado;

  public Produto(int id, int quantidade, int preco) {
    this.id = id;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public int calcular() {
    if (id == 2) {
      preco*= 1.07;
    }
    resultado = quantidade * preco;
    return resultado;
  }
}