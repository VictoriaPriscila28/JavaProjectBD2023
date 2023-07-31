# Projeto de Criptografia de Texto

Este é um projeto desenvolvido para a disciplina de Banco de Dados com o objetivo de implementar um sistema de encriptação de texto. O projeto utiliza a linguagem de programação Java para realizar a criptografia e o banco de dados MySQL para armazenar as chaves e os textos criptografados.

## Funcionalidades

- Criptografar texto: O sistema permite que o usuário informe um texto e selecione uma chave de encriptação. O texto é então criptografado usando a chave selecionada e armazenado no banco de dados.

- Descriptografar texto: Além da criptografia, o sistema também oferece a opção de descriptografar o texto previamente criptografado. Para isso, o usuário precisa informar a chave correta associada ao texto.

- Armazenamento seguro: As chaves de encriptação são armazenadas no banco de dados de forma segura, utilizando técnicas adequadas de criptografia para garantir a confidencialidade.

## Tecnologias Utilizadas

- Java: Utilizado para implementar a lógica da criptografia e integração com o banco de dados.

- MySQL: Utilizado como banco de dados para armazenar as chaves de encriptação e os textos criptografados.

- JDBC: Biblioteca utilizada para fazer a conexão entre o Java e o banco de dados MySQL.

## Requisitos

- Java 8 ou superior instalado no sistema.

- Banco de dados MySQL configurado e funcionando.

## Como Executar o Projeto

1. Clone o repositório para o seu computador.

2. Crie um banco de dados no MySQL com a estrutura apropriada para armazenar as chaves e os textos criptografados. O script SQL para criar as tabelas pode ser encontrado na pasta "database" do projeto.

3. Configure as informações de conexão com o banco de dados no arquivo "config.properties" do projeto.

4. Execute o projeto utilizando uma IDE Java ou compilando e executando manualmente.

5. Siga as instruções na interface do sistema para criptografar ou descriptografar textos.

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir com melhorias, correções de bugs ou novas funcionalidades, sinta-se à vontade para enviar um pull request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE). Sinta-se à vontade para usá-lo e modificá-lo de acordo com as suas necessidades.

**Nota:** Este projeto é apenas para fins acadêmicos e não deve ser utilizado para fins de segurança ou criptografia de dados sensíveis em ambientes de produção.




