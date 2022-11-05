package br.edu.infnet.apppetshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.UsuarioService;

@SessionAttributes("autenticado")
@Controller
public class AuthController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha);

		if (usuario != null) {
			model.addAttribute("autenticado", usuario);
			return "home";
		}

		return "login";
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {

		status.setComplete();
		
		session.removeAttribute("autenticado");
		
		return "redirect:/";
	}
}
