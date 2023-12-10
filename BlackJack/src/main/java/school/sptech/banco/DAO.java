package school.sptech.banco;

import org.springframework.jdbc.core.JdbcTemplate;

public interface DAO {

    static final Conexao conexao = new Conexao();
    static final JdbcTemplate con = conexao.getConexao();


}
