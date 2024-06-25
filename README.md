# PasswordValidator

## Descrição

Este projeto é um microsserviço de validação de senha, desenvolvido utilizando Spring Web, Validation, e Lombok. O endpoint receberá uma senha que deve conter:

- De 8 a 16 caracteres;
- Mínimo 1 letra maiúscula;
- Mínimo 1 letra minúscula;
- Mínimo 1 número;
- Mínimo 1 caractere especial;

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **Postman**: Utilizado para testar a API.
- **Conceitos**: Clean Code, Clean Architecture, REST.

## Funcionalidades

A API permite a seguinte operação:

### Password Check

- **passwordChecker**: Irá processar a senha requisitada e verificar se ela está dentro dos padrões do regex.

## Estrutura do Projeto

A estrutura do projeto segue os princípios de Clean Architecture, garantindo que o código seja modular, fácil de manter e escalável.

## Testando a API
Utilize o Postman para testar o endpoint da API.

### Endpoints:

### PasswordCheckController:
- **POST** /api/password-check: Solicita um DTO que contém apenas o campo "password", valida-o utilizando um regex pattern na própria variável, e retorna um httpstatus 204 caso a senha esteja de acordo com o padrão, e um httpstatus 400 caso a senha esteja fora dos padrões.

