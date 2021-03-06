package com.app.dao;

import com.app.interfaces.*;

public abstract class DAOFactory {
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	public static final int DB2 = 3;
	public static final int SQLSERVER = 4;
	public static final int XML = 5;

	public abstract EmpleadoDAO getEmpleado();

	public abstract ClienteDAO getCliente();

	public abstract ProductoDAO getProducto();

	public abstract FacturaDAO getFactura();

	public abstract BoletaDAO getBoleta();

	public static DAOFactory getDAOFactory(int whichFactory) {
		switch (whichFactory) {
		case MYSQL:
			return new MysqlDAOFactory();
		case ORACLE:
			// return new OracleDAOFactory();
		case DB2:
			// return new Db2DAOFactory();
		case SQLSERVER:
			// return new SqlServerDAOFactory();
		case XML:
			// return new XmlDAOFactory();
		}
		return null;
	}
}
