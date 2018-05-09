<#include "header.ftl"/>
<#--集合遍历
<#list 集合名 as 集合元素名></#list>-->
<#--<#assign 定义新变量名=值>-->
<#--if 判断
<#if (布尔值)>
成立内容
<#else >
  不成立内容
</#if>-->
<table>
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
<#list users as item>
<tr>
    <td>${item.id}</td>
    <td>${item.name}</td>
    <td>${item.password}</td>
</tr>
</#list>
</table>
<#include "ender.ftl"/>