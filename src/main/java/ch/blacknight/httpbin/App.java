package ch.blacknight.httpbin;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class App extends ResourceConfig {

    public App() {
        packages("ch.blacknight.httpbin");
    }

}
