import entidades.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Harry Potter", "sei la o autor", 500 , 560.0);
        System.out.println(l1.toString());

        Livro l2 = new Livro("livro 2 ", "sei la");
        System.out.println(l2.toString());
    }
}