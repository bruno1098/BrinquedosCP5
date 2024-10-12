<h1 align="center">🎮  CP5: Sistema de Gerenciamento de Brinquedos com Spring Security</h1>

<p align="center">
    <a href="https://www.java.com/">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
    </a>
    <a href="https://spring.io/projects/spring-boot">
        <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
    </a>
    <a href="https://www.postgresql.org/">
        <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
    </a>
    <a href="https://www.thymeleaf.org/">
        <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white"/>
    </a>
    <a href="https://projectlombok.org/">
        <img src="https://img.shields.io/badge/Lombok-55A3F1?style=for-the-badge&logo=java&logoColor=white"/>
    </a>
    <a href="https://www.docker.com/">
        <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"/>
    </a>
    <a href="https://render.com/">
        <img src="https://img.shields.io/badge/Render-0468D7?style=for-the-badge&logo=render&logoColor=white"/>
    </a>
</p>


## 📖 Descrição do Projeto

<p align="justify">
Este projeto é um sistema web desenvolvido para uma empresa de brinquedos voltados para crianças até 12 anos. A aplicação permite realizar operações CRUD (Criar, Ler, Atualizar e Deletar) sobre um cadastro de brinquedos, com autenticação e autorização via Spring Security. O projeto está configurado para o uso de banco de dados PostgreSQL, e o deploy foi feito na plataforma <strong>Render</strong>.
</p>

## 🚀 Funcionalidades Implementadas

- 🧸 **Cadastro de Brinquedos**: Permite criar, visualizar, editar e excluir brinquedos.
- 🔐 **Sistema de Login**: Autenticação de usuários com Spring Security.
- ✍️ **Tela de Cadastro de Usuário**: Caso o usuário não tenha conta, ele pode criar uma.
- 🚧 **Restrição de Acesso**: Algumas funcionalidades estão restritas a usuários logados.
- 🌐 **Deploy**: O projeto foi implantado utilizando a plataforma **Render**.

## 🛠️ Estrutura do Projeto

### 🔗 Endpoints

| Método | Endpoint                   | Descrição                                   |
|--------|----------------------------|---------------------------------------------|
| GET    | `/brinquedos`              | Lista todos os brinquedos cadastrados.      |
| POST   | `/brinquedos/novo`         | Cria um novo brinquedo.                     |
| PUT    | `/brinquedos/editar/{id}`  | Atualiza os dados de um brinquedo existente.|
| DELETE | `/brinquedos/delete/{id}`  | Remove um brinquedo do cadastro.            |
| POST   | `/req/cadastro`            | Cadastra um novo usuário.                   |
| POST   | `/req/login`               | Realiza login de um usuário existente.      |

### 🗂️ Modelos de Dados

#### 📄 Cadastro

O modelo de dados de **Cadastro** representa as informações do usuário. Ele está associado à tabela `cadastro`.

| Coluna  | Tipo    | Descrição                                   |
|---------|---------|---------------------------------------------|
| `id`    | `Long`  | Identificador único.                        |
| `nome`  | `String`| Nome do usuário.                            |
| `email` | `String`| Endereço de email utilizado no login.       |
| `senha` | `String`| Senha para acesso ao sistema.               |

#### 🧾 Brinquedo

O modelo de dados **Brinquedo** está associado à tabela `brinquedos` e armazena as informações dos brinquedos.

| Coluna      | Tipo     | Descrição                            |
|-------------|----------|--------------------------------------|
| `id`        | `Long`   | Identificador único do brinquedo.    |
| `nome`      | `String` | Nome do brinquedo.                   |
| `descricao` | `String` | Descrição detalhada do brinquedo.    |

## ⚙️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| <img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=java&logoColor=white"/> | Linguagem de programação utilizada no projeto. |
| <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white"/> | Framework utilizado para construir a aplicação. |
| <img src="https://img.shields.io/badge/PostgreSQL-316192?style=flat-square&logo=postgresql&logoColor=white"/> | Banco de dados utilizado para armazenar os dados. |
| <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white"/> | Template engine para renderizar páginas HTML. |
| <img src="https://img.shields.io/badge/Lombok-55A3F1?style=flat-square&logo=java&logoColor=white"/> | Biblioteca para reduzir código boilerplate no Java. |
| <img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white"/> | Ferramenta de contêinerização para facilitar o deploy. |
| <img src="https://img.shields.io/badge/Render-0468D7?style=flat-square&logo=render&logoColor=white"/> | Plataforma utilizada para deploy da aplicação. |

## 🔧 Configurações

### 🔐 Spring Security

O arquivo `SecurityConfig.java` configura as permissões de acesso às rotas e define uma tela de login personalizada. Ele utiliza a configuração de autenticação baseada em formulários, permitindo que apenas usuários autenticados acessem determinadas rotas.

### 🐳 Docker

Foi incluído um arquivo **Dockerfile** para facilitar a configuração e a criação de contêineres para a aplicação, permitindo que o ambiente seja replicado facilmente em diferentes máquinas.

### 🎨 Frontend

As páginas da aplicação foram criadas usando **HTML** e **CSS** no diretório `/templates` e `/static`. Algumas das principais telas são:

- **Login** (`Login.html`)
- **Cadastro de Usuário** (`Cadastro.html`)
- **Listagem de Brinquedos** (`listar.html`)
- **Detalhes do Brinquedo** (`brinquedo.html`)

### 📝 Spring Initializr

<p align="center">
    <img src="https://github.com/bruno1098/BrinquedosCP5/blob/main/src/main/resources/images/initializr.png?raw=true" alt="Tela de Cadastro" width="600px"/>
</p>

## 🖼️ Capturas de Tela

### 🔑 Tela de Login

<p align="center">
    <img src="https://github.com/bruno1098/BrinquedosCP5/blob/main/src/main/resources/images/login.png?raw=true" alt="Tela de Login" width="600px"/>
</p>

### 📝 Tela de Cadastro

<p align="center">
    <img src="https://github.com/bruno1098/BrinquedosCP5/blob/main/src/main/resources/images/cadastro.png?raw=true" alt="Tela de Cadastro" width="600px"/>
</p>

### 🧸 Tela de Home

<p align="center">
    <img src="https://raw.githubusercontent.com/bruno1098/BrinquedosCP5/refs/heads/main/src/main/resources/images/home.png" alt="Tela de Home" width="600px"/>
</p>

### 📋 Tela de Listagem de Brinquedos

<p align="center">
    <img src="https://raw.githubusercontent.com/bruno1098/BrinquedosCP5/refs/heads/main/src/main/resources/images/brinquedos.png" alt="Tela de Listagem de Brinquedos" width="600px"/>
</p>



## 🌍 Deploy

A aplicação foi implantada na plataforma **Render** e pode ser acessada através deste link:

<p align="center">
    <a href="https://brinquedoscp5.onrender.com/" target="_blank">
        <img src="https://img.shields.io/badge/Acessar%20Aplicação-0468D7?style=for-the-badge&logo=render&logoColor=white"/>
    </a>
</p>

## 👥 Integrantes

<table>
    <tr>
        <th>Nome</th>
        <th>RM</th>
    </tr>
    <tr>
        <td>Bruno Antunes</td>
        <td>RM98470</td>
    </tr>
    <tr>
        <td>Gabriel Figueiredo</td>
        <td>RM99463</td>
    </tr>
    <tr>
        <td>Gabriel Souza</td>
        <td>RM98633</td>
    </tr>
    <tr>
        <td>Pedro Ferrari</td>
        <td>RM550231</td>
    </tr>
    <tr>
        <td>Rafael Lino</td>
        <td>RM551577</td>
    </tr>
</table>
