/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int vetor1[10], vetor2[10], vetorR[10], i;
    
    for(i = 0; i < 10; i++){
        printf("Digite um numero inteiro para o vetor1[%d]:", i);
        scanf("%d", &vetor1[i]);
        printf("Digite um numero inteiro para o vetor2[%d]:", i);
        scanf("%d", &vetor2[i]);
        vetorR[i] = vetor1[i] * vetor2[i];
    }
    
    for( i = 0 ; i < 10; i++){
        printf("vetor resultante[%d] = %d\n",i, vetorR[i]);
    }

    return 0;
}
