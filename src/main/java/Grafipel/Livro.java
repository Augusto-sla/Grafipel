package Grafipel;

public class Livro implements Publicacao {
  // Atributos
  private String titulo;
  private String autor;
  private int totPage;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  // Método personalizado
  public String detalhes() {
    return  "Livro{" +
            "titulo=" + titulo + '\'' +
            ", autor=" + autor + '\'' +
            ", total de páginas=" + totPage + '\'' +
            ", pagina atual=" + pagAtual + '\'' +
            ", aberto? " + ((aberto) ? " sim" : " não") +
            ", leitor=" + leitor.getNome();
  }

  // Método construtor
  public Livro(String titulo, String autor, int totPage, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPage = totPage;
    this.pagAtual = 1;
    this.aberto = false;
    this.leitor = leitor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPage() {
    return totPage;
  }

  public void setTotPage(int totPage) {
    this.totPage = totPage;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public boolean getAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto){
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }


  @Override 
  public void abrir() {
    if (aberto) {
      System.out.println("O livro ja ta aberto, mongoloide");
    } else{
          this.setAberto(true);
    }
  }

  @Override
  public void fechar() {
    if (!aberto) {
      System.out.println("O livro ja ta fechado, mongoloide");
    } else{
          this.setAberto(false);
    }
  }

  @Override
  public void folhear(int p) {
    if (p > totPage || p <= 0) {
      System.out.println("Pagina inválida");
    } else {
      this.aberto = true;
      this.pagAtual = p;
    }
  }

  @Override
  public void avancarPag() {
    if ((pagAtual + 1) > totPage) {
      System.out.println("Já está na ultima página");
    } else {
      pagAtual++;
    }
  }

  @Override
  public void voltarPag() {
    if ((pagAtual - 1) <=0) {
      System.out.println("Já está na primeira página");
    } else {
          this.pagAtual--;
    }
  }

}
