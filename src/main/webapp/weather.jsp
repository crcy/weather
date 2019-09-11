<%--
  Created by IntelliJ IDEA.
  User: 残破的光羽翼
  Date: 2019/9/11
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>百度天气爬虫</title>
</head>
<script type="application/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="application/javascript">
    $(function() {
        $("#btn").click(function () {
            var url = $("#url").val();
             $.ajax({
                 url:"getweather"
                 ,type:"post"
                 ,data:{url:url}
                 ,datatype:"JSON"
                 ,success:function(res){
                     var s=res.toString();
                     var arr=s.split(",");
                     var weather="";
                     for (var i=0;i<arr.length;i++){
                         weather+=arr[i]+"</br>";
                     }
                     $("#result").html(weather);
                 }
             });

        })
    })
</script>
<body>
请输入网址:<input type="text" id="url" name="url">
<input type="button" id="btn" value="查询"></br>

<span id="result"></span>
</body>
</html>
