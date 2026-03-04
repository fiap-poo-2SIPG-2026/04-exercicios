# Exercício 01
Uma loja virtual está desenvolvendo um módulo simples para controle de produtos cadastrados em seu sistema. Cada produto possui informações essenciais que precisam ser 
armazenadas e manipuladas pelo programa.
A equipe de desenvolvimento decidiu utilizar o paradigma de **Programação Orientada a Objetos (POO)** para organizar melhor o código e facilitar futuras expansões do sistema. 
Sua tarefa é implementar a estrutura básica dessa solução.
A classe produto deve conter obrigatoriamente 3 atributos (nome, valor, quantidade disponível) e o método construtor para inicializar os atributos. Crie também um método 
para aumentar o valor do produto a partir de uma porcentagem informada pelo usuário da aplicação.

# Exercício 02
Uma clínica médica implementou um sistema simples para gerar senhas de atendimento. Cada paciente que chega recebe um número de senha sequencial que fica associado ao nome 
do paciente. O sistema deve controlar automaticamente a próxima senha disponível.
Implemente uma classe chamada **SenhaAtendimento** com dois atributos: número da senha sequencial e o nome do paciente. 
A classe deverá ter o método construtor para inicializar os atributos e também um método para retornar o nome do paciente e o número da sua senha. Teste o seu programa 
gerando dois ou três objetos e imprimindo os dados no terminal.

**Como fazer o controle automático das senhas?**

# Exercício 03
Desenvolver uma classe chamada **BilheteUnico** para simular o funcionamento do bilhete único do metrô de São Paulo. A classe deverá ter os seguintes atributos:
- Número do bilhete (valor aleatório entre 1000 e 9999).
- Usuário (nome do usuário do bilhete).
- Saldo.
- Valor da tarifa base (variável static).
- Tipo de tarifa (estudante e professor pagam 50% da tarifa base e normal paga 100% da tarifa base).

Codificar o método construtor para inicializar os atributos, método para carregar o bilhete e método para simular a passagem na catraca. Teste o seu programa gerando 
um objeto e chamando os métodos para validar a codificação.

# Exercício 04
Um estacionamento deseja controlar quantos carros já entraram no local durante o dia. Cada carro registrado deve possuir: **placa** e **modelo**. O sistema deve manter o 
total de carros que já passaram pelo estacionamento.
Codifique o método construtor para inicializar os atributos do objeto e também um método para retornar o total de carros que já entraram no estacionamento.
Teste a sua aplicação gerando alguns objetos e imprimindo o total de carros para conferência.

# Exercício 05
Uma plataforma de streaming possui diversos usuários cadastrados em diferentes planos. Recentemente, a empresa decidiu aplicar um **reajuste global de preços** em todos os 
planos devido ao aumento de custos operacionais. Entretanto:
- o percentual de reajuste deve ser único para todos.
- esse percentual deve ser controlado pelo sistema.
- todas as contas devem usar o mesmo percentual vigente.

Implementar a classe **ContaStreaming** considerando uma **taxa global de reajuste** compartilhada entre todas as contas. A classe deverá ter os seguintes atributos: usuário, plano 
e valor do plano. 
Codifique o método construtor para inicializar todos os atributos do objeto, um método para alterar o valor da taxa global e um método para calcular, atualizar e 
retornar o valor do plano. 

# Exercício 06
Uma empresa está criando um jogo simples onde cada jogador possui uma pontuação (score). Em determinados momentos do jogo, a empresa ativa um **bônus global** (ex.: evento de final de semana), que aumenta os pontos ganhos por todos os jogadores.

**Regras:**
- Cada Jogador tem: **nome** e **pontuacao**.
- Existe um **multiplicador de bônus global** compartilhado por todos os jogadores.
- Quando um jogador ganha pontos, o valor real adicionado deve ser: **pontosGanho * multiplicadorGlobal**.
- O bônus global pode ser alterado durante a execução do programa e deve impactar todos os jogadores.

Codifique uma classe para representar cada jogador da aplicação. Codifique os seguintes métodos:
- Método construtor para inicializar os atributos do objeto.
- Método para alterar o valor do multiplicador global.
-Método para aplicar pontos no jogador obedecendo a regra descrita no slide anterior.

Teste sua aplicação gerando alguns objetos e alterando o multiplicador global. Imprima os valores da pontuação de cada jogador para verificar se os métodos e os resultados estão corretos. 
