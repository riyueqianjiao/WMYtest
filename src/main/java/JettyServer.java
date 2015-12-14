import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2015/12/11.
 */
public class JettyServer {
    private static final String DEFAULT_WEBAPP_PATH = "/src/main/webapp";
    private static final int DEFAULT_PORT = 8081;
    public static void main(String[] args){
        Server server = new Server(DEFAULT_PORT);
        String webappRootPath = JettyServer.class.getResource("/").getPath();
        System.out.println(webappRootPath);
        webappRootPath = webappRootPath.substring(0, webappRootPath.indexOf("/target"));
        System.out.println(webappRootPath);
        WebAppContext webapp = new WebAppContext(webappRootPath + DEFAULT_WEBAPP_PATH , "/");
        server.setHandler(webapp);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
