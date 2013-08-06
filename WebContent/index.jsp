<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/normalize.css">
		<link rel="stylesheet" type="text/css" href="css/foundation.min.css">
		<script type="text/javascript" src="js/vendor/custom.modernizr.js"></script>
		<script>
		  document.write('<script src=/class_scheduler/js/vendor/'
		    + ('__proto__' in {} ? 'zepto' : 'jquery')
		    + '.js><\/script>');
		</script>
		<script type="text/javascript" src="js/foundation.min.js"></script>
	</head>
	<body>
		<div class="row">
			<div class="large-2 column">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="#" data-reveal-id="myModal">Login</a></li>
				</ul>
			</div>
			<div class="large-10 column">
				<h1>HTML Ipsum Presents</h1>
				<p><strong>Pellentesque habitant morbi tristique</strong> senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. <em>Aenean ultricies mi vitae est.</em> Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, <code>commodo vitae</code>, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. <a href="#">Donec non enim</a> in turpis pulvinar facilisis. Ut felis.</p>
				<h2>Header Level 2</h2>
				<ol>
				   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
				   <li>Aliquam tincidunt mauris eu risus.</li>
				</ol>
				<blockquote><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue. Ut a est eget ligula molestie gravida. Curabitur massa. Donec eleifend, libero at sagittis mollis, tellus est malesuada tellus, at luctus turpis elit sit amet quam. Vivamus pretium ornare est.</p></blockquote>
				<h3>Header Level 3</h3>
				<ul>
				   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
				   <li>Aliquam tincidunt mauris eu risus.</li>
				</ul>
				<pre><code>
				#header h1 a { 
					display: block; 
					width: 300px; 
					height: 80px; 
				}
				</code></pre>
			</div>
		</div>
		<div id="myModal" class="reveal-modal small">
			<form action="#" method="POST">
				<div class="row">
					<div class="large-12 column">
						<input type="text" placeholder="Username" name="username" id="username" />
					</div>
				</div>
				<div class="row">
					<div class="large-12 column">
						<input type="password" placeholder="Password" name="password" id="password" />
					</div>
				</div>
				<div class="row">
					<div class="large-12 column">
						<input type="submit" class="button" value="Login" />
					</div>
				</div>
			</form>
		</div>
		<script>
		  $(document).foundation();
		</script>
	</body>
</html>