# 🔒 Singleton - Exemplo em Java

Este projeto demonstra a implementação do padrão de projeto Singleton em Java, um dos padrões criacionais mais conhecidos da programação orientada a objetos. O Singleton garante que uma classe tenha apenas uma instância durante toda a execução da aplicação, fornecendo um ponto global de acesso a ela.

## 🧠 Entendendo o padrão Singleton

O Singleton é útil quando queremos que exista uma única instância de uma classe — por exemplo, um gerenciador de configurações, conexão com banco de dados ou um logger.

### Características:
- Garante uma única instância de uma classe;
- Fornece um ponto de acesso global à instância;
- Pode ser implementado com lazy initialization (instância criada sob demanda) ou eager initialization (instância criada imediatamente).

### Vantagens:
- Controle total sobre a instância;
- Economia de recursos (principalmente com lazy initialization);
- Útil para representar objetos globais com estado compartilhado.