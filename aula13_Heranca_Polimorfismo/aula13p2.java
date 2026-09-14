package aula13_Heranca_Polimorfismo;

public class aula13p2 {
public static void main(String[] args) {
/*
-Upcasting
   Upcasting acontece quando atribuímos um objeto de uma subclasse a uma variável cujo tipo é a superclasse.
   ?Não é uma transformação, é um "tratar como"
   Temos: 
      BusinessAccount -> Account

*  Account acc = new BusinessAccount();


-Downcasting
    Upcasting acontece quando atribuímos um objeto de uma superclasse a uma variável cujo tipo é a subclasse.
    ?Não é uma transformação, é um "tratar como"
   Temos: 
      BusinessAccount -> Account
      SavingAccount   -> Account

*  BusinessAccount = BusinessAccount(Account)
   ?Mas se a Super Classe não tiver um atributo da Subclasse, claramente teremos um erro

-InstanceOf
   Instanceof verifica se um objeto pode ser uma instância de determinado tipo.

*   if (account instanceof BusinessAccount) {
      BusinessAccount business = (BusinessAccount) account;
      business.loan(1000.0);
   }









*/ 







}   
}
