#include<iostream>
using namespace std;
int main()
{
  int u,x,y,z;
  u=sizeof(char);
  x=sizeof(int);
  y=sizeof(float);
  z=sizeof(double);
  std::cout<<u <<"\n"<<x <<"\n" <<y <<"\n" <<z;
}