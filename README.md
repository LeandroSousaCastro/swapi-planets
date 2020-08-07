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
Busca planeta por nome
<br />
GET: /planets/name/{name}
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
```ruby
{
    "name": "Geonosis",
    "climate": "temperate, arid",
    "terrain": "rock, desert, mountain, barren",
    "qtyAppearMovies": 1,
    "movies": [
      {
        "link": "http://swapi.dev/api/films/5/"
      }
    ]
}
```
Atualiza planeta
<br />
PUT: /planets
<br />
PayLoad:
```ruby
{
    "id": "5f2b50ed9cd77d13f801f22c",
    "name": "Geonosis",
    "climate": "temperate, arid",
    "terrain": "rock, desert, mountain, barren",
    "qtyAppearMovies": 1,
    "movies": [
      {
        "link": "http://swapi.dev/api/films/5/"
      }
    ]
}
```
