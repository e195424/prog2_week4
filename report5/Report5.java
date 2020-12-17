package report5;

class getMessage{
    public getMessage(){
        System.out.println("error"+" "+"NullPointerException");
        
    }
}
class Report5{
    public static void main(String[] args){
            String str=null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            getMessage gM = new getMessage();
            e.getMessage();
        }
    }
}
