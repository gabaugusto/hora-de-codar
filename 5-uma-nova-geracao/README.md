
# Hora De Codar: Uma Nova Geração

Bem-vindo(a)!  

Neste projeto, você vai praticar **Programação Orientada a Objetos** criando um bichinho virtual e cuidando dele no dia a dia. No **Simulador de Animal de Estimação Virtual**, onde você terá a oportunidade de cuidar do seu próprio animal de estimação virtual e aprender sobre programação orientada a objetos ao mesmo tempo!Você está embarcando em uma jornada emocionante no mundo da programação orientada a objetos! 

Neste mundo fascinante, os programas são organizados em torno de objetos, entidades que possuem características (atributos) e comportamentos (métodos). Essa abordagem de programação permite modelar o mundo real de uma forma poderosa e flexível.Imagine que você é um cuidador de animais e acabou de receber a responsabilidade de cuidar de um animal de estimação virtual. 

Sua tarefa é garantir que o animal esteja feliz e saudável, cuidando de suas necessidades básicas, como alimentação e entretenimento. Você terá acesso ao código fonte do **Simulador de Animal de Estimação Virtual**, que já inclui a estrutura básica para criar e interagir com o animal virtual. Sua missão é ampliar este código, adicionando novas funcionalidades e melhorias para tornar a experiência ainda mais envolvente.


## O que é o bichinho virtual?

Seu pet tem atributos (estado) e métodos (ações).

### Atributos iniciais

- **Nome**

- **Fome** (quanto maior, mais fome)

- **Felicidade** (quanto maior, mais feliz)

### Ações principais

- **Alimentar**: diminui a fome

- **Brincar**: aumenta a felicidade

- **Verificar status**: mostra os valores atuais do pet

Além disso, o jogo simula a passagem do tempo.

---

## Evoluindo o projeto

Implemente as melhorias abaixo:

1. **Cansaço**
    - Adicione o atributo `cansaço`.
    - Sempre que o pet brincar, o cansaço aumenta.

2. **Descansar**
    - Crie um método para o pet descansar.
    - Descansar deve diminuir o cansaço.

3. **Idade**
    - Adicione o atributo `idade`.
    - A cada ciclo de tempo, a idade aumenta em 1.
    - Atualize `verificarStatus` para mostrar a idade.

---

## Regras do jogo

### Objetivo
- Fazer o bichinho chegar à **idade 50**.

### Derrota
- Se a **fome** chegar a `100`, você perde.
- Se o **cansaço** chegar a `100`, você perde.
- Se a **felicidade** chegar a `0`, você perde.

### Passagem do tempo (por ciclo)
- **Fome**: aumenta em `3`
- **Felicidade**: diminui em `3`
- **Cansaço**: aumenta em `10`
- **Idade**: aumenta em `1`

---

## Desafios extras (opcional)

Se quiser deixar o jogo mais completo:

- No método `descansar`, pedir por quantas horas o pet vai descansar.
- Considerar que com **8 horas** ele fica totalmente descansado.
- Criar um medidor de **vontade de ir ao banheiro** (aumenta ao alimentar).
- Criar um medidor de **sujeira** (aumenta ao brincar).
- Definir limites para esses medidores: se ultrapassar, o jogador perde.
