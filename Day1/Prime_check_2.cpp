#include <iostream>
using namespace std;

int main() {
	int n;
  cin>>n;
	bool isPrime = true;
	if(n == 0 || n == 1){
		isPrime = false;
	}
	
	for(int i=2; i<=n/2; ++i){
		if(n%i == 0){
			isPrime = false;
		}
	}
	if(isPrime){
		cout<<"Prime";
	}
	else{
		cout<<"Not Prime";
	}
	
	return 0;
}
