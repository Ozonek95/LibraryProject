<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<link rel="stylesheet" href="/webjars/bootstrap/4.2.1/css/bootstrap.min.css">
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- PAGE settings -->
  <link rel="icon" href="https://templates.pingendo.com/assets/Pingendo_favicon.ico">
  <title>Checkout</title>
  <meta name="description" content="Wireframe design of a checkout form by Pingendo">
  <meta name="keywords" content="Pingendo bootstrap example template wireframe checkout form">
  <meta name="author" content="Pingendo">
  <!-- CSS dependencies -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="wireframe.css">
</head>
<c:set var="book" value="${requestScope.book}" />
<body class="" style="">
<form action="/BorrowServletAction" method="post">
  <div class="py-5 text-center align-items-center d-flex" style="background-image: linear-gradient(to left bottom, rgba(189, 195, 199, 0.75), rgba(44, 62, 80, 0.75)); background-size: 100%;">
    <div class="container py-5">
      <div class="row">
        <div class="col-md-8 mx-auto">
          <div class="col-md-12 order-md-1" style="">
            <h4 class="mb-3 text-center" style=""><i class="fa fa-user fa-fw"></i>
              <font face="FontAwesome">Borrow book</font>
            </h4>
            <form class="needs-validation" novalidate="">
              <div class="mb-3">
                <div class="invalid-feedback"> Please enter a valid email address for shipping updates. </div>
              </div>
              <div class="row">
                <div class="col-md-6" style="">
                  <div class="form-group row">
                    <div class="col-md-12" style=""><label class="col-2">Name</label>
                      <div class="form-group row">
                        <div class="col-10 col-md-12" style=""><input type="text" class="form-control" name="name"></div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-6" style="">
                  <div class="form-group row">
                    <div class="col-10 col-md-12" style="">
                      <div class="col-10 col-md-12">
                        <div class="col-10 col-md-12"><label>Surname</label></div>
                      </div><input type="text" class="form-control" name="surname">
                    </div>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-md-12">
                  <label>Address</label>
                  <div class="row">
                    <div class="col-md-4">
                      <div class="form-group row" style="">
                        <div class="col-10 col-md-12" style=""><input type="text" class="form-control text-center"  placeholder="City" name="city"></div>
                      </div>
                    </div>
                    <div class="col-md-4">
                      <div class="form-group row">
                        <div class="col-10 col-md-12" style=""><input type="text" class="form-control text-center"placeholder="Street" name="street"></div>
                      </div>
                    </div>
                    <div class="col-md-4">
                      <div class="form-group row">
                        <div class="col-10 col-md-12" style=""><input type="text" class="form-control text-center" placeholder="ZIP-CODE" name="zip_code"></div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </form>
            <form id="c_form-h" class="">
              <label>Email</label>
              <div class="form-group row">
                <div class="col-10 col-md-12" style="">
                  <input type="email" class="form-control text-center" id="inputmailh" pattern=".+@g[a-z].com" placeholder="mail@example.com"> </div>
              </div>
            </form><label class ="text-left">Book info</label>
            <div class="row">
              <div class="col-md-4">
                <div class="form-group"><label class="col-7">Title</label><input type="text" class="form-control text-center" value="${book.title}" readonly = "true"></div>
              </div>
              <div class="col-md-4">
                <div class="form-group"><label class="text-center col-6">Author<br></label><input type="text" class="form-control text-center" value="${book.authorName}" readonly = "true"></div>
              </div>
              <div class="col-md-4">
                <div class="form-group"><label class="col-7">IBNS</label><input type="text" class="form-control text-center"  value="${book.isbn}" readonly = "true"></div>
              </div>
            </div>
            <div class="mb-3">
              <div class="input-group">
                <div class="invalid-feedback" style="width: 100%;"> Your username is required. </div>
              </div>
            </div>
            <div class="mb-3">
              <div class="invalid-feedback"> Please enter your shipping address. </div>
            </div>
            <hr class="mb-4">
          </div>
            <a class="btn btn-lg mx-1 btn-outline-dark" href="#"><button type="submit" name="bookId" value="${book.id}">Borrow</button></a> <a href="/HomeServlet" class="btn btn-lg btn-primary mx-1">Back</a>

        </div>
      </div>
    </div>
  </div>
</form>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" crossorigin="anonymous" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"></script>
  <script src="assets/js/validation.js" style=""></script>
</body>

</html>