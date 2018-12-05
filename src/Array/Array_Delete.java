package Array;

import java.util.Arrays;

public class Array_Delete {
    /**
     * 模拟数组删除
     * 注意:
     * java里，所有的类，不管是java库里面的类，或者是你自己创建的类，全部是从object这个类继承的
     * object里有一个方法就是toString()，那么所有的类创建的时候，都有一个toString的方法
     * object里有一个方法就是toString()，那么所有的类创建的时候，都有一个toString的方法
     * 而数组类中并没有对此方法重写(override)，仅仅是重载(overload)为类的静态方法（参见java.util.Arrays）。
     * 所以，数组直接使用toString()的结果也是[类型@哈希值]
     *
     *
     *          * 方法1：直接在构造String时转换(String str = new String(data);也是对char[]进行操作)
     *          * 方法2：调用String类的方法转换(String.valueOf(char[] ch))
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        int beforeArray[] = {1, 2, 3, 4};
        int afterArray[] = new int[beforeArray.length - 1];
        //待删除的元素的下标
        int dele = 3;
        for (int i = 0; i < afterArray.length; i++) {
            if (i < dele) {
                afterArray[i] = beforeArray[i];
            } else {
                afterArray[i] = beforeArray[i + 1];
            }
        }
        /**
         * Arrays:
         *
         */
        System.out.println(Arrays.toString(afterArray));
    }
}
