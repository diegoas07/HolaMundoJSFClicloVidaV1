/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.model.Candidato;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Desarrollo2
 */
@ManagedBean
@RequestScoped
public class VacanteForm {

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }

    @ManagedProperty(value = "#{candidato}")
    private Candidato candidato;

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    
    public String enviar(){
        if (this.candidato.getNombre().equals("Juan")) {
            return "exito";
        }else{
            return "fallo";
        }
    }
    
    
}
