#include<iostream>
using namespace std;
int main()
{
 int p,t,i,amt;
  float r,dis,fs;
  std::cin>>p;
  std::cin>>r;
  std::cin>>t;
  i=(p*r*t)/100;
  amt=p+i;
  dis=0.02*i;
  fs=amt-dis;
  std::cout<<i <<"\n"<<amt <<"\n"<<dis <<"\n"<<fs;
}