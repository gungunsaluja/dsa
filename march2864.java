#Maximum Odd Binary Number
  class solution{
  //010==001, 0101==1001
  //we can make any number odd by seting its last bit as one
  // so here we will use two pointer approach we will take a left and rigth pointer 
  // initially left pointer will point to the starting of index and right will point to the last element of array
  //then if we found '1' on left side and '0' on right side we will move left++ and rigth --
  //but at any instace when we found that left<rigth arr[left] = 0 and arr[rigth]=1 we will swap them
  //loop will terminate when !(left<=right)
  // then at end we will set arr[left-1] = 0; and arr[arr.length-1] = 1 to make the number odd
  public  String maximumOddBinaryNumber(String s){
    char[] arr = s.toCharArray();
    int left =0;
    int right = arr.length-1;
    while(left<=right){
      if(arr[left]=='1'){
        left++;}
      if(arr[right]=='0'){
        right--;
      }
      if(left<right && arr[left]=='0' && arr[right]=='1'){
        arr[left] ='1';
        arr[right]='0';
        
      }
    }
    arr[left-1] = '0';
    arr[arr.length-1] = '1';
    return new String(s);

    
  }
  }
