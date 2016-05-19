/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clases.ejemplo.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ProyectoEspecialidadTeam3
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "operando1") double operando1,@WebParam(name = "operando2") double operando2) {
        return operando1+operando2;
    }
}
