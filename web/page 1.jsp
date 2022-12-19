

<%@page import="utilities.Utilities"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String otp="";
        boolean ispostback=false;
        if(request.getParameter("check")!=null)
        ispostback=true;
        if(ispostback)
        {
        otp=Utilities.otp(5);
        }
        %>
        <h1>Booking App</h1>
        
        
        <form method="post"><input name="check" type="hidden"/>
            mobile no. <input type="number" value="<%=otp%>">   
       <br>
       <input name="option" type="submit" value="otp">
       <br>
       mobile otp <input type="number">
       <br>
       <input type="submit">
       <br>
        </form>
       
       
        
        
        
        
        
    </body>
</html>
