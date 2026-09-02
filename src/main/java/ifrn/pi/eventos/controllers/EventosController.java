package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;

@Controller
public class EventosController {
	
	//ta dando erro aqui, video parado la pelos 45 pra cima!!
	
	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos/passo1")
	public String salvarPasso1() {
		System.out.println("Formulário submetido com sucesso!");
		return "formEvento";
	}

	@RequestMapping(path = "/eventos", method = RequestMethod.POST)
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		
		return "evento-adicionado";

	}
}
