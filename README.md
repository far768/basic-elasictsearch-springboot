# Elsatic-Search using Spring boot
1. Install docker for desktop to view/manage container etc
2. docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.10.0 (run this command using cmd)
3. check if server is up using url - http://localhost:9200
4. project specification -> java 11/springboot/gradle

Sample Rest call :

URL (request): http://localhost:8080/v1/product/findAll
Response :
{
    "content": [
        {
            "id": "MOjBkYEB3SieRm7m62TN",
            "name": "productN",
            "price": 12.3,
            "quantity": 4,
            "category": "soap",
            "description": "makes fair",
            "manufacturer": "Hindustan"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "unsorted": true,
            "sorted": false
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 1,
        "paged": true,
        "unpaged": false
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 1,
    "size": 1,
    "number": 0,
    "first": true,
    "sort": {
        "empty": true,
        "unsorted": true,
        "sorted": false
    },
    "numberOfElements": 1,
    "empty": false
}

URL : http://localhost:8080/v1/product/createProduct
body (JSON):
{
"name" : "productN",
"price" : 12.3,
"quantity" : 4,
"category" : "soap",
"description" : "makes fair",
"manufacturer" : "Hindustan"
}

Response :
200 OK

