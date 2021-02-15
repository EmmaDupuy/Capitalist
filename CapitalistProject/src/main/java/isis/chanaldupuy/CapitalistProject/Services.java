/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.chanaldupuy.CapitalistProject;

import generated.World;
import java.io.File;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author marie
 */
public class Services {

    World world = new World();

    World readWorldFromXml() {
        
        /* if auteur connecté ou pas*/

        try {
            InputStream input
                    = getClass().getClassLoader().getResourceAsStream("world.xml");
            JAXBContext cont = JAXBContext.newInstance(World.class);
            Unmarshaller u = cont.createUnmarshaller();
            World world = (World) u.unmarshal(input);

        } catch (JAXBException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }
        return world;
    }

    void saveWorldToXml(World world) {

    }

    World getWorld() {

        return readWorldFromXml();
        
    }
}
