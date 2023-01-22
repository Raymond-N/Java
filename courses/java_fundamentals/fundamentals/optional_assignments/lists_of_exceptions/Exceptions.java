import java.util.ArrayList;

class Exceptions {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("goodbye world");

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
            } catch(ClassCastException e) {
                System.out.println(e);
            }
        }
    }
}