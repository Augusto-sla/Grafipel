package Grafipel;

public class Main {
  public static void main(String[] args) {
    System.out.println("h");
    Pessoa[]p = new Pessoa[2];
    Livro[]l = new Livro[3];

    p[0] = new Pessoa("Lais", "F", 17);
    p[1] = new Pessoa("bruno", "M", 17);

    l[0] = new Livro("verity", "Collen Hoover", 320, p[0]);

    l[0].folhear(100);

    System.out.println(l[0].detalhes());

  }
}
