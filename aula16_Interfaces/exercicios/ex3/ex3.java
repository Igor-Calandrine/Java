package aula16_Interfaces.exercicios.ex3;

public class ex3 {
/*
Uma empresa trabalha com dois tipos de contrato:
-Contrato Empresarial: representa um serviço contratado por outra empresa.
-Contrato de Consultoria: representa um serviço de consultoria prestado por um profissional.

Os dois contratos possuem valores totais diferentes, mas compartilham uma regra: ambos podem ser divididos em parcelas mensais.
Sua tarefa é criar uma interface chamada Contrato que contenha um método default para calcular o valor das parcelas.
A ideia é que cada classe forneça seus próprios dados, enquanto a interface reutiliza a lógica do cálculo.

*Implemente na classe Empresarial
Atributos privados:
   nomeEmpresa, do tipo String
   valorTotal, do tipo double
   dataInicio, do tipo LocalDate

*Implemente na classe Consultoria
Atributos privados:
   nomeConsultor, do tipo String
   valorContrato, do tipo double
   dataInicio, do tipo LocalDate

Implementar toString() para apresentar os dados do contrato.

*No programa principal, você deverá:
Instanciar um contrato empresarial no valor de R$ 12.000,00, com início em 2026-10-01.
Instanciar um contrato de consultoria no valor de R$ 7.500,00, com início em 2026-11-01.
Exibir os dados dos dois contratos.
Calcular o parcelamento do primeiro contrato em 12 parcelas.
Calcular o parcelamento do segundo contrato em 5 parcelas.
Exibir o valor das parcelas com duas casas decimais usando printf.

*Desafio extra: use polimorfismo
Depois que tudo estiver funcionando, crie uma variável do tipo Contrato que receba um objeto ContratoEmpresarial.
Use essa variável para chamar calcularParcela().
Em seguida, faça o mesmo com um objeto ContratoConsultoria.


*/ 
}
