<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <%--<script type="text/javascript" src="js/jquery-3.3.1.min.js.js"></script>--%>
    <%--<script type="text/javascript">--%>
        <%--$(function(){--%>
            <%--$.post("show",function(data){--%>
                <%--var result="";--%>
                <%--for(var i=0;i<data.length;i++){--%>
                    <%--result+="<dl>";--%>
                    <%--result+="<dt>"+data[i].name+"</dt>";--%>
                    <%--for(var j=0;j<data[i].children.length;j++){--%>
                        <%--result+="<dd>"+data[i].children[j].name+"</dd>";--%>
                    <%--}--%>

                    <%--result+="</dl>";--%>
                <%--}--%>
                <%--$("body").html(result);--%>
            <%--});--%>
        <%--})--%>
    <%--</script>--%>
  </head>
  <body>
  <form action="upload" enctype="multipart/form-data" method="post">
      姓名:<input type="text" name="name"/><br/>
      文件:<input type="file" name="file"/><br/>
      <input type="submit" value="提交"/>
  </form>
  <a href="download?filename=a.jpg">下载</a>
  </body>
</html>