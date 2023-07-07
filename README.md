# e-diaristas
<h1> Descrição do projeto</h1>
Este projeto é um aplicativo web para gerenciar serviços domésticos, desenvolvido em Java com o framework Spring. O objetivo principal do projeto é permitir que os usuários cadastrem, editem e excluam serviços domésticos, como limpeza de banheiro, cozinha, quarto, entre outros.

<h1>Tecnologias utilizadas</h1>
- Java
- Spring Framework
- Spring MVC
- Thymeleaf (template engine)
- Hibernate (ORM)
- MySQL (banco de dados)

<h1>Funcionalidades principais</h1>
Listagem de serviços: A página inicial do aplicativo exibe uma lista de todos os serviços cadastrados. Os serviços são recuperados do banco de dados e exibidos em uma tabela.

Cadastro de serviço: Os usuários podem cadastrar novos serviços preenchendo um formulário. O formulário inclui campos como nome do serviço, ícone, porcentagem de comissão, entre outros. Após o cadastro, o serviço é salvo no banco de dados.

Edição de serviço: Os usuários podem editar serviços existentes, selecionando um serviço da lista e preenchendo o formulário de edição. As alterações são salvas no banco de dados.

Exclusão de serviço: Os usuários podem excluir serviços existentes selecionando um serviço da lista e confirmando a exclusão. O serviço é removido do banco de dados.

<h1>Estrutura do projeto</h1>
O projeto segue a estrutura padrão do Spring MVC, com os seguintes pacotes principais:

br.com.treinaweb.ediaristas.web.controllers: Este pacote contém os controladores do Spring MVC, responsáveis por lidar com as requisições HTTP e retornar as respostas adequadas. O ServicoController é o controlador principal deste projeto e contém os métodos para listar, cadastrar, editar e excluir serviços.

br.com.treinaweb.ediaristas.web.dtos: Este pacote contém os DTOs (Data Transfer Objects) utilizados para transportar dados entre a camada de apresentação e a camada de serviço. O ServicoForm é o DTO utilizado para o cadastro e edição de serviços.

br.com.treinaweb.ediaristas.web.services: Este pacote contém os serviços responsáveis pela lógica de negócio relacionada aos serviços. O WebServicoService é o serviço principal para o gerenciamento de serviços.

br.com.treinaweb.ediaristas.core.enums: Este pacote contém enums utilizados no projeto, como o Icone, que representa os diferentes ícones disponíveis para os serviços.

<h1>Configuração do banco de dados</h1>
O projeto utiliza o MySQL como banco de dados. As configurações de conexão com o banco de dados estão definidas no arquivo application.properties ou application.yml, que deve ser configurado corretamente para que o aplicativo possa se conectar ao banco de dados.

<h1>Como executar o projeto</h1>
Para executar o projeto, é necessário configurar um ambiente de desenvolvimento Java e ter o MySQL instalado. Em seguida, siga as etapas abaixo:

Clone o repositório do projeto para sua máquina local.
Importe o projeto em sua IDE de desenvolvimento preferida.
Configure as propriedades de conexão com o banco de dados no arquivo application.properties ou application.yml.
Execute o projeto a partir da classe principal, geralmente denominada Application ou similar.
Abra um navegador da web e acesse a URL http://localhost:8080 para acessar o aplicativo.
Certifique-se de ter todas as dependências necessárias baixadas e configuradas corretamente para evitar erros de compilação e execução.

<h1>Melhorias futuras</h1>
Implementar autenticação de usuários para garantir que apenas usuários autorizados possam cadastrar, editar e excluir serviços.
Adicionar recursos de paginação e filtragem para a lista de serviços, permitindo que os usuários naveguem facilmente pelos serviços.
Melhorar o design e a experiência do usuário do aplicativo com estilos CSS e scripts JavaScript.
Adicionar recursos de internacionalização para permitir que o aplicativo seja traduzido para vários idiomas.
