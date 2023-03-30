Pergunta:

Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes crit�rios: 

Criar uma estrutura heterog�nea (array) do tipo string para cadastrar o nome de 25 alunos; 
Garantir que a estrutura seja totalmente preenchida. 

Ap�s implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.  

Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos conceitos de gerenciamento de mem�ria. 

resposta:

A maior dificuldade em cadastrar os novos alunos foi a de ter que entender que teria que mudar o tamanho do array para 30, visto  que n�o � poss�vel simplesmente adicionar novos elementos ao final do array quando o array j� est� totalmente preenchido. Tentei de algumas formas criar e sempre dava erro de overflow, ou seja, estouro de mem�ria.