#include<iostream>
using namespace std;
class h
{
 
int data;
  public: 
int age;
h(int data){
   this->data=data;
}
void setdata(int dat){
   data=dat;
}

int  getdata(){
   return data;
}

};
int main(){
h h1(20);
h p(h1);
cout<<h1.getdata()<<endl;
cout<<p.getdata();
}

