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
														<a href="#" class="pull-left">
													    <c:if test="${event.tag == 'Natural_Disaster' }">
														 <img
															src="http://bmsresearch.weebly.com/uploads/2/3/7/5/23758913/published/ndicon_2.png?1485010524"
															class="media-photo">
															</c:if>
															<c:if test="${event.tag == 'Accident' }">
														 <img
															src="https://n6-img-fp.akamaized.net/free-vector/fire-protection-icons-set-of-house-forest-car-accidents-isolated-vector-illustration_1284-2333.jpg?size=338&ext=jpg"
															class="media-photo">
															</c:if>
															<c:if test="${event.tag == 'Terrorist_Act' }">
														 <img
															src="https://image.freepik.com/free-icon/terrorist-man-silhouette-with-bonnet-mask_318-49561.jpg"
															class="media-photo">
															</c:if>
														</a>
														<div class="media-body">
															<span class="media-meta pull-right">${event.date}</span>
															<h4 class="title">${event.eventName}<span
																	class="pull-right ${event.tag}">${event.tag}</span>
															</h4>
															<p class="summary">${event.description}</p>
															<p class="userName">Posted by: ${event.userFirstName}, ${event.userLastName}</p>
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