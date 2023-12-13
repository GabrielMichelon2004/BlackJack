package school.sptech.contaUsuario;

import school.sptech.jogadores.Usuario;

import java.util.Scanner;

public class Login{

    private String email;
    private String senha;
    private Boolean loginVerificado = false;
    Scanner scannerTexto = new Scanner (System.in);
    Scanner scannerNumero = new Scanner (System.in);



    public void fazerLogin(){

        System.out.println("Login:\nDigite seu email:");
        email = scannerTexto.nextLine();
        System.out.println("Digite sua senha:");
        senha = scannerTexto.nextLine();

        Usuario usuario = new Usuario(this.email,this.senha);
        usuario.dadosUsuario();
        if (usuario.getListaDadosUsuario().isEmpty()){
            System.out.println("Email ou senha errado");
            loginVerificado = false;
        }else {
            System.out.println("Cadastro realizado");
            loginVerificado = true;
        }

    }





}
