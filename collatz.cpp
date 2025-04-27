//This program will Halt if no counterexample for the given conjecture is found. It will run forever if there is a counterexample

#include <cstdio>
int main(){
    for(unsigned long int i = 1; i <= 1000000; i++){
        unsigned long int testing = i;
        while(testing != 1){
        if(testing%2 == 0)    testing =/2; 
        else                  testing = (testing*3) + 1;
    }
printf("No counterexample found until n = 1.000.000");
return 0;
}

