/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.chanaldupuy.CapitalistProject;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author marie
 */
@Component
@ApplicationPath("/adventureisis")

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Webservice.class);
    }

}