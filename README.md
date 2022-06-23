# Elsatic-Search using Spring boot
1. Install docker for desktop to view/manage container etc
2. docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.10.0 (run this command using cmd)
3. check if server is up using url - http://localhost:9200
4. project specification -> java 11/springboot/gradle

Rest call sample :

URL : http://localhost:8080/v1/product/findAll


URL : http://localhost:8080/v1/product/createProduct
body :
{
"name" : "productN",
"price" : 12.3,
"quantity" : 4,
"category" : "soap",
"description" : "makes fair",
"manufacturer" : "Hindustan"
}

