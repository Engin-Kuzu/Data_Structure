#include<stdio.h>
#include<stdlib.h>


typedef struct NODE{
	int data;
	struct NODE *next;
}Node;

Node *front=NULL,*rear=NULL,*q=NULL;


void enQueue(int realData){
	Node *newTerm=(Node *)malloc(sizeof(Node));
	
	newTerm->data=realData;
	newTerm->next=NULL;
	
	
	if(front==NULL){
		front=newTerm;
		rear=newTerm;
		return;
	}
	
	rear->next=newTerm;
	rear=rear->next;
}
void deQueue(){
	if(front==NULL){
		printf("\nqueue'de zaten eleman yok\n\n");
		return;
	}
	
	if(front->next==NULL){
		front=NULL;
		rear=NULL;
		return;
	}
	
	front=front->next;
}
int peek(){
	return front->data;
}
void display(){
	q=front;
	
	printf("\n\n******************************************");
	while(q!=NULL){
		printf("\n%d",q->data);
		if(q->next!=NULL){
			q=q->next;
		}else{
			break;
		}
	}
	printf("\n******************************************\n\n");
}
void menu(){
	int choice=0;
	int realData;
	int returned;
	
	while(choice!=5){
		printf("\n1-enQueue");
		printf("\n2-deQueue");
		printf("\n3-peek");
		printf("\n4-display");
		printf("\n5-exit");
		
		scanf("%d",&choice);
		
		switch(choice){
			case 1:
				printf("eklenecek veriyi giriniz: ");
				scanf("%d",&realData);
				
				enQueue(realData);
				break;
			case 2:
				deQueue();
				break;
			case 3:
				if(front!=NULL){
					returned=peek();
					printf("\n\ndonen deger= %d\n\n",returned);
				}else{
					printf("\nqueue'de zaten eleman yok\n\n");
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
