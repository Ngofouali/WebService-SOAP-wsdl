package com.icodi.banqueservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWebService")
public class BanqueService {

    //Convertir un montant de l'euro en Dirham Marocain
    @WebMethod(operationName = "ConversionEuroToMAD")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*(10.46);
    }

    //Obtenir les infos sur un compte donné
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*50000, new Date());
    }

    //Obtenir une liste de compte
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, Math.random()*50000, new Date()),
                new Compte(2, Math.random()*50000, new Date()),
                new Compte(3, Math.random()*50000, new Date()),
                new Compte(4, Math.random()*50000, new Date()),
                new Compte(5, Math.random()*50000, new Date()),
                new Compte(6, Math.random()*50000, new Date())
        );
    }


}
