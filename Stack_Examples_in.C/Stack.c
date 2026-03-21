#include<stdio.h>
#include<stdlib.h> 

typedef struct NODE{
	int data;
	struct NODE *next;
}Node;

Node *top=NULL,*q=NULL;

void push(int realData){
	Node *newNode=(Node *)malloc(sizeof(Node));
	
	newNode->data=realData;
	newNode->next=NULL;

	if(top==NULL){
		top=newNode;
		return;
	}
	newNode->next=top;
	top=newNode;
}
void pop(){
	if(top==NULL){
		printf("\nstack'te eleman yok\n\n");
		return;
	}
	
	if(top->next==NULL){
		top=NULL;
		return;
	}
	top=top->next;
}
int peek(){
	return top->data;
}
void display(){
	q=top;
	
	printf("\n\n*****************************\n");
	while(q!=NULL){
		printf("%d\n",q->data);
		q=q->next;
	}
	printf("*****************************\n\n\n");
}
void menu(){
	int choice=0;
	int realData;
	int returned;
	
	while(choice!=5){
		printf("\n1-push");
		printf("\n2-pop");
		printf("\n3-peek");
		printf("\n4-display");
		printf("\n5-exit");
		
		scanf("%d",&choice);
		
		switch(choice){
			case 1:
				printf("eklenecek veriyi giriniz: ");
				scanf("%d",&realData);
				
				push(realData);
				break;
			case 2:
				pop();
				break;
			case 3:
				if(top!=NULL){
					returned=peek();
					printf("\n\ndonen sayi=%d\n\n",returned);
				}else{
					printf("\nstack bos\n\n");
				}
				
				break;
			case 4:
				display();
				break;	
			default:
				printf("WARNING");
		}
	}
}
int main(){
	menu();
}
