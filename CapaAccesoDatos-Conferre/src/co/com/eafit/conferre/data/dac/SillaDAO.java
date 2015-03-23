package co.com.eafit.conferre.data.dac;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.data.base.DAOGenerico;
import co.com.eafit.conferre.data.base.ObjetoTO;
import co.com.eafit.conferre.data.to.SillaTO;

public class SillaDAO implements DAOGenerico {
	java.sql.Connection conn;

	public ObjetoTO crear(ObjetoTO parametro) {
		SillaTO conf = null;
		try {
			conf = (SillaTO) parametro;
			PreparedStatement prep = conn
					.prepareStatement("INSERT INTO conferencias values(?,?)");
			prep.setString(1, conf.getType());
			prep.setInt(2, conf.getStock());
			int resultado = prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
	}

	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
