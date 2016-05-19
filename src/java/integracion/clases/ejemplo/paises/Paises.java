/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clases.ejemplo.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;

/**
 *
 * @author ProyectoEspecialidadTeam3
 */
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAirports")
    public String[] getAirports(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        Airport a = new Airport();
        AirportSoap aSoap = a.getAirportSoap();
        String cities = gwSoap.getCitiesByCountry(pais);
        String airports = aSoap.getAirportInformationByCountry(pais);
        
        String[] result = new String[2];
        result[0] = cities;
        result[1] = airports;
        
        return result;
    }
}
