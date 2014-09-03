package org.projectws.webservices;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface CalculadoraWebService {
	double calcular(@WebParam(name = "x") double x,
					@WebParam(name = "y") double y);
}
