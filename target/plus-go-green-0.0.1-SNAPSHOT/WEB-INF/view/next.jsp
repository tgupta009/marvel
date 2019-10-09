<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html lang="en">
<body>
<div>
<div>
<h1>Green initiative details</h1>
<h2>Hello, ${message}</h2>
<table border="1" cellpadding="5">
<caption><h2>List of Txn</h2></caption>
<tr>
        <th>Txn id</th>
        <th>Txn acctno</th>
        <th>Txn time</th>
        <th>Txn type</th>
        <th>Txn amount</th>
        <th>Txn balance</th>
        <th>Txn text</th>
        <th>Txn green flag</th>
</tr>
<c:forEach var="txn" items="${txnList}">
<tr>
        <td>${txn.txnid}</td>
        <td>${txn.acctno}</td>
        <td>${txn.txtime}</td>
        <td>${txn.txtype}</td>
        <td>${txn.amount}</td>
        <td>${txn.balance}</td>
        <td>${txn.txtext}</td>
        <td>${txn.greenFlag}</td>
</tr>
</c:forEach>
</table>
</br>
Click <strong><a href="/welcome">here</a></strong> to visit previous page.
</div>
</div>
</body>
</html>
