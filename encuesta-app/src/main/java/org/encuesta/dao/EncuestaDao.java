package org.encuesta.dao;

import java.util.Date;
import java.util.List;

import org.encuesta.domain.Encuesta;

public interface EncuestaDao {
	boolean saveEncuesta(Encuesta encuesta);
	boolean editEncuesta(Encuesta encuesta);
	List<Encuesta> findEncuestas(Date d1,Date d2);
	List<Encuesta> findEncuestas(Date d1,Date d2,String username);
	Encuesta findEncuesta(int idEncuesta);
}
