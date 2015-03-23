package co.com.eafit.conferre.data.dac;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.data.base.DAOGenerico;
import co.com.eafit.conferre.data.base.ObjetoTO;
import co.com.eafit.conferre.data.to.AsistenteTO;
import co.com.eafit.conferre.data.to.ClienteTO;

public class AsistenteDAO implements DAOGenerico {
	java.sql.Connection conn;

	public ObjetoTO crear(ObjetoTO parametro) {
		AsistenteTO conf = null;
		try {
			conf = (AsistenteTO) parametro;
			PreparedStatement prep = conn
					.prepareStatement("INSERT INTO conferencias values(?,?,?,?,?)");
			prep.setString(1, conf.getNombre());
			prep.setString(2, conf.getEmail());
			prep.setString(3, conf.getNombre_conferencia());
			prep.setInt(4, conf.getCedula());
			prep.setInt(5, conf.getTelefono());
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
