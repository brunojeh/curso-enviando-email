package enviando.email;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	

	
	@org.junit.Test
	public void testeEmail() throws Exception{
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá <br/><br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso do curso de java. <br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
		
		stringBuilderTextoEmail.append("<b>Login:</b> bruno@bruno.com<br/>");
		stringBuilderTextoEmail.append("<b>Senha:</b> 123456<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blanck\" href=\"http://projetojavaweb.com/certificado-aluno/login\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-radius:30px; font-size:20px; font-family:courier; border : 3px solid green; background-color:#99da39;\">Acessar portal do aluno</a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\"font-size:8px\">Ass.: Alex do JDev Treinamento</span>");
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("brunojeh2105@gmail.com",
														   "brunoareda.caldeira@gmail.com", 
				                                           "Testando email com java",
				                                           stringBuilderTextoEmail.toString());
		enviaEmail.enviarEmailAnexo(true);
		
		/*Caso o email não esteja sendo enviando então
		 * coloque um tempo de espera mais isso so pode
		 * ser usado para testes */
		Thread.sleep(5000);
		
	}
    
}
