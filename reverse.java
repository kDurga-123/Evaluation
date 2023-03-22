class Main{
    public static void main(String[] args){
        String str="madam";
        String str1="madam";
        String bag="";
        for(int i=str.length()-1;i>=0;i--){
            bag=bag+str.charAt(i);
        }
        if(bag.equals(str1)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

