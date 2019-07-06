#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node* next;
};
struct Node* head;

void Insert(int data){

    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = NULL;
    if(head == NULL){
    head = newNode;
    }
    else{
            Node* prevNode = head;
            while(prevNode->next!=NULL){
                prevNode = prevNode->next;
            }
            prevNode->next = newNode;
        }
}
void InsertAt(int data,int n){

    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = NULL;

    if(n == 1){
            newNode->next = head;
            head = newNode;
            return;
    }
    else{
            Node* prevNode = head;
            for(int i=1;i<n-1;i++){
            prevNode = prevNode->next;
            }
            newNode->next = prevNode->next;
            prevNode->next = newNode;
        }
}

void Delete(int n){

    Node* temp1 = head;
    if(n == 1){
        head = temp1->next;
        free(temp1);
        return;
    }
    for(int i=1;i<n-1;i++){
        temp1 = temp1->next;
    }
    Node* temp2 = temp1->next;
    temp1->next = temp2->next;
    free(temp2);
}

void print(){
    Node* temp = head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}
int main(){

    head=NULL;
    Insert(10);//10
    print();
    Insert(20);//10 20
    print();
    InsertAt(30,1);//30 10 20
    print();
    Insert(40);//30 10 20 40
    print();
    InsertAt(50,3);//30 10 50 20 40
    print();
    printf("head = %d\n",head);
    int n;
    printf("Enter a position: ");
    scanf("%d",&n);
    Delete(n);
    Node* temp = head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

