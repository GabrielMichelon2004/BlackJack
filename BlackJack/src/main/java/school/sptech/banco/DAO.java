package school.sptech.banco;

import org.springframework.jdbc.core.JdbcTemplate;

public interface DAO {

    Conexao conexao = new Conexao();
    JdbcTemplate con = conexao.getConexao();


}
