/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int vetor[15], i, j, menor = 0;
    
    for(i = 0; i < 15; i++){
        printf("Digite um numero inteiro[%d]:", i);
        scanf("%d", &vetor[i]);
    }
    
    for(i = 0; i < 15; i++){
        for(j = 0; j< 15; j++){
            if(vetor[j] < vetor[j+1]){
                menor = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = menor;
            }
        }
    }
    
    for(i = 0; i < 15; i++){
        printf("vetor[%d]: %d\n", i, vetor[i]);
    }

    return 0;
}
