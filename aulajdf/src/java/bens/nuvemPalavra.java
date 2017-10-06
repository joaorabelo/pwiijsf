/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bens;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;

/**
 *
 * @author JoãoRabelo
 */
@Named(value = "nuvemPalavra")
@SessionScoped
public class nuvemPalavra implements Serializable {
private TagCloudModel nuvem;
    /**
     * Creates a new instance of nuvemPalavra
     */
    public nuvemPalavra() {
        nuvem = new DefaultTagCloudModel();
        nuvem.addTag(new DefaultTagCloudItem("Palavra","#",1));
        nuvem.addTag(new DefaultTagCloudItem("Poha","#",1));
        nuvem.addTag(new DefaultTagCloudItem("Flamengo","#",1));
        nuvem.addTag(new DefaultTagCloudItem("SI","#",1));
        nuvem.addTag(new DefaultTagCloudItem("sei la","#",1));
        nuvem.addTag(new DefaultTagCloudItem("pw11","#",1));
        nuvem.addTag(new DefaultTagCloudItem("Palavra","#",1));
    }
    
}
