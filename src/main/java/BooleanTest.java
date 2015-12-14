/**
 * Created by Administrator on 2015/12/10.
 */
public class BooleanTest {
    public static void change(Boolean[] a){
        a[0] = true;
    }
    public static void main(String[] args){
        Boolean[] a = new Boolean[]{false};
        change(a);
        System.out.println(a[0]);
    }
}
