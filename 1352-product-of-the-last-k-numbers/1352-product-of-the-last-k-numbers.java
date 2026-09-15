class ProductOfNumbers { 
    private List<Integer> arr ;       
    public ProductOfNumbers() {
     arr = new ArrayList<>();
    }
    public void add(int num) {
     arr.add(num);  
    }
    
    public int getProduct(int k) {
        int product =1 ; 
        int len = arr.size();
        for(int i = len - k ; i < len  ; i++){
            product = product * arr.get(i) ;
        }
        return product ; 
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */