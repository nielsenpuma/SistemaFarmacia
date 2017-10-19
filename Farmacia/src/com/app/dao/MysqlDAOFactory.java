package com.app.dao;
import com.app.interfaces.*;

public class MysqlDAOFactory extends DAOFactory {
	@Override
	public EmpleadoDAO getEmpleado() {
		return new MysqlEmpleadoDAO();
	}
	@Override
	public ClienteDAO getCliente() {
		return new MysqlClienteDAO();
	}
	@Override
	public ProductoDAO getProducto() {
		return new MysqlProductoDAO();
	}
	@Override
	public FacturaDAO getFactura() {
		return new MysqlFacturaDAO();
	}
	@Override
	public BoletaDAO getBoleta() {
		return new MysqlBoletaDAO();
	}
}
