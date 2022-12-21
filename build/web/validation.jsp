
<%@page import="databasepackage.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@include file="header.jsp" %>
<body>
    <%@include file="menu.jsp" %>
    <!--Content-->
<body>
    <%

        String otpno = "", result = "", otp = "" + session.getAttribute("otp"), mobile = "";
        if (session.getAttribute("mobile") == null) {
            mobile = "Not entered";
        } else {
            mobile = "" + session.getAttribute("mobile");
        }
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;
        }
        if (ispostback) {
            String mobileno = "" + session.getAttribute("mobile");
            otpno = request.getParameter("otp");
            result = "Not matched";
            if (otp.equals(otpno)) {
                result = "Matched";
                
            }
            

        }
        

    %>
<center>
    <br>
    <br>
    <%=result%>
    <h1>Validation</h1>
    <div class="container col-md-3">
        <div class="row">
            <div class="col-md-3"></div
            <div class="col-md-6"></div>
            <form method="post">
                <input name="check" type="hidden"/>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Mobile number</label>
                    <input name="mobile" type="number" class="form-control" id="exampleFormControlInput1" placeholder="mobile number" value="<%=mobile%>">
                </div>

                <div class="col">
                    <label for="exampleFormControlInput1" class="form-label">OTP</label>
                    <input name="otp" type="text" class="form-control" id="exampleFormControlInput1" placeholder="otp" value="<%=otpno%>">
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