<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Select an image</title>
<script>
	var isShow = true;
	var currId;
	var currInterval;
	function doSomething(id) {
		currId = id;
		document.getElementById("build_div_" + id).style.visibility = "hidden";
		currInterval = setInterval("do2()", 1000);
	}
	function do2() {
		if(isShow) {
			document.getElementById("build_div_" + currId).style.visibility = "hidden";
		} else {
			document.getElementById("build_div_" + currId).style.visibility = "visible";
		}
		isShow = !isShow;
	}
	function stopBlink() {
		clearInterval(currInterval);
		document.getElementById("build_div_" + currId).style.visibility = "visible";
	}

	function loadBuilding(no, x, y, w, h) {
		document.getElementById("homeBuilding_id").value=no;
		document.getElementById("homeBuilding_x").value = x;
		document.getElementById("homeBuilding_y").value = y;
		document.getElementById("homeBuilding_w").value = w;
		document.getElementById("homeBuilding_h").value = h;
	}
</script>
	</head>
<body>
<input type="button" onclick="doSomething()" value="click"/>
<a href="javascript:doSomething()">click me</a>"
<s:iterator value="homeMap.buildings">
<div onclick="loadBuilding('<s:property value="id"/>','<s:property value="x"/>','<s:property value="y"/>','<s:property value="w"/>','<s:property value="h"/>')"" id="build_div_<s:property value="id"/>" style="position:absolute; left:<s:property value="x"/>px; top:<s:property value="y"/>px; width:<s:property value="w"/>px; height:<s:property value="h"/>px"  onmouseover="javascript:doSomething(<s:property value="id"/>)" onmouseout="javascript:stopBlink()">
	<img src="user_buildings/<s:property value="id"/>" width="172" height="131">
</div>
</s:iterator>
<table>
	<tr>
		<td><img src="user_imgs/<s:property value="homeMap.id"/>"/></td>
		<td>
			<table>
				<tr>
					<td>
						<form action="homeMapDetail!insertBuilding.do" method="post" enctype="multipart/form-data">
							<s:hidden name="homeMap.id"/>
							<input type="hidden" id="homeBuilding_id" name="homeBuilding.x"/>
							Left:<input id="homeBuilding_x" name="homeBuilding.x"/><br/>
							Top:<input id="homeBuilding_y" name="homeBuilding.y"/><br/>
							Width:<input id="homeBuilding_w" name="homeBuilding.w"/><br/>
							Height:<input id="homeBuilding_h" name="homeBuilding.h"/><br/>
							Image:<input type="file" name="imageFile"/><br/>
							<input type="submit" value="Save"/>
						</form>
					</td>
				</tr>
	<tr>
		<td>
			<table>
				<tr>
					<td>
						<table border="1">
							<tr bgcolor="gray">
								<td>x</td>
								<td>y</td>
								<td>w</td>
								<td>h</td>
								<td>operation</td>
							</tr>
						<s:iterator value="homeMap.buildings">
							<tr onmouseover="doSomething(<s:property value="id"/>)" onmouseout="stopBlink()">
								<td>
								<s:property value="x"/></td>
								<td><s:property value="y"/></td>
								<td><s:property value="w"/></td>
								<td><s:property value="h"/></td>
								<td>
									<a href="homeMapDetail!delete.do?homeMap.id=<s:property value="homeMap.id"/>&homeBuilding.id=<s:property value="id"/>">delete</a>
									<a href="javascript:loadBuilding('<s:property value="id"/>','<s:property value="x"/>','<s:property value="y"/>','<s:property value="w"/>','<s:property value="h"/>')">edit</a>
								</td>
							</tr>
						</s:iterator>
						</table>
					</td>
				</tr>
			</table>
		</td>
		</tr>
	</table>
		</td>
	</tr>
</table>
</body>
</html>