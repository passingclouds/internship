<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>springboot demo</title>
    </head>
    <body>
        <dl>
            <dt>用户列表</dt>
            <#list users as user>
                <dd>${user?index} - ${user.name!"no one"}</dd>
            </#list>
        </dl>
    </body>
</html>