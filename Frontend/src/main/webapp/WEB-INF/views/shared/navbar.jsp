<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
	
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-main-collapse">
				<i class="fa fa-bars"></i>
			</button>

			<c:if test="${userClickReport == true }">
				<a class="navbar-brand" href="/Frontend"> <i
					class="fa fa-play-circle"></i> <span class="light">Home</span>
				</a>
			</c:if>
			<c:if test="${userClickReportedEvents == true }">
				<a class="navbar-brand" href="/Frontend"> <i
					class="fa fa-play-circle"></i> <span class="light">Home</span>
				</a>
			</c:if>
			<c:if test="${userClickHome == true }">
				<a class="navbar-brand" href="#page-top"> <i
					class="fa fa-play-circle"></i> <span class="light">Home</span>
				</a>
			</c:if>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div
			class="collapse navbar-collapse navbar-right navbar-main-collapse">
			<ul class="nav navbar-nav">
				<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
				<li class="hidden"><a href="#page-top"></a></li>

				<c:if test="${userClickHome == true }">
					<li class="page-scroll"><a href="#about">About</a></li>
					<li class="page-scroll"><a href="#download">Download</a></li>
					<li class="page-scroll"><a href="#contact">Get Started</a></li>
				</c:if>


			</ul>
		</div>
		<!-- /.navbar-collapse -->
	
	<!-- /.container -->
</nav>
