"""
Crie um programa que solicite ao usuário:
   Nome do evento
   Quantidade de ingressos vendidos
   Valor de cada ingresso
Calcule o valor total arrecadado.
A saída deve ficar semelhante a:
   Evento: Show de Rock
   Ingressos Vendidos: 350
   Valor do Ingresso: R$ 120.00
   Arrecadação Total: R$ 42000.00
""" 

nome_evento = input("Digite o nome do evento: ")
ingresso_qnt = int(input("Digite a quantidade vendida: "))
ingresso_valor = float(input("Digite a valor do ingresso: "))

arrecadacao = ingresso_qnt * ingresso_valor

print(f"Evento: {nome_evento}")
print(f"Ingressos Vendidos: {ingresso_qnt}")
print(f"Valor do Ingresso: R$ {ingresso_valor:.2f}")
print(f"Arrecadação Total: R$ {arrecadacao:.2f}")