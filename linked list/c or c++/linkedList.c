#include<stdlib.h>
#include<stdio.h>
typedef struct Node{
    int data;
    struct Node* next;
}Node;
struct Node* head;
void Insert(int x){
    Node* temp =(Node*)malloc(sizeof(struct Node));
    (*temp).data = x;
    (*temp).next = head;
    printf("temp->next=%d\n",temp->next);
     printf("temp=%d\n",temp);
    head = temp;
    printf("head=%d\n",head);
    }
void print(){
    Node* temp = head;
    printf("List is:\n");
    while(temp!=NULL){
        printf("temp->data=%d\n",temp->data);
        //printf("temp=%d\n",temp);
        temp=temp->next;
        //printf("temp=%d\n",temp);
    }
    printf("\n");
}
int main(){
    head=NULL;
    printf("How many numbers?:");
    int n,i,x,j;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter the number:");
        scanf("%d",&x);
        Insert(x);
        print();
    }
}
