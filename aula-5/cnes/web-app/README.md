## CNES web-app

O **CNES web-app** exibe, em uma página simples, informações (**código CNES** e **razão social**) dos estabelecimentos de saúde registrados no CNES em uma tabela.

Além disso, a aplicação possui um campo de busca que permite ao usuário **filtrar sua pesquisa** pelo nome.

Também é possível renderizar um mapa ao lado da lista de instituições, com a localização geográfica do estabelecimento de saúde. Isso é feito **clicando duas vezes** sob a linha da instituição.

Para que o **CNES web-app** funcione é necessário, antes, gerar e/ou fornecer um **arquivo JSON** com os dados dos estabelecimentos registrados. Esse arquivo JSON pode ser gerado a executando a aplicação Java **CNES** que também está neste diretório, no **nível anterior**.

![CNES web-app](https://i.imgur.com/qFEwtYh.png)

### Instalação & execução

 1. Clone o repositório para a sua máquina:
>    git clone
 2. **(Dependência)** Antes de executar, é necessário executar um **servidor web**. Um exemplo de servidor web que foi utilizado e testado durante o desenvolvimento é o [Node.js](https://nodejs.org/en/).

3. Uma vez que o Node.js esteja instalado, execute o seguinte comando via Terminal, dentro do diretório **webapp**, localizado em *mf-2018/aula-5/cnes/*:

> npm install
4. Aguarde que as dependências sejam instaladas via **NPM**. Depois, para executar a aplicação, execute o seguinte comando, ainda dentro do diretório **webapp**:
> npm start
