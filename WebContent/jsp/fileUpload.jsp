<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>fileUpload</title>
</head>
<body>
	<form action="fileUpload" method="post" enctype="multipart/form-data">
		username: <inpput type="text" name="username"/><br>
		file: <input type="file" name="file"><br>
		<input type="submit" value="submit" />
	</form>
</body>
</html>