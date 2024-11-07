#include <iostream>
#include <conio.h>
using namespace std;
int main()
{
    int a,b,x;
    cout<<"\t\tFORMASI KOTAK ANGKA"<<"\n";
    cout<<"\t=================================="<<"\n";
    bil:
    cout<<"Inputkan Angka = ";
    cin>>x;
    cout<<"\n";
 
    if(x>0){
        for(a=x;a>=1;a--){
            for(b=a;b>1;b--){
                if (a==x||b==a)
                    cout<<b<<" ";
                else
                    cout<<"  ";
            }
            for(b=1;b<=x-a+1;b++){
                if(a==1||b==x-a+1)
                    cout<<b<<" ";
                else
                    cout<<"  ";
            }
            cout<<endl;
        }
    }
    else {
        cout<<"Input Salah !!!"<<endl;
        goto bil;
    }
    return 0;
}