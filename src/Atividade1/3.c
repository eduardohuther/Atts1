/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int vetor[10], menor = 0, pos = 0, i;
    
    for(i = 0; i < 10; i++){
        printf("Digite um numero inteiro[%d]:", i);
        scanf("%d", &vetor[i]);
        if(vetor[i] < menor || i == 0){
            menor = vetor[i];
            pos = i;
        }
    }
    printf("O menor elemento do vetor é %d na posição %d", menor, pos);

    return 0;
}
