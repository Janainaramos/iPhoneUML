# iPhoneUML

Projeto em Java que simula os principais papéis do iPhone:  
**Reprodutor Musical**, **Aparelho Telefônico** e **Navegador de Internet**, utilizando conceitos de **interfaces** e **polimorfismo**.

---

## Estrutura do Projeto
src/
└── br/com/iphoneuml/
├── interfaces/ # Interfaces que definem os contratos
│ ├── ReprodutorMusical.java
│ ├── AparelhoTelefonico.java
│ └── NavegadorInternet.java
│
├── model/ # Classes concretas
│ └── Iphone.java
│
└── app/ # Ponto de entrada (Main)
└── Main.java


---

## Funcionalidades

### Reprodutor Musical
- Selecionar playlist
- Tocar música
- Pausar música

### Aparelho Telefônico
- Ligar para um número
- Atender chamada
- Desligar chamada

### Navegador de Internet
- Abrir URL
- Atualizar página
- Voltar página

---

## Como Rodar

1. Clone o repositório:

```bash
git clone https://github.com/Janainaramos/iPhoneUML.git

Abra o projeto no IntelliJ (ou outra IDE Java).

Execute a classe Main.java dentro do pacote app.

Observe os outputs no console simulando as ações do iPhone.

UML

O diagrama de classes representa os papéis do iPhone:

Interfaces: ReprodutorMusical, AparelhoTelefonico, NavegadorInternet

Classe concreta: Iphone implementa todas as interfaces

Você pode gerar o diagrama com PlantUML se desejar visualização gráfica.

Tecnologias

Java 21

IntelliJ IDEA (opcional)



