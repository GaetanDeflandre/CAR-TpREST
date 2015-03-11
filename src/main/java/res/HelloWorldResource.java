package res;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import uk.co.wireweb.web.html.html5.tag.Body;
import uk.co.wireweb.web.html.html5.tag.H1;
import uk.co.wireweb.web.html.html5.tag.Head;
import uk.co.wireweb.web.html.html5.tag.Html;
import uk.co.wireweb.web.html.html5.tag.Title;

/**
 * Exemple de ressource REST accessible a l'adresse :
 * 
 * http://localhost:8080/rest/api/helloworld
 * 
 * @author Lionel Seinturier <Lionel.Seinturier@univ-lille1.fr>
 */
@Path("/helloworld")
public class HelloWorldResource {

	@GET
	@Produces("text/html")
	public String sayHello() {
        final Html html = new Html();
        final Head head = new Head();
        final Body body = new Body();
        
        head.child(new Title().body("Helloworld Resource"));
        body.child(new H1().body("Helloworld"));
        
        html.child(head);
        html.child(body);
		return html.toString();
	}

	@GET
	@Path("/book/{isbn}")
	public String getBook(@PathParam("isbn") String isbn) {
		return "Book: " + isbn;
	}

	@GET
	@Path("{var: .*}/stuff")
	public String getStuff(@PathParam("var") String stuff) {
		return "Stuff: " + stuff;
	}
}
