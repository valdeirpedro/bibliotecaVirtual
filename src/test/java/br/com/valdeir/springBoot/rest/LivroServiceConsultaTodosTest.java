package br.com.valdeir.springBoot.rest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.valdeir.springBoot.dao.LivroDao;
import br.com.valdeir.springBoot.modelo.Livro;
import br.com.valdeir.springBoot.modelo.Tipo;
import br.com.valdeir.springBoot.modelo.builder.LivroBuilder;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
public class LivroServiceConsultaTodosTest {

	// Essa anotacao amarra a implementacao automaticamente a interface
	@Autowired
	private TestRestTemplate template;
	
	@MockBean
    private LivroDao livrodao;

	
	@Test
	public void deve_retornar_todos_caso_exista_algum() {
		when(this.livrodao.consultarTodos()).thenReturn(listaDeLivroMock());
		ResponseEntity resp = this.template.getForEntity("/livro",List.class);
		List<Livro> livros = (List<Livro>) resp.getBody();
		verify(this.livrodao, times(1)).consultarTodos();
		assertEquals(1, livros.size());
		assertEquals(HttpStatus.OK, resp.getStatusCode());
	}
	
	@Test
	public void deve_retornar_404_caso_nenhum_livro_exista() {
		when(this.livrodao.consultarTodos()).thenReturn(new ArrayList<Livro>());
		assertEquals(HttpStatus.NOT_FOUND, this.template.getForEntity("/livro", String.class)
														.getStatusCode());
		verify(this.livrodao, times(1)).consultarTodos();
	}
	
	private List<Livro> listaDeLivroMock(){
		LivroBuilder builder = new LivroBuilder();
		Livro livro = builder.comId(1).comTitulo("Livro 1")
			   .deTipo(Tipo.FISICO).paraEdicao("1")
			   .adicionaAutor(1, "Valdeir")
			   .adicionaAutor(2, "Pedro")
			   .build();
		return Arrays.asList(livro);
	}	
}
