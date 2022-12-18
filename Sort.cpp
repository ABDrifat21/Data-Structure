#include<bits/stdc++.h>
using namespace std;

//functtion to display array
void display(vector<int> &vec){

    for(auto i : vec){
        cout << i << " ";
    }
}

//function for insertion sort
void insertionSort(vector<int> &vec){
   for(int i = 1;i<vec.size();i++){
    int check_element = vec[i];
    int j = i-1;
    while (j>=0 && vec[j]>check_element)
    {
        vec[j+1] = vec[j];
        j--;
    }
    vec[j+1] = check_element;
    
   }
   
   display(vec);

}

//function for selection sort

void selectionSort(vector<int> &vec){
    for (int i = 0; i < vec.size(); i++)
    {
        int min = vec[i];
        for (int j = i+1; j < vec.size(); j++)
        {
            if(min>vec[j]){
                swap(vec[j],min);
            }
        }
        vec[i] = min;

        
    }
    display(vec);
    
}


int main(){
   
   int size;
   cin >> size;
   vector<int> vec;

   while (size--)
   {
      int x;
      cin >> x;
      vec.push_back(x);
   }

   selectionSort(vec);
   

}
