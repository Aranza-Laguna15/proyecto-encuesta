package org.encuesta.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UsuariosDelete implements RowMapper<Usuario>{

	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario us= new Usuario();
		us.setIdDelete(rs.getInt("id_eliminado"));
		us.setUsername(rs.getString("username"));
		us.setPassword(rs.getString("password"));
		us.setName(rs.getString("name"));
		us.setEnabled(rs.getBoolean("enabled"));
		us.setfechaDelete(rs.getString("fecha_eliminacion"));
		us.setEliminadoPor(rs.getString("eliminado_por"));
		
		return us;
	}

}
