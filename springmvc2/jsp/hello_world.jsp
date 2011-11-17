<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<jsp:useBean id="message" scope="request" type="java.lang.String"/>
<html>
<head>
  <title>Spring MVC Ajax Demo</title>
  <script type="text/javascript" src="scripts/jquery-1.4.2.min.js"></script>
  <script type="text/javascript">
    function doAjax() {
      $.ajax({
    	type: 'POST',
        url: 'time.html',
        data: ({name : "me, frank"}),
        success: function(data) {
          $('#time').html(data);
        }
      });
    }
  </script>
</head>
<body>
${message}
<button id="demo" onclick="doAjax()" title="Button">Get the time!</button>
<div id="time">
</div>
</body>
</html>
