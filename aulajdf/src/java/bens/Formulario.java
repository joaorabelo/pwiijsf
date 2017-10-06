/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bens;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author JoãoRabelo
 */
@Named(value = "formulario")
@SessionScoped
public class Formulario implements Serializable {

    /**
     * Creates a new instance of Formulario
     */
    private String nome;
    private String email;

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    private String biografia;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Formulario() {
    }
    
    public String salvar(){
        return "newjsf";
    }
    
}
