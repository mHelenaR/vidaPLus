# 💉 SGHSS - Sistema de Gestão Hospitalar e de Serviços de Saúde

Este projeto faz parte da disciplina de **Projeto Multidisciplinar** do curso de **Análise e Desenvolvimento de Sistemas** da **Universidade Cruzeiro do Sul Virtual (Unicsul)**.

O sistema foi desenvolvido com foco no **back-end**, utilizando **Java com Spring Boot**, para simular um ambiente real de gestão hospitalar, integrando cadastro de pacientes, médicos, consultas, leitos, receitas e controle de acesso.

---

## 🎯 Objetivos do Projeto

- Criar uma estrutura back-end robusta para a gestão hospitalar.
- Aplicar boas práticas de modelagem, arquitetura de software e persistência de dados.
- Atender aos requisitos funcionais e não funcionais propostos no estudo de caso "VidaPlus".

---

## 🛠️ Tecnologias Utilizadas

- **Java 22**
- **Spring Boot 3**
- **PostgreSQL**
- **Maven**
- **Postman** (para testes manuais de endpoints)

---

## 📦 Estrutura de Funcionalidades

- 👤 **Pacientes**: cadastro, busca e histórico.
- 🩺 **Médicos**: cadastro, especialidade, CRM.
- 📅 **Consultas**: agendamento, tipo (presencial/online), status.
- 🛏️ **Leitos**: reserva e liberação.
- 📄 **Receitas**: emissão digital vinculada a consultas.
- 🔐 **Usuários**: autenticação por perfil (admin, profissional, paciente).
- 📋 **Logs**: registro de ações no sistema.

---

## 📌 Endpoints Exemplo

| Método | Rota | Função |
|--------|------|--------|
| `POST` | `/api/pacientes` | Cadastrar paciente |
| `GET`  | `/api/medicos/{id}` | Consultar médico |
| `POST` | `/api/consultas` | Agendar consulta |
| `POST` | `/api/leitos/reservar` | Reservar leito |
| `POST` | `/api/auth/login` | Autenticação de usuário |

---

## ⚙️ Como Executar Localmente

1. Clone este repositório:
```bash
git clone https://github.com/mHelenaR/vidaPLus.git
