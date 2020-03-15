# AgendaTransferencia

## Ferramentas utilizadas:

- Springboot 2.0 - Utilizado pela facilitade de criar e lavantar um projeto do zero com pouca configuração.
- Java 8 - Versão que possuo mais domínio da linguagem.
- H2 - Biblioteca para fazer persistência em memória.
- Swagger - Biblioteca utilizada para acessar endpoints criados.
- Maven - Utilizado para facilitar o uso de dependências do projeto.

## Patterns Utilizados

- **Strategy** - Utilizado para manter cada lógica de calculo de taxa separada, facilitando assim a leitura de código e também sua expansão
- **Chain of Responsability** - Utilizado para criar uma sequência lógica para que o sistema consiga identificar qual calculo de taxa utilizar sem depender de muitos IF's

## Buildando o projeto

- Como é um projeto maven padrão, caso for utilizar uma IDE, basta importar como projeto maven e rodar a classe **AgendamentoDeTransferenciaApplication**
- - Para acessar o swagger basta entrar na URL http://localhost:8080/swagger-ui.html