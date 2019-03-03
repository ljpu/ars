<#macro custom_styles>
<link href="../../css/cover.css" rel="stylesheet">
</#macro>

<#macro main_content>
<main role="main" class="inner cover">
  <h1 class="cover-heading">Cover your page - Layout rendered.</h1>
  <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
  <p class="lead">
    <a href="/login" class="btn btn-lg btn-secondary">Login</a>
  </p>
</main>
</#macro>

<#macro render_page>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>CBSA:ARS</title>

  <link href="../../css/bootstrap.min.css" rel="stylesheet">
  <@custom_styles/>
</head>

<body class="text-center">

<div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
  <#include "*/nav.ftl">

  <@main_content/>

  <footer class="mastfoot mt-auto">
    <div class="inner">
      <p>Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>
        , by <a href="https://twitter.com/mdo">@mdo</a>
        and <a href="https://twitter.com/burlresearch">@burlresearch</a>
        .</p>
    </div>
  </footer>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>');</script>
<script src="../../js/bootstrap.min.js"></script>
<@custom_scripts/>
</body>
</html>
</#macro>
