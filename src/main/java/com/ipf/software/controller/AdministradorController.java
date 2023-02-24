package com.ipf.software.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipf.software.model.Producto;
import com.ipf.software.service.ProductoService;

import java.util.*;

@Controller
@RequestMapping("/administrador")

public class AdministradorController {

@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String home(Model model) {
		List<Producto> productos = productoService.findAll();
		model.addAttribute("productos", productos);
		
		return "administrador/home";
	}
}
