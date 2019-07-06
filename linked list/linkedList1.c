#include<stdlib.h>
#include<stdio.h>
typedef struct Node{
    int data;
    struct Node* next;
}Node;

struct Node* head;

void Insert(int x){
    Node* temp = (Node*)malloc(sizeof(struct Node));
    temp->data = x;
    temp->next =head;
    head=temp;
}

void print(){
    Node* temp = head;
    printf("The list is: ");
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
    printf("\n\n");
    }
int main(){
    head=NULL;
    printf("How many numbers?: ");
    int n,x,i;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter the number: ");
        scanf("%d",&x);
        Insert(x);
        print();
    }

}
