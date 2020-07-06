<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="login">
    <s:textfield name="userid" label="User Name"></s:textfield>
    <s:textfield name="pass" label="Password" type="password"></s:textfield>
    <s:label name="loginresponse"></s:label>
    <s:submit name="login" value="Login"></s:submit>
</s:form>