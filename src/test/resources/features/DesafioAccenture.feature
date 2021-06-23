#language: pt
#Author: marciorpnascimento@hotmail.com
@teste
Funcionalidade: Realiza cadastro de seguro para veiculo.
  Eu como usuario acesso ao site da Tricents e 
  realizo o cadastro do seguro para meu veiculo!

  Contexto: Acesso o Site
    Dado que acesso o site "http://sampleapp.tricentis.com/101/app.php"

  Esquema do Cenario: Realiza cadastro das telas da Seguradora
    Quando preencho Tela Vehicle Data <Marca>, <Modelo>, <Cilindrada>, <Motor>, <Fabricacao>, <Assentos>, <Combustivel>, <Carga>, <Peso Total>, <Valor>, <Placa>, <Kilometragem> e dou click em Next
    E preencho a tela Insurant Data <Nome>, <Sobrenome>, <Aniversario>, <Sexo>, <Endereco>, <Pais>, <CEP>, <Estado>, <Cargo>, <Hobbie>, <Site> e dou click em Next
    E preencho a tela Product Data  <Data Inicio>, <Valor Seguro>, <Merito>, <Seguro Danos>, <Opcao>, <Veiculo Reserva> e dou click em Next
    E seleciono o opcao do valor <Valor>
    E preencho <e-mail>, <Celular>, <Usuario>, <Senha>, <Comentarios> e dou click em Send
    Então eu valido que o email foi enviado com sucesso!

    Exemplos: 
      | Marca   | Modelo       | Motor | Cilindrada | Fabricacao   | Assentos | Combustivel | Carga | Peso Total | Valor  | Placa     | Kilometragem | Nome     | Sobrenome    | Aniversario  | Sexo | Endereco                             | Pais     | CEP        | Estado      | Cargo      | Hobbie  | Site                               | Data Inicio  | Valor Seguro | Merito        | Seguro Danos    | Opcao                     | Veiculo Reserva | Valor      | e-mail                           | Celular       | Usuario  | Senha      | Comentarios       |
      | "Honda" | "Motorcycle" | "29"  | "125"      | "07/14/2014" | "2"      | "Gas"       | "85"  | "120"      | "4000" | "COR0383" | "100000"     | "Marcio" | "Nascimento" | "07/14/1980" | "M"  | "Rua Torquao Joaquim Rodrigues, 394" | "Brazil" | "09920220" | "São Paulo" | "Employee" | "Other" | "https://github.com/Marcio-40-mrn" | "10/14/2021" | "3000000"    | "Super Bonus" | "Full Coverage" | "Legal Defense Insurence" | "Yes"           | "Ultimate" | "marciorpnascimento@hotmail.com" | "11991364236" | "Master" | "Mn123456" | "passei por aqui" |
