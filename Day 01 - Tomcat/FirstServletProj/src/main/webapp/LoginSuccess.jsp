<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
    <style>
        body {
            background-color: lightblue; /* updated from #1e1e2f */
            font-family: 'Trebuchet MS', sans-serif;
            text-align: center;
            padding-top: 50px;
            color: black; /* global text color */
        }
        h1 {
            color: black; /* updated from #e74c3c */
            font-size: 36px;
            font-weight: bold;
        }
        h3 {
            color: black; /* updated from #f39c12 */
            font-size: 28px;
        }
        p {
            color: black; /* updated from #ecf0f1 */
            font-size: 18px;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 12px 25px;
            background-color: #ffcc00; /* similar to login button */
            color: black;
            text-decoration: none;
            border-radius: 8px;
            font-size: 16px;
            transition: 0.3s ease;
            font-weight: bold;
        }
        a:hover {
            background-color: #f39c12;
            transform: scale(1.07); /* slightly more scale for consistency */
        }
    </style>
</head>
<body>
    <h1>SUCCESSFUL LOGIN</h1>
    <h3>Hi <%= request.getAttribute("user") %>, Login successful!</h3>
    <p>Welcome to your account.</p>
    <a href="login.html">Logout?</a>
</body>
</html>
