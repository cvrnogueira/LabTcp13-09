a. O que aconteceu quando voc� criou uma das classes concretas e estendeu as classes abstratas?
As classes concretas tem a possibilidade de referenciar seus pais, usando o super(...), usei-o tanto no toString,
para pegar as vari�veis, como nos construtores, para evitra repeti��o de c�digo.
b. O que aconteceu quando voc� adicionou o m�todo eval � interface ExpressaoLogica?
As classes concretas, por extenderem as que implementaram a interface(como gosto de pensar, as classes concretas 
extenderam para elas o contrato assinado entre as classes abstratas e a interface), precisaram implemetar o m�todo eval tamb�m.