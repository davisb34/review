<section>

<div ng-controller="myCtrl">

<p>Select a Question subject:</p>

<!-- create a dropdown list of subjects -->
<select ng-model="selectedSubject" ng-options="x.tString for x in subjects">
</select>

<!-- this div lists the new questions youve created out -->
<div>
  
  <ul>
    <li ng-repeat="y in JustAddedQuestions" style = "word-wrap: break-word;">
      
      <!-- prints out the x button for each question -->
      <span class="glyphicon glyphicon-remove-circle" ng-click="removeQuestion(y)"></span>
      
      {{ y.subject }}
      {{ y.question}}
      
    </li>
  </ul>
  <p>New Questions:</p>
</div>

<!-- the text box where you can type a question -->
<textarea rows="6" cols="30" ng-model="newQuestion"></textarea> 

<input type = "hidden" value = "{{JustAddedQuestions}}" name = "jaq"/>

<!-- this button fires off a command to add your created question to the new questions list -->
<input type = "button"  ng-click="myFunction()" value = "Add Question"/>
</div>
</section>