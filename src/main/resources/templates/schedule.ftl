<#include "layout/dashboard.ftl">
<#import "/spring.ftl" as spring/>

<#macro main_content>

<h2>Create Schedule Job</h2>

<form action="/schedule" method="post">

  <div class="row">
    <div class="form-group col">
      <@spring.bind 'schedule.port'/>

      <label for="port">Port of Entry</label>
      <select id="port" class="form-control" id="schedule-port">
        <option></option>
        <#list ports as port>
          <option value="${port.code}">${port.name} &ndash; ${port.region}</option>
        </#list>
      </select>

      <@spring.showErrors "<br/>"/>

      <#list spring.status.errorMessages as error>
        <div class="invalid-feedback">${error}</div>
      </#list>
    </div>

    <div class="form-group col">
      <label for="inputGroupFile01">Demand for Service</label>
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">File</span>
        </div>
        <div class="custom-file">
          <input type="file" class="custom-file-input" id="inputGroupFile01">
          <label class="custom-file-label" for="inputGroupFile01">Choose file</label>
        </div>
      </div>
    </div>
  </div>

  <div class="form-group">
    <label for="shiftPattern">Shift Patterns</label>
    <select id="shiftPattern" class="form-control">
      <option>Choose...</option>
        <#list shifts as shift>
          <option>${shift.type}</option>
        </#list>
    </select>
  </div>

  <div class="form-group">
    <label for="start-times">Start Times</label>
    <input type="text" class="form-control" id="start-times" placeholder="">
  </div>

  <div class="form-group">
    <label for="number-officers">Number Officers</label>
    <input type="number" min="0" class="form-control" id="number-officers" placeholder="max full time staff">
  </div>

  <div class="form-group">
    <label for="planning-horizon">Planning Horizon</label>
    <input type="text" class="form-control" id="planning-horizon" placeholder="56 days (8 weeks)">
  </div>

  <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Hourly Precision</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
          <label class="form-check-label" for="gridRadios1">
            1 hour
          </label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">
          <label class="form-check-label" for="gridRadios2">
            &half; hour
          </label>
        </div>
      </div>
    </div>
  </fieldset>

  <button type="submit" class="btn btn-primary">Submit</button>
  <a href="/schedule" class="btn btn-light">Cancel</a>
</form>
</#macro>

<#macro custom_scripts>
<script>
  $(document).ready(function () {
  });
</script>
</#macro>

<@render_page/>

