package rest.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/vehicle")
public class VehicleResources {

	@GET
	@Path("/{id}")
	public Response getEcho(@PathParam("id") String id) {
		return Response.ok("echo " + id).build();
	}
}
