# Spring Boot e MongoDB

## Sinopse

Projeto utilizando padrão de camadas DDD, CRUD básico, tratamento de erro da requisição, consultas com @Query, retorno de objetos agregados.

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
