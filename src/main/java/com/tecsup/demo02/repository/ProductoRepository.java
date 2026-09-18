package com.tecsup.demo02.repository;

import com.tecsup.demo02.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
