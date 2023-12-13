package school.sptech.jogadores;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import school.sptech.banco.DAO;

import java.util.List;

public class Usuario implements DAO {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private Integer dinheiro;
    private List<Usuario> listaDadosUsuario;


    public Usuario(){}
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void dadosUsuario(){
        listaDadosUsuario   = con.query("SELECT * FROM usuario WHERE email = ? AND senha = ?"
                , new BeanPropertyRowMapper<>(Usuario.class),getEmail(),getSenha());

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

    public List<Usuario> getListaDadosUsuario() {
        return listaDadosUsuario;
    }

    public void setListaDadosUsuario(List<Usuario> listaDadosUsuario) {
        this.listaDadosUsuario = listaDadosUsuario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobrenome='").append(sobrenome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", senha='").append(senha).append('\'');
        sb.append(", dinheiro=").append(dinheiro);
        sb.append(", listaDadosUsuario=").append(listaDadosUsuario);
        sb.append('}');
        return sb.toString();
    }
}
