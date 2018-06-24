class SgSample{
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

class SampleMain{
    public static void main(String[] args) {
        SgSample s = new SgSample();
        s.setMessage("Hello");
        System.out.println(s.getMessage());
    }
}