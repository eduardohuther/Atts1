/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdbool.h>

int main()
{
    int vetor[10], i, n=0;
    bool existe = false;
    
    for(i = 0; i<10;i++){
        printf("Digite um numero inteiro[%d]:", i);
        scanf("%d", &vetor[i]);
    }
    printf("Digite um numero para verificar:");
        scanf("%d", &n);
    for(i=0;i<10;i++){
        if(n==vetor[i]){
            printf("Encontrou %d na posição %d\n", n, i);
            existe = true;
        }
    }
    if(!existe){
        printf("O número fornecido não existe no vetor!");
    }

    return 0;
}
