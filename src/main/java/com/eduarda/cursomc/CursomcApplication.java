package com.eduarda.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduarda.cursomc.domain.Categoria;
import com.eduarda.cursomc.domain.Cidade;
import com.eduarda.cursomc.domain.Cliente;
import com.eduarda.cursomc.domain.Endereco;
import com.eduarda.cursomc.domain.Estado;
import com.eduarda.cursomc.domain.ItemPedido;
import com.eduarda.cursomc.domain.Pagamento;
import com.eduarda.cursomc.domain.PagamentoComBoleto;
import com.eduarda.cursomc.domain.PagamentoComCartao;
import com.eduarda.cursomc.domain.Pedido;
import com.eduarda.cursomc.domain.Produto;
import com.eduarda.cursomc.domain.enums.EstadoPagamento;
import com.eduarda.cursomc.domain.enums.TipoCliente;
import com.eduarda.cursomc.repositories.CategoriaRepository;
import com.eduarda.cursomc.repositories.CidadeRepository;
import com.eduarda.cursomc.repositories.ClienteRepository;
import com.eduarda.cursomc.repositories.EnderecoRepository;
import com.eduarda.cursomc.repositories.EstadoRepository;
import com.eduarda.cursomc.repositories.ItemPedidoRepository;
import com.eduarda.cursomc.repositories.PagamentoRepository;
import com.eduarda.cursomc.repositories.PedidoRepository;
import com.eduarda.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}

	

}
