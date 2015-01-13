#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

void main(void)
{
	int a=10;
	system("cls"); 	//clrscr();
	printf("\nIntroduce un numero decimal: ");
	scanf("%d",&a);
	printf("%#x",a);
	printf("\n\n");
	getch(); //system("pause");

}