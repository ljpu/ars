<#include "layout/dashboard.ftl">

<#macro main_content>
<h1 class="title">Users</h1>

<table class="table">
  <thead class="thead-light">
  <tr>
    <th scope="col">#</th>
    <th scope="col">name</th>
    <th scope="col">email</th>
    <th class="text-right" scope="col">created</th>
  </tr>
  </thead>
  <tbody>
  <#list users as user>
  <tr>
    <th scope="row">${user.id}</th>
    <td>${user.name}</td>
    <td>${user.email}</td>
    <td class="text-right">${user.createdAt?iso_utc_m_nz}</td>
  </tr>
  </#list>
  </tbody>
</table>
</#macro>

<@render_page/>
