<section>

	<!-- another layer to hold the modal in-->
	<div class="modal fade" id="feedback-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none" width="1400px;">
		<div class="modal-dialog" width="1300px;">


			<div class="feedbackmodal-container">
				
				<!-- holds both the left and right side of the modal -->
				<div class="row">

					<div>
						<img id="feedback-img" class="feedback-img-card"
							src="https://pbs.twimg.com/profile_images/705134292368621568/ZnelWSSO.jpg" />
						<h1>Submit Interview feedback</h1>
						<br>

						<div
							class="well col-sm-4">

							<!-- include the feedback part of the modal -->
							<jsp:include
								page="/Jsp Template Files/interviewFeedbackFeedbackForm.jsp"></jsp:include>

						</div>
						<!-- div that contains the input feedback -->
						<div
							class="well col-sm-8">
							<!-- include the add questions part of the modal -->
							<jsp:include
								page="/Jsp Template Files/interviewFeedbackAddQuestion.jsp"></jsp:include>
						</div>

						<!-- div that contains just the button  -->
						<div style="top: 0; left: 33%; align: center; width: 50%;"
							class="well col-sm-12">

							<!-- button to submit modal form data -->
							<input type="submit" class="feedback feedbackmodal-submit"
								id="fb_button" value="Submit Feedback" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end of modal layer -->
</section>