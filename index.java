<!DOCTYPE html>
<html lang="en"><head>  <title>document object</Title><meta charset="utf-8">
<meta name="viewport" content="width=device-with,initial-scale=1">

<link rel="stylesheet" href=http//maxcdn.bootstrapcdn.com/boostrap/3.3.5/css/bootstrap.min.cs
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js:6"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.1.2/handlebars.min.js"></script>

<style> .btn{margin:5px} </style>
</head>

<div class="container">
<h1>select a major</h1>
<button type='button' class="btn btn-primary" onclick="getData(major)">CIT major </botton>
<button type='button' class="btn btn-primary" onclick="getData(bus)"> business major</botton>
</div>

<h2>we filter  our data  set by major </h2>

<script type="text/x-handlebars-template" id="tableTemplate">
<table class=table table-striped>
<tr>name<th></><th> major</th><th>midterm</th><th>final</th></tr>
{{#each rows}}
<tr>
<td>{{name}}</td><td>{{major}}</td><td>{{midterm}}</td><td>{{final}}</td>
</tr>
{{/each}}
</table>
</script>

<script>
function getData(){
var request=XMLhttrequest();
request.open('GET','cit5students(2).json')
request.onload=funtion(){var data=JSON.parse(request.responseTExt);

major_items=[]
for(i=0;i<data.length;i++)
{if(data[i].major==selected_major){major_items.push(data}[i].major)
}
}
if (request.status==200){
var templateText=document.getElementById('tableTemplate').innerHTML;
var compiledTemplateText=handlebars.compile(templateText);
compileHTML=compiledTemplateText({rows:})
document.getElementById('').innerHTML=compileHTML;
}
else{document.getElementById('#menuTable').innerHTML=" There was an error"}
}

</script>
</html>
