<%@include file="./shared/navbar.jsp"%>

<section class="intro">
	<div class="intro-body">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<h1 class="brand-heading">QuickEvent</h1>
					<p class="intro-text">App that allows instant 24/7, around the
						world event reporting</p>
					<div class="page-scroll">
						<a href="#about" class="btn btn-circle"> <i
							class="fa fa-angle-double-down animated"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section id="about" class="container content-section text-center">
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<h2>About QuickEvent</h2>
			<p>QuickEvent is an application that allows users near-instant
				event visualising and reporting.</p>
			<p>This app brings us a step closer to creating a self-aware
				comunity in which it's members have the possibility to notify
				eachother in the eventuality of a serious incident</p>
			<p>People that find themselvs at the scene of an event can report
				it, add a small description and a suggestive picture in just a
				coupple of steps.</p>
		</div>
	</div>
</section>

<section id="download" class="content-section text-center">
	<div class="download-section">
		<div class="container">
			<div class="col-lg-8 col-lg-offset-2">
				<h2>Download QuickEvent</h2>
				<p>Furthermore, QuickEvent is now available in mobile version
					and can be downloaded for free from Play Store</p>
				<a href="https://play.google.com/store/search?q=QuickEvent"
					class="btn btn-default btn-lg">Download</a>
			</div>
		</div>
	</div>
</section>

<section id="contact" class="container content-section text-center">
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<h2>Getting Started</h2>
			<p>From this section you cand either report an incident/event or
				you can visualise other user reported events</p>
			<ul class="list-inline banner-social-buttons">
				<li><a href="${contextRoot}/report"
					class="btn btn-default btn-lg"> <span class="network-name">Report</span></a>
				</li>
				<li><a href="${contextRoot}/reportedEvents"
					class="btn btn-default btn-lg"><span class="network-name">Reported Events</span></a>
				</li>
				
			</ul>
		</div>
	</div>
</section>