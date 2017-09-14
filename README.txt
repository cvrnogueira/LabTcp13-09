a. O que aconteceu quando você criou uma das classes concretas e estendeu as classes abstratas?
As classes concretas tem a possibilidade de referenciar seus pais, usando o super(...), usei-o tanto no toString,
para pegar as variáveis, como nos construtores, para evitra repetição de código.
b. O que aconteceu quando você adicionou o método eval à interface ExpressaoLogica?
As classes concretas, por extenderem as que implementaram a interface(como gosto de pensar, as classes concretas 
extenderam para elas o contrato assinado entre as classes abstratas e a interface), precisaram implemetar o método eval também.