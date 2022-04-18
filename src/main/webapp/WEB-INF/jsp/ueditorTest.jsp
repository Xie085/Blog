<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ueditor</title>
</head>
<body>
    <script id="container" name="content" type="text/plain">初始化内容</script>
    <script type="text/javascript" src="<%=basePath%>js/ueditor1_4_3/ueditor.config.js"/>
    <script type="text/javascript" src="<%=basePath%>js/ueditor1_4_3/ueditor.all.js"/>
    <script type="text/javascript">
        var ue=UE.getEditor('container')
    </script>
</body>
</html>
