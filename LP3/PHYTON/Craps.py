#Importar classe para ter numeros randômicos
import random

#Importar classe para encerrar o programa
import sys

value1 = random.randint(1,6)
value2 = random.randint(1,6)
score = value1 + value2

print("Dado 1:", value1)
print("Dado 2:", value2)
print("Score:", score)

#Função para checagem do score
def check(score):
    if score == 7 | score == 11:
        return True
    else:
        if score == 2 | score == 3 | score == 12:
            return False
        else:
            return score

#Checagem da condição de vitória
if check(score) == True:
    print("Você Venceu!")
    sys.exit()
else:
    if check(score) == False:
        print("Você Perdeu!")
        sys.exit()
    else:
        print("Começando estágio 2!")

#Estágio 2
while(1):
    value1 = random.randint(1,6)
    value2 = random.randint(1,6)
    score2 = value1 + value2
    count = 1

    print("Dado 1:", value1)
    print("Dado 2:", value2)
    print("Jogada", count, ":", score2)

    count + 1
    if score2 == 7:
        print("Você Perdeu!")
        break

    if score2 == score:
        print("Você Venceu!")
        break



