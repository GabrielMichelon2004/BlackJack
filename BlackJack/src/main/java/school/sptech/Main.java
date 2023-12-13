package school.sptech;


import school.sptech.jogadores.Usuario;

public class Main {
    public static void main(String[] args) {
/*
        Usuario usuario = new Usuario(
                "Gabriel",
                "Michelon",
                "gabriel@gmail.com",
                "123456",
                1000
        );

 */


        Usuario usuario = new Usuario();

        usuario.dadosUsuario();

        System.out.println(usuario);




    }
}