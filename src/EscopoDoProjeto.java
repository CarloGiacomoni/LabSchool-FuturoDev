//Autor: Carlo de Souza Giacomoni
//Cria��o do programa: 08/09/2022
//�ltima altera��o: 11/09/2022
//Objetivo: Projeto Avaliativo 1


//Escopo do Projeto/diretrizes.

//1-INTRODU��O
//  Considerando os assuntos estudados nas semanas anteriores do m�dulo 2, vamos aplicar
//  todos os conceitos estudados resolvendo o problema abordado no desenvolvimento do
//  software solicitado pelo cliente Lab School.

//2-REQUISITOS DA APLICA��O
//  A aplica��o que dever� ser realizada individualmente deve contemplar os seguintes
//  requisitos:
//  O sistema dever� ser desenvolvido em Java;
//  O sistema deve seguir o Roteiro da Aplica��o;
//  Desenvolvimento das mensagens de sa�da, com espera da a��o do usu�rio;
//  Captura da intera��o do usu�rio via entrada padr�o;
//  O sistema dever� ser apresentado diretamente na linha de comando.

//3-ROTEIRO DA APLICA��O
//  A escola de programa��o Lab School deseja automatizar todo o sistema de armazenamento
//  de informa��es referentes aos alunos, funcion�rios e professores. O sistema deve conter os
//  seguintes tipos de cadastros, cada um com suas caracter�sticas:

//  Aluno
//  Um aluno pode estar com a matr�cula nas seguintes condi��es:
//  *Ativo
//  *Irregular
//  *Atendimento pedag�gico
//  *Inativo
//  O usu�rio do sistema poder� alterar esta condi��o sempre que necess�rio
//  O aluno deve armazenar a nota do processo seletivo de entrada (0 at� 10)
//  Esta nota deve ser inserida no momento do cadastro do aluno
//  Total de atendimentos pedag�gicos realizados
//  Este item � um contador que inicia em zero. Sempre que um pedagogo
//  realiza um atendimento este valor deve ser incrementado
//  Professor
//  **Forma��o acad�mica:
//  *Gradua��o incompleta
//  *Gradua��o completa
//  *Mestrado
//  *Doutorado
//  **Experi�ncia em desenvolvimento:
//  *Front-End
//  *Back-End
//  *Full-Stack
//  **Estado
//  *Ativo
//  *Inativo
//  Pedagogo
//  *Total de atendimentos pedag�gicos realizados:
//  Este item � um contador que inicia em zero. Sempre que um pedagogo
//  realiza um atendimento este valor deve ser incrementado
//  O sistema deve perguntar qual foi o pedagogo e aluno participaram do atendimento
//  Todos os cadastros devem ser derivadas da classe Pessoa, que possui os seguintes atributos e m�todos:
//  **Pessoa
//  *Nome
//  *Telefone
//  *Data de nascimento
//  *CPF
//  *Identificador/C�digo
//  Deve ser gerado automaticamente pelo sistema.
//  O Lab School tamb�m dever� apresentar os seguintes relat�rios:
//  **Listar todas as pessoas cadastradas. O usu�rio dever� informar quais categorias de
//  pessoas deseja listar (deve-se listar C�digo, Nome e CPF):
//  *Alunos
//  *Professores
//  *Funcion�rios
//  *Todos
//  **Relat�rio dos Alunos. O usu�rio deve escolher qual categoria apresentar (deve-se
//  listar c�digo, nota e total de atendimentos pedag�gicos):
//  *Ativo
//  *Irregular
//  *Atendimento pedag�gico
//  *Inativo
//  *Todos
//  **Relat�rio dos professores. O usu�rio deve escolher qual categoria apresentar:
//  *Front-End
//  *Back-End
//  *Full-Stack
//  *Todos
//  **Alunos com mais atendimentos pedag�gicos
//  **Pedagogos com mais atendimentos pedag�gicos