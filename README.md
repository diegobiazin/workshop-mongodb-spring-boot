# Spring Boot e MongoDB

## Sinopse

Projeto utilizando boas práticas de Engenharia de Software tais como desenvolvimento em camadas (DDD) e tratamento de exceções.
Também são realizadas operações de CRUD, consultas com @Query, retorno de objetos agregados (Banco de dados MongoDB).

```sh
\---com
    \---diegobiazin
        \---workshopmongodb
            |   WorkshopmongodbApplication.java
            |
            +---config
            |       Instantiation.java
            |
            +---domain
            |       Post.java
            |       User.java
            |
            +---dto
            |       AuthorDTO.java
            |       CommentDTO.java
            |       UserDTO.java
            |
            +---repository
            |       PostRepository.java
            |       UserRepository.java
            |
            +---resources
            |   |   PostResource.java
            |   |   UserResource.java
            |   |
            |   +---exception
            |   |       ResourceExceptionHandler.java
            |   |       StandardError.java
            |   |
            |   \---util
            |           URL.java
            |
            \---services
                |   PostService.java
                |   UserService.java
                |
                \---exception
                        ObjectNotFoundException.java
```

## Autor

* **Diego Biazin** - *Projeto Spring Boot e MongoDB* - [diegobiazin](https://github.com/diegobiazin)
