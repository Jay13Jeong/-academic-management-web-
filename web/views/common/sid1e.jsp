<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> 세로 메뉴</title>
</head>
<style>
    body {
        margin:20px auto;
        padding: 0;
        font-style: italic;
        font-size:0.9em;
}
    ul#sidebar {
        width: 200px;
        text-indent: 10px;
}
    ul#sidebar , ul#sidebar ul {
        margin:0;
        padding:0;
        list-style:none;
}
    li.group {
        margin-bottom: 3px;
}
    li.group div.title {
        height: 35px;
        line-height: 35px;
        background:gray;
        cursor:pointer;
        color:white;
}
    ul.sub li {
        margin-bottom: 2px;
        height:35px;
        line-height:35px;
        background:#f4f4f4;
        cursor:pointer;
}
    ul.sub li a {
        display: block;
        width: 100%;
        height:100%;
        text-decoration:none;
        color:#000;
}
    ul.sub li:hover {
        background:#4d4d4d;
}
</style>
<body>
    
    <ul id="sidebar">
        <li class="group">
            <div class="title">title 1</div>
            <ul class="sub">
                <li><a href="#">sub1</a></li>
                <li><a href="#">sub1</a></li>
                <li><a href="#">sub1</a></li>
            </ul>
        </li>      
    </ul>
</body>
</html>