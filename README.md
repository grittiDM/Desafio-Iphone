## Desafio de Programação Orientada a Objetos

Neste desafio, fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Contexto

Com base no vídeo de lançamento do iPhone de 2007, foi elaborada a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implementada as classes e interfaces no formato de arquivos `.java`.

### Funcionalidades Modeladas

1. **Reprodutor Musical**
> - Métodos: `tocar()`,`pausar()` e `selecionarMusica()`.
2. **Aparelho Telefônico**
> - Métodos: `ligar(String numero)`, `atender()` e `iniciarCorreioVoz`.
3. **Navegador na Internet**
> - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()` e `atualizarPagina()`.

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String ligar)
        +atender()
        +iniciarCorreioDeVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
## Minhas redes de contato

<div align="left">
  <a href="https://instagram.com/_m.gritti/" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
  <a href="https://discord.gg/6GkPBx4v" target="_blank"><img src="https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white" target="_blank"></a> 
  <a href = "mailto:dev.murilogritti@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://www.linkedin.com/in/murilo-gritti" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
</div>