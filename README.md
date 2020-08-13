# swapi-planets
<br />
<br />
Api com informações dos planetas da franquia de filmes Star Wars 
<br />
<br />
Lista de todos os planetas
<br />
GET: /planets
<br />
<br />
Lista de todos os planetas paginada
<br />
GET: /planets/page
<br />
Opicional: ?pageNo=1&limit=5&sortBy=id
<br />
Valor padrão: pageNo=0, limit=5 e sortBy=id
<br />
<br />
Busca palneta por ID
<br />
GET: /planets/{id}
<br />
<br />
Busca planeta por nome
<br />
GET: /planets/name/{name}
<br />
<br />
Remove planeta
<br />
DELETE: /planets/{id}
<br />
<br />
Cadastra planeta
<br />
POST: /planets
<br />
PayLoad:
<br />
{<br />
&nbsp;&nbsp;&nbsp;&nbsp;"name": "Geonosis",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"climate": "temperate, arid",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"terrain": "rock, desert, mountain, barren",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"qtyAppearMovies": 1,<br />
&nbsp;&nbsp;&nbsp;&nbsp;"movies": [<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"link": "http://swapi.dev/api/films/5/"<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br />
&nbsp;&nbsp;&nbsp;&nbsp;]<br />
}<br />
<br />
Atualiza planeta
<br />
PUT: /planets
<br />
PayLoad:
<br />
{<br />
&nbsp;&nbsp;&nbsp;&nbsp;"id": "5f2b50ed9cd77d13f801f22c",
&nbsp;&nbsp;&nbsp;&nbsp;"name": "Geonosis",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"climate": "temperate, arid",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"terrain": "rock, desert, mountain, barren",<br />
&nbsp;&nbsp;&nbsp;&nbsp;"qtyAppearMovies": 1,<br />
&nbsp;&nbsp;&nbsp;&nbsp;"movies": [<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"link": "http://swapi.dev/api/films/5/"<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}<br />
&nbsp;&nbsp;&nbsp;&nbsp;]<br />
}<br />