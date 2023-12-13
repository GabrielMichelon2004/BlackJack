package school.sptech;


import school.sptech.baralho.BaralhoCompleto;
import school.sptech.contaUsuario.Login;
import school.sptech.jogadores.Usuario;

public class Main {
    public static void main(String[] args) {

        /*
        BaralhoCompleto baralhoCompleto = new BaralhoCompleto();
        baralhoCompleto.criandoDeck();
        System.out.println(baralhoCompleto);

         */

        Login login = new Login();
        login.fazerLogin();


    }
}