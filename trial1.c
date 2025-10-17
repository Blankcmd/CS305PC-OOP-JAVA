#include<stdio.h>
#include<stdlib.h>
struct node* create(int ele);
void insert_beg(int ele);
void insert_end(int ele);
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

struct node *head = NULL;

int main()
{
    int ch, ele;
    do
    {
        printf("Menu\n1.insert_beg\n2.insert_end\n3.insert_pos\n4.delete_beg\n5.delete_end\n6.delete_pos\n7.display\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);

        switch(ch)
        {
            case 1:
                printf("Enter the value to be inserted: ");
                scanf("%d", &ele);
                insert_beg(ele);
                break;
            case 2:
                printf("Enter the value to be inserted: ");
                scanf("%d", &ele);
                insert_end(ele);
                break;
            case 3:
                printf("Enter the value to be inserted: ");
                scanf("%d", &ele);
                insert_pos(ele);
                break;
            case 4:
                delete_beg();
                break;
            case 5:
                delete_end();
                break;
            case 6:
                delete_pos();
                break;
            case 7:
                display();
                break;
            default:
                printf("Wrong choice\n");
                break;
        }
    } while(ch <= 7);
    return 0;
}

struct node *create(int ele)
{
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = ele;
    newnode->next = NULL;
    return newnode;
}

void insert_beg(int ele)
{
    struct node *newnode = create(ele);
    if(head == NULL)
        head = newnode;
    else
    {
        newnode->next = head;
        head = newnode;
    }
}
void insert_end(int ele)
{
    struct node *newnode = create(ele);
    if(head == NULL)
    {
        head = newnode;
        return;
    }
    struct node *temp = head;
    while(temp->next != NULL)
        temp = temp->next;
    temp->next = newnode;
}
void insert_pos(int ele)
{
    int pos, i;
    printf("Enter position to insert: ");
    scanf("%d", &pos);

    if(pos == 1)
    {
        insert_beg(ele);
        return;
    }

    struct node *newnode = create(ele);
    struct node *temp = head;

    for(i = 1; i < pos - 1 && temp != NULL; i++)
    {
        temp = temp->next;
    }

    if(temp == NULL)
    {
        printf("Position out of range\n");
        free(newnode);
        return;
    }

    newnode->next = temp->next;
    temp->next = newnode;
}
void delete_beg()
{
    if(head == NULL)
    {
        printf("List is empty\n");
        return;
    }
    struct node *temp = head;
    head = head->next;
    free(temp);
    printf("Deleted from beginning\n");
}
void delete_end()
{
    if(head == NULL)
    {
        printf("List is empty\n");
        return;
    }
    if(head->next == NULL)
    {
        free(head);
        head = NULL;
        printf("Deleted last element\n");
        return;
    }
    struct node *temp = head;
    while(temp->next->next != NULL)
        temp = temp->next;
    free(temp->next);
    temp->next = NULL;
    printf("Deleted from end\n");
}

void delete_pos()
{
    int pos, i;
    printf("Enter position to delete: ");
    scanf("%d", &pos);

    if(head == NULL)
    {
        printf("List is empty\n");
        return;
    }

    if(pos == 1)
    {
        delete_beg();
        return;
    }

    struct node *temp = head;
    for(i = 1; i < pos - 1 && temp != NULL; i++)
    {
        temp = temp->next;
    }

    if(temp == NULL || temp->next == NULL)
    {
        printf("Position out of range\n");
        return;
    }

    struct node *toDelete = temp->next;
    temp->next = toDelete->next;
    free(toDelete);
    printf("Deleted from position %d\n", pos);
}
void display()
{
    if(head == NULL)
    {
        printf("List is empty\n");
        return;
    }
    struct node *temp = head;
    printf("List elements: ");
    while(temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

