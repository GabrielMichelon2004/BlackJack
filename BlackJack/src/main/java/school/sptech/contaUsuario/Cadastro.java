package school.sptech.contaUsuario;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import school.sptech.banco.DAO;
import school.sptech.jogadores.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro implements DAO {
    static final Integer qntFichasQuinhentos = 2;
    private Integer fkFicha;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Integer respostaUsuario;
    private Boolean validacaoRespostaUsuario = false;
    Scanner scannerTexto = new Scanner(System.in);
    Scanner scannerNumero = new Scanner(System.in);


    public Cadastro(){}

    public void cadastrarUsuario(){
        con.update("INSERT INTO usuario(nome,sobrenome,email,senha) VALUES(?,?,?,?);",
                nome,sobrenome,email,senha);

    }

    public void getFkUsuario(){
       fkFicha = con.queryForObject("SELECT idUsuario FROM usuario ORDER BY idUsuario DESC LIMIT 1;", Integer.class  );
    }

    public void cadastrarFicha(){
        con.update("INSERT INTO ficha(qntFichasQuinhentos,fkUsuario) VALUES(?,?) ;",
                getQntFichasQuinhentos(),getFkFicha());
    }


    public void cadastrar(){
        System.out.println("Deseja se cadastrar?\n1 - Sim\n2 - Não");
        respostaUsuario = scannerNumero.nextInt();
        if (respostaUsuario == 1){
            validacaoRespostaUsuario = true;
        }


        if (validacaoRespostaUsuario == true){
            System.out.println("Cadastro\n Digite seu nome:");
            nome = scannerTexto.nextLine();
            System.out.println("Cadastro\n Digite seu sobrenome:");
            sobrenome = scannerTexto.nextLine();
            System.out.println("Cadastro\n Digite seu email:");
            email = scannerTexto.nextLine();
            System.out.println("Cadastro\n Digite seu senha:");
            senha = scannerTexto.nextLine();
            cadastrarUsuario();
            getFkUsuario();
            cadastrarFicha();
        }else {
            System.out.println("Indo para o login");
        }

    }



    public Integer getQntFichasQuinhentos() {
        return qntFichasQuinhentos;
    }

    public Integer getFkFicha() {
        return fkFicha;
    }
}
