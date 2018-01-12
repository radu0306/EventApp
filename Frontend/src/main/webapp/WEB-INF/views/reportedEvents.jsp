<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="content-section">
<div class="container">
	<div class="row">

		<section class="content">
			<h1>Table Filter</h1>
			<div class="col-md-8 col-md-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="pull-right">
							<div class="btn-group">
								<button type="button" class="btn btn-success btn-filter"
									data-target="Natural_Disaster">Natural Disaster</button>
								<button type="button" class="btn btn-warning btn-filter"
									data-target="Terrorist_Act">Terrorist Act</button>
								<button type="button" class="btn btn-danger btn-filter"
									data-target="Accident">Accident</button>
								<button type="button" class="btn btn-default btn-filter"
									data-target="all">All</button>
							</div>
						</div>
						<div class="table-container">
							<table class="table table-filter">
								<tbody>

									<c:forEach items="${events}" var="event">
										<tr data-status="${event.tag}">
											<td>
												<div class="media">
													<a href="#" class="pull-left"> <img
														src="https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg"
														class="media-photo">
													</a>
													<div class="media-body">
														<span class="media-meta pull-right">${event.date}</span>
														<h4 class="title">${event.name}<span
																class="pull-right ${event.tag}">${event.tag}</span>
														</h4>
														<p class="summary">${event.description}</p>
													</div>
												</div>
											</td>
										</tr>
									</c:forEach>
									
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</section>

	</div>
</div>
</section>