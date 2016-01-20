<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <META http-equiv="Content-Type" CONTENT="text/html;charset=utf-8">
    <title>后台管理系统</title>
    <script type="text/javascript" src="/plugin/jquery-easyui-1.4.3/jquery.min.js"></script>
    <link href="/css/default.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/plugin/jquery-easyui-1.4.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/plugin/jquery-easyui-1.4.3/themes/icon.css">
    <script type="text/javascript" src="/plugin/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/plugin/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/js/common.js"></script>
    <script type="text/javascript">
    </script>
    <style>
    </style>
    <script>
        $(function(){


        })
    </script>
</head>

<body class="easyui-layout bodyArea">
<%--<div id="header" class="header"></div>--%>
        <div id="north" data-options="region:'north'" style="background-color: #0092DC;height: 30px;"></div>
        <div id="south" data-options="region:'south',split:false" style="background-color: #CCE6FF;height: 50px;"></div>
        <%--<div data-options="region:'east',split:true" title="East" style="width:100px;"></div>--%>
        <div id="west" data-options="region:'west',split:false" title="菜单" style="width:200px;">
            <span class="tree-title"><a href="#" onclick="addTab('login1.do?','login1')">login1</a></span>
            <span class="tree-title"><a href="#" onclick="addTab('login2.do?','login2')">login2</a></span>
            <span class="tree-title"><a href="#" onclick="addTab('login3.do?','login3')">login3</a></span>
            <span class="tree-title"><a href="#" onclick="addTab('login4.do?','login4')">login4</a></span>
            <span class="tree-title"><a href="#" onclick="addTab('login5.do?','login5')">login5</a></span>
        </div>
        <div id="centerArea" data-options="region:'center'" class="easyui-tabs">
            <%--<div id="tabs" class="tabs"></div>--%>
            <%--<table class="easyui-datagrid"
                   data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:false,fit:true,fitColumns:true">
                <thead>
                <tr>
                    <th data-options="field:'itemid'" width="80">Item ID</th>
                    <th data-options="field:'productid'" width="100">Product ID</th>
                    <th data-options="field:'listprice',align:'right'" width="80">List Price</th>
                    <th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
                    <th data-options="field:'attr1'" width="150">Attribute</th>
                    <th data-options="field:'status',align:'center'" width="60">Status</th>
                </tr>
                </thead>
            </table>--%>
        </div>
    </div>
<%--<div id="buttom" class="buttom">--%>
</body>
</html>
