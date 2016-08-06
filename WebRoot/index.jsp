<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <script type="text/javascript">
    	function f(v){
    		var frm=document.getElementById("frm");
    		frm.setAttribute("action",v);
    		frm.submit();
    	}
    </script>
  </head>
  
  <body>
  <form action="" method="post" id="frm">
  	<input type="text" name="compu.n1"/><br/>
  	<input type="text" name="compu.n2"/><br/>
  	<input type="button" value="+" onclick="f('jia')"/>
  	<input type="button" value="-" onclick="f('jian')"/>
  	<input type="button" value="+" onclick="f('jia')"/>
  	<input type="button" value="+" onclick="f('jia')"/>
  </form>
  <hr/>
  result:<%=request.getAttribute("result") %>
  </body>
</html>
