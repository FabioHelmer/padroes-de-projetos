# 🔨 Abstract Factory - Exemplo em Java

Este projeto demonstra a implementação do padrão de projeto **Abstract Factory** em Java, um dos padrões criacionais clássicos da programação orientada a objetos. Ele fornece uma interface para criar famílias de objetos relacionados ou dependentes **sem especificar suas classes concretas**.

---

## 🧠 Entendendo o padrão Abstract Factory

O **Abstract Factory** define uma interface para criar uma **família de objetos relacionados**. Cada fábrica concreta implementa essa interface e é responsável por instanciar um conjunto coerente de objetos.

Esse padrão é especialmente útil quando:
- Os objetos criados devem funcionar em conjunto;
- O sistema precisa ser configurado com uma entre várias famílias de produtos.

---

## ✅ Vantagens

- 🔗 **Isolamento da criação de objetos:** o cliente não precisa conhecer as classes concretas;
- 🧩 **Consistência entre objetos:** garante que os produtos criados sejam compatíveis entre si;
- 🔄 **Facilidade para trocar famílias de produtos:** basta substituir a fábrica concreta utilizada;
- 🚀 **Extensível:** novas famílias de produtos podem ser adicionadas sem alterar o código existente (Princípio Aberto/Fechado).

---

## 📦 Exemplo prático

Imagine uma aplicação que gera interfaces gráficas para diferentes sistemas operacionais como **Windows**, **macOS** e **Linux**.

Com o Abstract Factory, é possível criar fábricas específicas para cada sistema:

- `WindowsGUIFactory` cria `WindowsButton`, `WindowsMenu`, `WindowsWindow`;
- `MacGUIFactory` cria `MacButton`, `MacMenu`, `MacWindow`;
- `LinuxGUIFactory` cria `LinuxButton`, `LinuxMenu`, `LinuxWindow`.

Assim, ao mudar a fábrica utilizada, toda a interface da aplicação muda de forma consistente e sem necessidade de alterar o código de criação dos objetos em si.

---

> Este exemplo ilustra como o padrão Abstract Factory promove **flexibilidade**, **consistência** e **baixo acoplamento** na criação de objetos relacionados.

