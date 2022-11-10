# trigg-API-for-list-candidates

Para startar a aplicação, clone o projeto e execute os comandos na pasta raiz do projeto:
- docker build -t candidates-app .
- docker run -p 8080:8080 candidates-app

A api permite fazer a consulta dos candidatos ordenados através do path: localhost:8080/candidates e a busca por candidatoes de certas idades através dos parâmetros 'fromAge' e 'toAge'. 
