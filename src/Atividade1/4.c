/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int vetor[20], vetorR[20], i;
    
    for(i = 0; i < 20; i++){
        printf("Digite um numero inteiro[%d]:", i);
        scanf("%d", &vetor[i]);
        printf("vetor[%d]: %d\n", i, vetor[i]);
    }
    
    for(i = 0; i < 20; i++){
        vetorR[i] = vetor[19-i];
        printf("vetor resultante[%d]: %d\n", i, vetorR[i]);
    }

    return 0;
}
