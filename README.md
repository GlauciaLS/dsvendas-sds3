<h1 align="center">DS Vendas</h1>
<p align="center">Projeto realizado durante a Semana DevSuperior 3.0</p>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=springboot&message=2.4.1&color=6AAD3D&style=flat-square&logo=spring"/>
  <img src="https://img.shields.io/static/v1?label=npm&message=6.14.9&color=C53534&style=flat-square&logo=npm"/>
  <img src="https://img.shields.io/static/v1?label=react&message=^17.0.1&color=61D9FB&style=flat-square&logo=react"/>
  <img src="https://img.shields.io/static/v1?label=typescript&message=^4.1.3&color=2F74C0&style=flat-square&logo=typescript"/>
</p>

# 📖 Sobre
<p>Projeto de dashboard de vendas feito em React, consultando uma API desenvolvida com Spring Boot. Durante o desenvolvimento, foi criada uma 
API com quatros endpoints:</p>

- GET /sellers: Retorna todos os vendedores cadastrados;
- GET /sales: Retorno pageado, contendo informações de todas as vendas realizadas;
- GET /sales/amount-by-seller: Retorna o nome de cada vendedor e o valor total de suas vendas;
- GET /sales/success-by-seller: Retorna o nome de cada vendedor, quantidade de visitas e de vendas efetivas.

<p>Front-end hospedado no Netlify: https://dsvendas-glaucials.netlify.app/ </p>
<p>Back-end hospedado no Heroku: https://dsvendas-glaucials.herokuapp.com/ </p>

<h1>🛠 Tecnologias</h1>

- Front-end:
  - React
- Back-end:
  - Spring Boot
  - JPA/Hibernate
- Hospedagem:
  - Netlify (front-end)
  - Heroku (back-end)
- Banco de dados: PostgreSQL

<h1>▶️ Como executar o projeto</h1>

<h2>Back end</h2>
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/GlauciaLS/dsvendas-sds3

# entrar na pasta do projeto back end
cd backend

# executar o projeto
mvn spring-boot:run
```

<h2>Front end</h2>
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/GlauciaLS/dsvendas-sds3

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```
