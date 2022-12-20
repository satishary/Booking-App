
<%@page import="databasepackage.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@include file="header.jsp" %>
<body>
    <%@include file="menu.jsp" %>
    <!--Content-->
<body>
    <%
        String otp = "",mobile="";
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;        
        }
        
        }
    %>
    <center>
          <br>
    <br>
    <h1>Validation</h1>
    <div class="container col-md-3">
        <div class="row">
            <div class="col-md-3"></div
            <div class="col-md-6"></div>
    <form method="post">
        <input name="check" type="hidden"/>
        <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Mobile number</label>
  <input name="number" type="text" class="form-control" id="exampleFormControlInput1" placeholder="mobile number" value="<%=mobile%>">
</div>
  
 <div class="col">
  <label for="exampleFormControlInput1" class="form-label">Enter OTP</label>
  <input name="otp" name="text" readonly type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter OTP"value="<%=otp%>">
</div>
<br>
<div class="col-md-3">
    <input type="submit"class="form-control btn btn-primary">
</div>
        <br>
    </form>
</body>
</html>
</center>
<%@include  file="footer.jsp" %>