package ch.blacknight.httpbin;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.StringWriter;

@Path("/")
public class Root {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String toto() {
        String out;
        Configuration cfg = new Configuration();
        cfg.setClassForTemplateLoading(this.getClass(), "/");
        Template template = null;
        try {
            template = cfg.getTemplate("root.ftl");
            StringWriter writer = new StringWriter();
            template.process(null, writer);
            out = writer.toString();
        } catch (TemplateException | IOException e) {
            e.printStackTrace();
            out = "ERROR";
        }
        return out;
    }

}
