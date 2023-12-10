package school.sptech.usuario;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import school.sptech.banco.DAO;

public class Usuario implements DAO {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Integer dinheiro;

     public void dinheiroDoUsuario(){
         con.query("SELECT * FROM ficha WHERE email = ? AND senha = ?"
                 , new BeanPropertyRowMapper<>(Usuario.class));
     }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Integer dinheiro) {
        this.dinheiro = dinheiro;
    }
}
