package demo01.Map;

public class Demo01exception {


    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("11111");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }finally {
            System.out.println(" code  end");
        }

    }

}