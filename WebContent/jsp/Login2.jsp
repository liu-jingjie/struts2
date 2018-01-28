<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!-- Bootstrap -->
		<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
		<style type="text/css">
	      body {
	        padding-top: 40px;
	        padding-bottom: 40px;
	        background-color: #f5f5f5;
	      }
	      .form-signin {
	        max-width: 300px;
	        padding: 19px 29px 29px;
	        margin: 0 auto 20px;
	        background-color: #fff;
	        border: 1px solid #e5e5e5;
	        -webkit-border-radius: 5px;
	           -moz-border-radius: 5px;
	                border-radius: 5px;
	        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
	           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
	                box-shadow: 0 1px 2px rgba(0,0,0,.05);
	      }
	      .form-signin .form-signin-heading,
	      .form-signin .checkbox {
	        margin-bottom: 10px;
	      }
	      .form-signin input[type="text"],
	      .form-signin input[type="password"] {
	        font-size: 16px;
	        height: auto;
	        margin-bottom: 15px;
	        padding: 7px 9px;
	      }
	
	    </style>
    		<script src="http://code.jquery.com/jquery.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<title>Login</title>
	</head>
	<body>
	<div class="container">

      <form class="form-signin" action="login" method="post">
        <h2 class="form-signin-heading">ログイン画面</h2>
        <input type="text" class="input-block-level" placeholder="username" name="username" />
        <input type="password" class="input-block-level" placeholder="Password" name="password" />
        <!-- <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
         -->
        <button class="btn btn-large btn-primary" type="submit">Sign in</button>
      </form>
<form class="form-horizontal">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
</form>
    </div>
	</body>
</html>
