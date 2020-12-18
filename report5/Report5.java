class Message{
    String message;
    public String getMessage(){
        message="errorOFNullPointerException";
        return this.message;
        
    }
}
class Report5{
    public static void main(String[] args){
            String str=null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            Message msa = new Message();
            System.out.println(msa.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
