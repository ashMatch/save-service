# 🍽️ Save&Service

**Save&Service** é uma plataforma que conecta **comércios locais** e **ONGs** para combater o desperdício de alimentos e produtos.  
O objetivo é facilitar doações e vendas solidárias de itens próximos do vencimento — ajudando quem precisa e fortalecendo o comércio consciente.

---

## 🚀 Funcionalidades
- Cadastro de comércios e ONGs
- Listagem de produtos disponíveis (doação ou venda a preço simbólico)
- Filtros por tipo de produto e localização (em desenvolvimento)
- Comunicação direta entre comércio e ONG
- Sistema de autenticação seguro (em desenvolvimento)

---

## 🛠️ Tecnologias Utilizadas
- **Kotlin** — backend da aplicação
- **Maven** — gerenciamento de dependências
- **MySQL (Docker)** — banco de dados relacional
- **JDBC** — comunicação entre a aplicação e o banco
- **IntelliJ IDEA** — ambiente de desenvolvimento

---

## ⚙️ Como Rodar o Projeto Localmente

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/SEU_USUARIO/save-and-service.git
cd save-and-service
```

### 1️⃣ Subir o banco de dados no Docker
```bash
docker-compose up -d
```

### 3️⃣ Configurar o arquivo .env
```bash
MYSQL_ROOT_PASSWORD=senha_mestre
MYSQL_DATABASE=nome_banco_de_dados
MYSQL_USER=usuario
MYSQL_PASSWORD=senha_usuario
```
### 4️⃣ Rodar o projeto
```bash
mvn clean package
java -jar target/saveandservice.jar
```