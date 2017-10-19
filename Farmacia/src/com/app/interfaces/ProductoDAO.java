package com.app.interfaces;

import com.app.beans.ProductoDTO;
import java.util.List;

public interface ProductoDAO {
	public ProductoDTO buscarProducto(int cod);

	public List<ProductoDTO> listarProducto();

	public int registrarProducto(ProductoDTO obj);

	public int actualizarProducto(ProductoDTO obj);

	public int eliminarProducto(int cod);
}
