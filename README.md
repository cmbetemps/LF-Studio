# LF-Studio
Projeto LF-Studio - Disciplinas de Engenharia de Software e Linguagens Formais - Curso de Engenharia de Computação - UNIPAMPA - Campus Bagé

![Imagem de capa de uma MT](https://github.com/cmbetemps/LF-Studio/blob/Grupo-02/Imagens/turingMachine.gif)

> A presente branch contém os arquivos de funcionamento referentes a *Máquinas de Turing*. 

A sua organização das pastas se dá da seguinte forma:
* _*Imagens*_: contém as representações dos diagramas de uso, layout e *PrintScreen* das telas do programa que podem ser encontradas com seus respectivos detalhes na página da *Wiki* do grupo 02, assim como podem ser encontradas outras gramáticas e linguagens nas branchs dos grupos 01 e 03.

* _*MaqTuring*_: contém a codificação do layout e classes da nossa aplicação.

* _*PrototipacaoTelas*_: contém os protótipos desenhados na aplicação figma para serem utilizados como base para a codificação do layout.

* _*backend*_: está presente a codificação realizada na disciplina de Linguagens Formais para as Máquinas de Turing.


#### Observação: 
> Para executar a máquina de turing, o arquivo de texto deve seguir a seguinte estrutura
estado inicial
estado final
simbolo final
simbolo inicial
conjunto de estados finitos
alfabeto

funções de transições

----------------------------------

### MUITO IMPORTANTE! Não utilize espaço entre os valores que forem digitados em cada linha, ou seja:
❌ q0, q1, q2
✅ q0,q1,q2

----------------------------------

*EXEMPLO DE UMA ESTRUTURA SUPORTADA COMO ENTRADA:*
q0 
q2 
_
%
q0,q1,q2
0,1

q0,%,%,D,q0,
q0,0,0,D,q0,
q0,_,_,D,q2,
q0,1,1,D,q1,
q1,1,1,D,q1,
q1,_,_,E,q2,

---------------------------------