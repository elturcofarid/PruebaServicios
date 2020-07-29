package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/redis")
public class ZonaControlador {




	@RequestMapping(value = "/zonas", method = RequestMethod.GET)
	public Object getZonas() {
		//return IZona.zonasActivas();
		return "zonas";
	}

}
