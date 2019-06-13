package loja;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrinhoController {

	@RequestMapping("api/carrinho")
	public String listaCarrinho(){	
		return "Lista de Carrinho";		
	}	
	@RequestMapping(value="/api/carrinho/{id}", method=RequestMethod.GET)
	public String carrinho(@PathVariable("id") Long id) {
		return "Retorna um unico carrinho";
	}
	@RequestMapping(value="/api/carrinho/{id}", method=RequestMethod.DELETE)
	public String deleteCarrinho(@PathVariable("id") Long id) {	
		return "Deleta Carrinho";
	}
	@RequestMapping(value="/api/carrinho/{id}", method=RequestMethod.PUT)
	public String updateCarrinho(@PathVariable("id") Long id, @RequestParam String nome) {			
		return "Altera carrinho";
	}
	@RequestMapping(value="/api/carrinho/{id}", method=RequestMethod.POST)
	public String criaCarrinho(@PathVariable("id") Long id, @RequestParam String nome) {			
		return "Cria carrinho";
	}

}
