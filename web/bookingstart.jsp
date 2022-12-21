<%@page import="java.sql.PreparedStatement"%>
<%@page import="databasepackage.DbConnect"%>
<%@page import="utilities.Utilities"%>
<%@include file="header.jsp" %>
<body>
    <%@include file="menu.jsp" %>
    <!--Content-->
<body>
    <%
        String otp = "", mobile = "", result = "";
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;

        }
        if (ispostback) {
            try {
                otp = Utilities.otp(5);
                mobile = request.getParameter("mobile");
//                PreparedStatement ps = DbConnect.connect().prepareStatement("insert into bookings values=?");
//                ps.setString(1, mobile);
//                ps.executeUpdate();
                out.println(mobile);
                session.setAttribute("mobile", mobile);
                session.setAttribute("otp", otp);
                result = "Inserted";
            } catch (Exception ex) {
                System.out.println("ex");
                result = ex.getMessage();
                
            }
            
            
        }
    %>

<center>
    <br>
    <br>
    <h1>Booking App</h1>
    <div class="container col-md-3">
        <div class="row">
            <div class="col-md-3"></div
            <div class="col-md-6"></div>
            <form method="post">
                <%=result%>
                <input name="check" type="hidden"/>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Enter mobile number</label>
                    <input name="mobile" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter mobile number" value="<%=mobile%>">
                </div>
                <div class="col-md-3">
                    <input  type="submit" class="form-control btn btn-danger" id="exampleFormControlInput1" value="Get Otp">
                </div>
                <div class="col">
                    <label for="exampleFormControlInput1" class="form-label">OTP</label>
                    <input name="otp" name="text" readonly type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter OTP"value="<%=otp%>">
                </div>
                <br>
                <div class="col-md-3">
                    <input type="submit"class="form-control btn btn-primary">
                </div>
                <br>
            </form>
                <a target="validatepage" href="validation.jsp">Validate Here</a>
            </body>
            </html>
            </center>
            <%@include  file="footer.jsp" %>