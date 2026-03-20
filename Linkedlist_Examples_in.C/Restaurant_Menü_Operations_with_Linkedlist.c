#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct NODE{
	int productCategory;
	char productName[20];
	int quantity;
	double productPrice;
	
	struct NODE *next;
} Node;


Node *head = NULL, *q=NULL , *temp = NULL, *newNode;

void menu(){
	
	int secim=0;
	
	
	while(secim!=4){
		printf("***********************************************************************");
		printf("\n1.urun ekleme\n");
		printf("2.urun silme\n");
		printf("3.urunleri yazdirma\n");
		printf("4.cikis\n");
		printf("tercih kodunu gir: ");
		
		scanf("%d",&secim);
		getchar();		
		
		int productCategory;
		char productName[20];
		int quantity;
		double productPrice;
				
				
		switch(secim){	
			case 1:
				printf("\neklenecek urunun kategorisini girin(1-yiyecek | 2-icecek | 3-tatli): ");
				scanf("%d",&productCategory);
				getchar();

				while(productCategory!=1 && productCategory!=2 && productCategory!=3){
					printf("hatali kategori girdin tekrar gir(1-yiyecek | 2-icecek | 3-tatli): ");
					scanf("%d",&productCategory);
					getchar();
				}
				
				
				printf("eklenecek urunun adini girin: ");
				fgets(productName,sizeof(productName),stdin);
				productName[strcspn(productName,"\n")]=0;
				
				
				printf("eklenecek urunun miktarini girin: ");
				scanf("%d",&quantity);
				getchar();		
				
				printf("eklenecek urunun fiyatini girin(ondalýklýklý olabilir): ");
				scanf("%lf",&productPrice);	
				getchar();
				
				
				newNode= (Node*)malloc(sizeof(Node));
				
				
				strcpy(newNode->productName,productName);
				
				newNode->productCategory = productCategory;
				newNode->productPrice=productPrice;
				newNode->quantity=quantity;
				newNode->next=NULL;
				
				ekleme(newNode);

				break;
			case 2:	
				silme();
				
				break;
			case 3:
				display();
			
				break;
			case 4:
				printf("program kapatiliyor...");
				break;
			default:
				printf("\nWARNING MISTAKE OPERATION CODE -enter again\n\n");
				break;
		}
	}
}


void ekleme(Node *node){
	
	if(head==NULL){
		head=node;
		
		return;
	}
	
	if(head->quantity < node->quantity){
		if(head->next==NULL){
			head->next=node;
			return;
		}
		if(head->next->quantity > node->quantity){
			temp=head->next;
			head->next=node;
			node->next=temp;
			return;
		}
	}
	else{
		node->next=head;
		head=node;
	}
	
	
	q=head;
	
	while(q->next->quantity < node->quantity){
		q=q->next;
		
		if(q->next==NULL){
			q->next=node;
			
			return;
		}
	}
	
	temp=q->next;
	q->next=node;
	node->next=temp;
}

void silme(){
	char removedName[20];
	
	printf("\nsilinecek urun'un adini giriniz: ");
	fgets(removedName,sizeof(removedName),stdin);
	removedName[strcspn(removedName,"\n")]=0;
	
	
	if(head==NULL){
		printf("\nlistenizde hic eleman bulunmamaktadir.\n\n");
		return;
	}
	
	
	if(strcmp(head->productName,removedName)==0){
		if(head->next!=NULL){
			head=head->next;
		}else{
			head=NULL;
		}
		
		printf("\nurun listeden basariyla silindi\n");
		return;
	}
	
	
	q=head;
	
	while(strcmp(q->productName,removedName)!=0){
		if(q->next==NULL){
			printf("\nboyle bir eleman bulunmamaktadir\n\n");
			return;
		}
		
		temp=q;
		q=q->next;
	}
	
	if(q->next!=NULL){
		temp->next=q->next;
		
		printf("\nurun listeden basariyla silindi\n");
	}else{
		temp->next=NULL;
		
		printf("\nurun listeden basariyla silindi\n");
	}
}

void display(){
	if(head==NULL){
		printf("\n****************hic bir urun girisi yoktur!!!***********************\n\n");
		return;
	}
	
	
	q=head;
	
	while(q->next!=NULL){
		printf("\n***********  LIST  **********");
		printf("\nquantity: %d",q->quantity);
		printf("\ncategory: %d",q->productCategory);
		printf("\nname: %s",q->productName);
		printf("\nprice: %2.f",q->productPrice);
		
		
		q=q->next;
	}
	
	if(q->next==NULL){
		printf("\n*****************************");
		printf("\nquantity: %d",q->quantity);
		printf("\ncategory: %d",q->productCategory);
		printf("\nname: %s",q->productName);
		printf("\nprice: %2.f",q->productPrice);
	}
	
	
	printf("\n*****************************\n\n\n");
}



int main(){
	menu();
}

