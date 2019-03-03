<#include "layout/dashboard.ftl">

<#macro main_content>
<h1 class="title">Shifts</h1>

<table class="table">
  <thead class="thead-light">
  <tr>
    <th scope="col">#</th>
    <th scope="col">note</th>
    <th scope="col">number</th>
    <th scope="col">paid</th>
    <th scope="col">present</th>
  </tr>
  </thead>
  <tbody>
  <#list shifts as shift>
  <tr>
    <th scope="row">${shift.type}</th>
    <td>${shift.note ! ""}</td>
    <td>${shift.number}</td>
    <td>${shift.paid}</td>
    <td>${shift.present}</td>
  </tr>
  </#list>
  </tbody>
</table>

<div class="panel">
  todo: add create box
</div>
</#macro>

<@render_page/>
