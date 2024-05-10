package eus.birt.dam.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.birt.dam.domain.Evento;
import eus.birt.dam.repository.EventoRepository;


@CrossOrigin (origins= {"http://localhost:4200"}) 
//@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class EventoController {

	@Autowired
	EventoRepository eventoRepository;
	
	/**
	 * Imprime todos los eventos
	 * @return
	 */
	@GetMapping("/eventos")
	public ResponseEntity<List<Evento>> index() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        return new ResponseEntity<List<Evento>>(eventos, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<Evento>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	
	/**
	 * Imprime todos los eventos pero solo el nombre
	 * @return
	 */
	@GetMapping("/eventos/nombre")
	public ResponseEntity<List<String>> indexNombre() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        List<String> nombreEventos = new ArrayList<>();
	        for (Evento evento : eventos) {
	        	nombreEventos.add(evento.getDocumentName());
	        }
	        return new ResponseEntity<List<String>>(nombreEventos, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	
	/**
	 * Imprime los diferentes idiomas
	 * */
	@GetMapping("/idioma")
	public ResponseEntity<List<String>> getAllLanguages() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        
	        Set<String> idiomas = new HashSet<>();
	        for (Evento evento : eventos) {
	        	idiomas.add(evento.getEventLanguages());
	        }
	        
	        List<String> listaIdiomas = new ArrayList<>(idiomas);
	        Collections.sort(listaIdiomas);
	        return new ResponseEntity<List<String>>(listaIdiomas, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	/**
	 * Imprime los diferentes tipos de evento
	 * */
	@GetMapping("/tipos")
	public ResponseEntity<List<String>> getAllTypes() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        
	        Set<String> tipos = new HashSet<>();
	        for (Evento evento : eventos) {
	        	tipos.add(evento.getEventType());
	        }
	        
	        List<String> listaTipos = new ArrayList<>(tipos);
	        Collections.sort(listaTipos);
	        return new ResponseEntity<List<String>>(listaTipos, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
}
