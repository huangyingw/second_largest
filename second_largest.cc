#include"stdio.h"
#include"stdlib.h"
#include<iostream>

using namespace std;

void second_largest(int array[], int len) 
{
  int max,sec_max;
  max=sec_max=-1000;
  for (int i=0;i<len;i++)
  {
    if (array[i]>max)
    {
      sec_max=max;
      max=array[i];
    }
    else if( array[i] < max && array[i] > sec_max)
    {
      sec_max=array[i];
    }
  }
  cout<<sec_max<<endl;
}

void print_array(int array[], int len)
{
  for (int i=0;i<len;i++)
  {
    cout<<array[i]<<",";
  }
  cout<<endl;
}

int main() 
{
  int a[] = {4, 2, 5};
  second_largest(a,sizeof(a)/sizeof(int));

  /*{1, 2, 3, 4} 3
  {{4, 1, 2, 3}} 3
  {1, 1, 2, 2} 1
  {1, 1} -1
  {1} -1
  {} -1
  */
  return 0;
}
