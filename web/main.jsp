<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js.js"></script>
<script type="text/javascript" >
    $(function(){
    	$("a").click(function(){
    		var $td=$(this).parent().prev();
    		$td.html(parseInt($td.html())+1);
    	});
    });

</script>
</head>
<body>
<table border="1">
   <tr>
       <td>资料名称</td>
       <td>下载次数</td>
       <td>操作</td>
   </tr>
   <c:forEach items="${list }" var="file">
        <tr>
            <td>${file.name }</td>
            <td>${file.count }</td>
            <td><a href="downloadpng?id=${file.id }&name=${file.name}">下载</a></td>
        </tr>
   </c:forEach>
</table>
</body>
</html>