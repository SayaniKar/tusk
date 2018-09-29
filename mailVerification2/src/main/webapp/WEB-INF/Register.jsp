<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta name="description" content="User account registration" />
  <meta name="author" content=" " />
  <link rel="icon" href="favicon.ico" />

  <title>Registration Page</title>

  <!-- Bootstrap core CSS -->
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
  crossorigin="anonymous" />

  <link th:href="@{css/style.css}" rel="stylesheet" />
</head>

<body class="gray-bg">

  <div class="middle-box text-center loginscreen animated fadeInDown">
    <div>
      
      <h4>New User Registration</h4>

      <form autocomplete="off" action="#" th:action="@{/register}"
        th:object="${user}" method="post" class="m-t" role="form"
        data-toggle="validator">

        <div th:if="${confirmationMessage}" class="alert alert-success"
          role="alert" th:text=${confirmationMessage}></div>

        <div th:if="${errorMessage}"
          class="alert alert-danger" role="alert"
          th:text="${errorMessage}"></div>


        <div th:if="${#fields.hasErrors('firstName')}"
          th:errors="*{firstName}"
          class="validation-message alert alert-danger" role="alert"></div>

        <div th:if="${#fields.hasErrors('lastName')}"
          th:errors="*{lastName}"
          class="validation-message alert alert-danger" role="alert"></div>

        <div th:if="${#fields.hasErrors('email')}" th:errors="*{email}"
          class="validation-message alert alert-danger" role="alert"></div>

        <div class="form-group input-group has-feedback">
          <label th:if="${#fields.hasErrors('firstName')}"
            th:errors="*{firstName}" class="validation-message"></label>
          <span class="input-group-addon">
            <span class="glyphicon glyphicon-user"></span>
          </span>
          
          <input type="text" th:field="*{firstName}"
            placeholder="First Name" class="form-control" required />
          <span class="glyphicon form-control-feedback"
            aria-hidden="true"></span>
        </div>

        <div class="form-group input-group has-feedback">
          <span class="input-group-addon">
            <span class="glyphicon glyphicon-user"></span>
          </span>
          <input type="text" th:field="*{lastName}"
            placeholder="Last Name" class="form-control" required />
          <span class="glyphicon form-control-feedback"
            aria-hidden="true"></span>
        </div>

        <div class="form-group input-group has-feedback">
          <span class="input-group-addon">
            <span class="glyphicon glyphicon-envelope"></span>
          </span>
          <input type="email" th:field="*{email}"
            placeholder="Email Address" class="form-control"
            data-error="This email address is invalid" required />
          <span class="glyphicon form-control-feedback"
            aria-hidden="true"></span>

        </div>
       
        <button type="submit"
          class="btn btn-primary block full-width m-b">Register</button>

      </form>
     
    </div>
  </div>

 <!-- jQuery-->
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    
  <!-- Bootstrap -->
  <script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
    integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
    crossorigin="anonymous"></script>

  <!-- Bootstrap Validator plugin -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>

 
</body>

</html>