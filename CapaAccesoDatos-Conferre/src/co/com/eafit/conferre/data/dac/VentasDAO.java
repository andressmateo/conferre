package co.com.eafit.conferre.data.dac;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.data.base.DAOGenerico;
import co.com.eafit.conferre.data.base.ObjetoTO;
import co.com.eafit.conferre.data.to.VentasTO;;

public class VentasDAO implements DAOGenerico {

	java.sql.Connection conn;

	public ObjetoTO crear(ObjetoTO parametro) {
		VentasTO conf = null;
		try {
			conf = (VentasTO) parametro;
			PreparedStatement prep = conn
					.prepareStatement("INSERT INTO conferencias values(?,?,?,?)");
			Date fecha = new Date(conf.getFecha().getTime());
			prep.setDate(1, fecha);
			prep.setString(2, conf.getCedula_cliente());
			prep.setInt(3, conf.getCantidad());
			prep.setDouble(4, conf.getValor());
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
