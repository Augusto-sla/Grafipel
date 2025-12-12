package Grafipel;

public class Pessoa {
  // Atributos
  private String nome;
  private int idade;
  private String sexo;

  // Método personalizado
  public void FazerAniversario() {
    this.idade++;
  }

  // Método construtor
  public Pessoa(String nome, String sexo, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
  }
  
  // Métodos especiais
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
