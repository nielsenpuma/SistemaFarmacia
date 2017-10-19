package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.app.beans.ProductoDTO;
import com.app.interfaces.ProductoDAO;
import com.app.utils.MysqlDBConexion;

public class MysqlProductoDAO implements ProductoDAO {

	@Override
	public ProductoDTO buscarProducto(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoDTO> listarProducto() {
		List<ProductoDTO> data = new ArrayList<ProductoDTO>();
		ProductoDTO obj = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select * from producto";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				obj = new ProductoDTO();
				obj.setCod_pro(rs.getString(1));
				obj.setDesc_pro(rs.getString(2));
				obj.setPre_pro(rs.getDouble(3));
				obj.setStk_act(rs.getInt(4));
				obj.setStk_min(rs.getInt(5));
				obj.setUnid_med(rs.getString(6));
				obj.setFec_ven(rs.getString(7));
				
				// obj.setCod_lab(rs.getLaboratorioDTO);
				// obj.setCod_cat(rs.getObject(9));
				data.add(obj);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * finally { try { if (rs!=null)rs.close(); if (pstm!=null)pstm.close(); if
		 * (cn!=null)cn.close(); } catch (Exception e2) { e2.printStackTrace(); } }
		 */

		return data;
	}

	@Override
	public int registrarProducto(ProductoDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarProducto(ProductoDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarProducto(int cod) {
		// TODO Auto-generated method stub
		return 0;
	}

}
