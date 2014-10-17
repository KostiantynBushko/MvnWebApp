<html>
<body>
<h2>Hello World! Maven Web Application</h2>
<div>
    <table>
        <tr>
            <td>Visit count : </td>
            <td><%=(request.getAttribute("current_count") == null ? "error" : request.getAttribute("current_count"))%></td>
        </tr>
    </table>
</div>
</body>
</html>
