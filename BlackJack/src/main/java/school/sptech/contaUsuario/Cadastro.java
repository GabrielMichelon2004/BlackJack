package school.sptech.contaUsuario;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import school.sptech.jogadores.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Cadastro extends Usuario{
    static final Integer qntFichasQuinhentos = 2;
    private Integer fkFicha;

    public Cadastro(String nome, String sobrenome, String email, String senha) {
        super(nome, sobrenome, email, senha);
    }

    public void cadastrarUsuario(){
        con.update("INSERT INTO usuario(nome,sobrenome,email,senha) VALUES(?,?,?,?);",
                getNome(),getSobrenome(),getEmail(),getSenha());

    }

    public void getFkUsuario(){
        List<Integer> valorBanco = new ArrayList<>();
       valorBanco = con.query("SELECT idUsuario FROM usuario ORDER BY idUsuario DESC LIMIT 1;",new BeanPropertyRowMapper<>());
        for (Integer valor:valorBanco) {
            fkFicha = valor;
        }
    }

    public void cadastrarFicha(){
        con.update("INSERT INTO ficha(qntFichasQuinhentos) VALUES(?) WHERE fkUsuario = ?;",
                getQntFichasQuinhentos(),);
    }



    public Integer getQntFichasQuinhentos() {
        return qntFichasQuinhentos;
    }

    public Integer getFkFicha() {
        return fkFicha;
    }
}
