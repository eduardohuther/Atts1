/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int vetor[20], pares = 0, i;
    
    for(i = 0; i < 20; i++){
        printf("Digite um numero inteiro[%d]:", i);
        scanf("%d", &vetor[i]);
        if(vetor[i] % 2 == 0){
            pares++;    
        }
    }
    printf("Quantidade de pares = %d\n", pares);

    return 0;
}
