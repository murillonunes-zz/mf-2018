Comandos executados via shell

1. Mostra o diretório atual:
   pwd

2. Cria um novo diretório:
   mkdir nome

3. Navega entre diretórios:
   cd diretorio

4. Remover um arquivo:
   rm arquivo

5. Remover um diretório:
   rm -rf diretorio

6. Listar os arquivos e pastas do diretório:
   ls

7. Copiar arquivos e diretórios:
   cp arquivo> novo_arquivo

8. Copiar arquivos entre computadores distintos:
   scp arquivo usr@ip:/diretorio/destino

9. Definir uma variável de ambiente:
   export VARIAVEL=<conteudo>

10. Mostrar o conteúdo de uma variável de ambiente:
   echo $VARIAVEL

11. Calculadora
   echo "10 + 5" | bc

12. Exibir o código de retorno do último aplicativo executado:
   echo $?

13. Exibir o interpretador de comandos é usado:
   echo $0

14. Exibir o diretório do executável do interpretador de comandos:
   echo $SHELL

15. Fazer login em um computador remoto:
   ssh usuario@ip

16. Consulta e mostra o IP da máquina:
   curl http://ifconfig.co

17. Mostra os detalhes de rede do computador:
   ifconfig

18. Mostra e atualiza em tempo real alguma aplicação:
   watch aplicacao

19. Realiza teste de ping (resposta) para algum computador remoto:
   ping ip

20. Abre um arquivo de texto com o editor de texto GNU nano:
   nano arquivo.txt
