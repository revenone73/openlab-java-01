<html>
	<head>
		<title>Configure</title>
	</head>
	<body>
		<form action='configure' method='post'>
			<input id="implTypeMemory" type='radio' name='implType' value='cn.openlab.test.UserDAOMemoryImpl'/>
			<label for="implTypeMemory">Memory Implementation</label><br/>
			<input type='radio' name='implType' value='cn.openlab.test.UserDAOJDBCImpl'/>
			JDBC Implementation <br/>
			<input type='radio' name='implType' value='cn.openlab.test.UserDAOHibernateImpl'/>
			Hibernate Implementation <br/>
			<input type='submit' value='Save'/>
		</form>
	</body>
</html>
