package co.com.eafit.conferre.data.dac;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.data.base.DAOGenerico;
import co.com.eafit.conferre.data.base.ObjetoTO;
import co.com.eafit.conferre.data.to.ConferenciaTO;
import co.com.eafit.conferre.data.to.ClienteTO;;

public class ClienteDAO implements DAOGenerico {

	java.sql.Connection conn;

	public ObjetoTO crear(ObjetoTO parametro) {
		ClienteTO conf = null;

		try {
			conf = (ClienteTO) parametro;
			PreparedStatement prep = conn
					.prepareStatement("INSERT INTO conferencias values(?,?,?,?)");
			prep.setString(1, conf.getNombre());
			prep.setString(2, conf.getEmail());
			prep.setInt(3, conf.getCedula());
			prep.setInt(4, conf.getTelefono());
			int resultado = prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
	}

	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		// TODO Auto-generated method stub
		return null;
	}

	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		// TODO Auto-generated method stub
		return null;
	}

	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}