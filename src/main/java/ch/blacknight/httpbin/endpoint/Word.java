package ch.blacknight.httpbin.endpoint;

import org.apache.commons.lang3.RandomStringUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Random;

@Path("/word")
public class Word {
    @GET
    public String randomWord() {
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(3+(new Random()).nextInt(10), useLetters, useNumbers);
    }
}
