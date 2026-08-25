package ifrn.pi.eventos.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	// PASSO 1: Método executado ao submeter o formulário
	@PostMapping("/eventos/passo1")
	public String salvarPasso1() {
		System.out.println("Formulário submetido com sucesso!");
		return "formEvento";
	}
	
	@PostMapping("/eventos") 
	public String salvar(Evento evento) {
		System.out.println("Nome: " + evento.getNome() + " | Local: " + evento.getLocal() + " | Data: " + evento.getData() + " | Horário: " + evento.getHorario()); return "formEvento"; 
		}
	}

