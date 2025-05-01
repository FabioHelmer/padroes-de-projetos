# 🔨 Factory Method - Exemplo em Java

Este projeto demonstra a implementação do **padrão de projeto Factory Method** em Java, um dos padrões criacionais mais utilizados da programação orientada a objetos. Ele permite a criação de objetos sem expor a lógica de criação ao cliente, utilizando uma interface comum para instanciar as classes derivadas.


## 🧠 Entendendo o padrão Factory Method

O **Factory Method** define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar. Ele permite adiar a instância para subclasses.

### Vantagens:
- Desacopla a criação de objetos do código cliente;
- Facilita a extensão com novas classes sem alterar o código existente;
- Promove o uso de interfaces e classes abstratas.

---

## 🏗️ Estrutura do projeto

```text
PadroesProjetos/
└── src/
    └── main/
        └── java/
            └── org/
                └── fh/
                    ├── domain/         # Contém as classes principais do domínio (Ex: EmailNotification)
                    ├── factorys/       # Implementações do padrão Factory Method (Ex: EmailNotificationFactory)
                    └── interfaces/     # Interfaces que definem os contratos para as factorys
                    