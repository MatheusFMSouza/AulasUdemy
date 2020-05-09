Microserviços que usam o db.JSON do caminho\BackEndFrontEndAngular\backEnd

Microservice - microOne - recebe a requisição no end point do tipo get e chama o segundo microservice "microSeg" e aguardo o retorno.

Microservice - microSeg - recebe a requisição do seu end point do tipo get e faz a chama para o db.JSON e aguardo o retorno.

Microservice - db.Json prepara um retorno do tipo JSON de Produto e retorna para o segundo microservice.