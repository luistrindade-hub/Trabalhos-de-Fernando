package ifrn.pi.eventos.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {

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
		
		
		return "evento-adicionado";

	}
}
