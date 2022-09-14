package web;

import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        /*
        a continuación lo que hacemos es ir recuperando información de los elementos que están
        en el formulario.
        El método getParameter extrae la info que esté en los 'input' con el 'name' que corresponda
        */
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("</html>");
        
        out.print("<body>");
            out.print("<h1>Parametros procesados por el Servlet:</h1>");
            out.print("<table border='1'>");
            
            
                out.print("<tr>");
                    out.print("<td>");
                        out.print("Usuario");
                    out.print("</td>");
                    out.print("<td>");
                        out.print(usuario);
                    out.print("</td>");
                out.print("<tr>");
                
                  out.print("<tr>");
                    out.print("<td>");
                        out.print("Password");
                    out.print("</td>");
                    out.print("<td>");
                        out.print(password);
                    out.print("</td>");
                out.print("<tr>");
                
            out.print("</table>");
        
        out.print("</body>");
         out.print("</html>");
    }
    
    
}
