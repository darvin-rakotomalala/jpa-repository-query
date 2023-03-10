##  Spring Data JPA | Derived Query
Dans ce repo, nous allons voir comment implémenter la requête Spring Data JPA Repository dans Spring Boot avec les méthodes Derived Query.

### Technologies
---
- Java 11
- Spring Boot 2.7.7
- Spring Data JPA
- Lombok
- MapStruct
- Maven 3+
- PostgreSQL

### Exemples réalisés
---
- CRUD
- JPA find by field
- JPA find by multiple Columns
- JPA Like Query
- JPA Boolean Query
- JPA Repository Query with Comparison
  - Between (where x.field between param_1 and param_2)
  - LessThan (where x.field < param)
  - LessThanEqual (where x.field <= param)
  - GreaterThan (where x.field > param)
  - GreaterThanEqual (where x.field >= param)
  - After (where x.dateField > param)
  - Before (where x.dateField < param)
- 

### Exécuter et tester les APIs
---
- Exécuter l'application `mvn spring-boot:run`
- Importer dans Postman la collection `jpaDerivedQuery.postman_collection.json` pour tester les APIs
- Vous pouver utiliser aussi l'url du Swagger ou importer l'url Swagger dans Postman. Les descriptions OpenAPI seront disponibles au chemin `/v3/api-docs` par défaut :
  - http://localhost:8081/v3/api-docs/
  - http://localhost:8081/swagger-ui/index.html
