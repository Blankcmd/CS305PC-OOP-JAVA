#include<stdio.h>
#include<stdlib.h>
struct node* create(int ele);
void insert_beg(int ele);
void insert_end(int  ele);
void insert_pos(int ele);
void delete_beg();
void delete_end();
void delete_pos();
void display();
struct node
{
	int data;
	struct node *next;
};
struct node *head=NULL;
int main()
{
	int ch;
	do
	{
		printf("Menu\n1.insert_beg\n2.insert_end\n3.insert_pos\n4.delete_beg\n5.delete_end\n6.delete_pos\n7.display\n");
	printf("Enter your choice");
	scanf("%d",&ch);
	switch(ch)	
		}
			case 1:
			printf("Enter the value to be inserted");
			scanf("%d",&ele);
			insert_beg(ele);
			break;
			case 2:
			printf("Enter the value to be inserted");
			scanf("%d",&ele);
			insert_end(ele);
			break;
			case 3:
			printf("Enter the value to be inserted");
			scanf("%d",&ele);
			insert_pos(ele);
			break;
			case 4:
			delete_beg(ele);
			break;
			case 5:
			delete_end(ele);
			break;
			case 6:
			delete_pos(ele);
			break;
			case 7:
			display();
			break;
			default:
			printf("Wrong choice");
			break;
		}
	}while(ch<=7);
		return 0;
}
	struct node *create(int ele)
{
	struct node *newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=ele;
	newnode->next=NULL;
	return newnode;
}
void insert_beg(int ele)
{
	struct node *newnode=create(ele)
	if(head=NULL)
	head=newnode;
	else{
	newnode->next=head;
	head=newnode;
	}
	}
	
	

			
			

