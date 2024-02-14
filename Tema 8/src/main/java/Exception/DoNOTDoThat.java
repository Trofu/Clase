package Exception;

public class DoNOTDoThat {
    public static void main(String[] args) {
        int[] vector = {0,2,4,6,8};
//MUY MUY MAL
        try{
            int i=0;
            do{
                System.out.println(vector[i++]);
            } while(i<= vector.length);
        } catch (Exception e){
            e.printStackTrace();
        }
//MUY MUY MAL
    }
}
