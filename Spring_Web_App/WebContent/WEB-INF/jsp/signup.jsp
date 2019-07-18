<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Sign Up Here</title>

    <script type="application/javascript">
        function doValidations() {
            var temp = '10';
            var username = document.getElementById("username").value;
            console.log(username);
            if( username.length < 6 ) {
                console.log("Username must be at least 6 characters long");
                return false;
            }

            var password = document.getElementById("password").value;
            var repassword = document.getElementById("repassword").value;

            if(parseInt(password.length) < 6 ) {
                console.log("Password must be at least 6 characters long");
                return false;
            }

            if(password !== repassword ) {
                console.log("Password and repassword do not match");
                return false;
            }
            return true;
        }
    </script>

</head>
<body>

    <div>
        <label>${message}</label>
        <form action="${pageContext.request.contextPath}/signup" method="post" enctype="multipart/form-data" onsubmit="return doValidations()">
            <table>
                <tr>
                    <td>
                        <label>Enter Username: </label>
                    </td>
                    <td>
                        <input id="username" type="text" name="username">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label>Enter Password: </label>
                    </td>
                    <td>
                        <input id="password" type="password" name="password">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label>Re-Enter Password: </label>
                    </td>
                    <td>
                        <input id="repassword" type="password" name="password">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Choose Gender: </label>
                    </td>
                    <td>Male<input type="radio" name="gender" value="Male"></td>
                    <td>Female<input type="radio" name="gender" value="Female"></td>
                </tr>

                <tr>
                    <td>
                        <label>Select Vehicle: </label>
                    </td>
                    <td>Car<input type="checkbox" name="vehicle" value="Car"></td>
                    <td>Bike<input type="checkbox" name="vehicle" value="Bike"></td>
                </tr>

                <tr>
                    <td>
                        <label>Select Country: </label>
                    </td>
                    <td>
                        <select name="country">
                            <option value="canada">Canada</option>
                            <option value="usa" selected="selected">USA</option>
                            <option value="mexico">Mexico</option>
                            <option value="guatemala">Guatemala</option>
                            <option value="honduras">Honduras</option>

                        </select>
                    </td>
                </tr>

                <tr>
                    <td>
                        <label>Select Image: </label>
                    </td>
                    <td>
                        <input type="file" name="image">
                    </td>
                </tr>

                <tr>
                    <td>&nbsp</td>
                    <td><input type="submit" value="Sign Up"></td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>