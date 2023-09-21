package br.com.fiap.run;


import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import br.com.fiap.ws.service.ClienteService;
import br.com.fiap.ws.service.ClienteServiceImpl;

public class RunService {

	public static void main(String[] args) {
		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");

		ClienteService service = new ClienteServiceImpl();
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(ClienteService.class);
		factory.setAddress("http://localhost:8080/cliente");
		factory.setServiceBean(service);
		factory.create();
		System.out.println("Servico publicados!");
	}

}
