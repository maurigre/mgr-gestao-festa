# MGR GESTÃO DE FESTA
Projeto e destinado a gerenciar a quantidade de convidados/acompanhantes de uma festa.

## Tecnologias Utilizadas
* Spring-Boot
* Thymeleaf
* Webjars (Bootstrap, Jquery)
* JPA (Persistência Banco de Dados)
* H2 (Banco de Dados em memoria)
* Spring-Security

## Informações de como o projeto pode ser executado

### - Utilizando terminal:

* Primeiro passo, crie um clone do projeto. Comando : `git clone https://github.com/maurigre/mgr-gestao-festa.git`
* Entrar na raiz do projeto e aplicar o comando: `./mvnw clean compile package spring-boot:run`  

### - Utilizando o GitPod:

* Acesse o link: `http://gitpod.io/#https://github.com/maurigre/mgr-gestao-festa.git`
* Caso não tenha o seu Git vinculado com o GitPod o mesmo será solicitado através da sua senha do Git. Isso se faz necessário para que o GitPod consiga acessar o repositório e criar um fork do projeto em questão.
* O próximo passo será solicitado que instale uma extensão do GitPod o qual irá subir no navegado uma interface do Vscode 
* Execute os comandos no terminal da interface do vscode dentro do diretório raiz do projeto: `./mvnw clean compile package spring-boot:run`

## Funcionalidades contidas
#### GET: [/convidados](http://localhost:8080/convidados)
* Convidados -> Listar todos os convidados com a quantidade de acompanhantes informados pelo convidados.

#### POST: [/convidado](http://localhost:8080/convidado)
* Convidado -> Registra no banco de dados o nome do convidado e a quantidade de acompanhantes. 

#### Autenticação: [/login](http://localhost:8080/convidados)
* Login -> Realiza a autenticidade de quem pode utilizar o sistemas. 