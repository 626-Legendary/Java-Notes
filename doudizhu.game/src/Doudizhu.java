public class Doudizhu {
    public static void main(String[] args){
        // 启动程序，从 start 方法开始执行
        start();
    }

    public static void start(){
        // 创建一个长度为 54 的字符串数组，用于存储整副扑克牌
        String[] poker = new String[54]; // poker = [null, null, ..., null]

        // 定义一个索引变量，用于往数组中依次放入牌
        int index = 0;

        // 定义扑克牌的花色
        String[] colors = {"♠","♥","♣","♦"};

        // 定义扑克牌的点数（顺序按照斗地主大小规则）
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        // 嵌套循环，组合花色和点数，生成 52 张牌
        for (int n = 0; n < numbers.length; n++) {
            for (int c = 0; c < colors.length; c++) {
                String data = colors[c] + numbers[n]; // 例：♠3
                poker[index] = data; // 将牌放入数组
                index++;
            }
        }

        // 添加大小王
        poker[index] = "Black Joker";     // 小王
        poker[index + 1] = "Red Joker";   // 大王

        // 打印生成的原始牌组
        System.out.println("原始牌组：");
        int card1 = 0;
        while (card1 < poker.length) {
            System.out.print(poker[card1] + " ");
            card1++;
        }

        System.out.println(); // 换行分隔

        // 洗牌逻辑（随机交换两个下标对应的牌，重复 54 次）
        for (int w = 0; w < poker.length; w++) {
            int r1 = (int) (Math.random() * 54); // 随机生成 0~53 的下标
            int r2 = (int) (Math.random() * 54);
            // 交换牌的位置
            String temp = poker[r1];
            poker[r1] = poker[r2];
            poker[r2] = temp;
        }

        // 打印洗牌后的牌组
        System.out.println("洗牌后牌组：");
        int card2 = 0;
        while (card2 < poker.length) {
            System.out.print(poker[card2] + " ");
            card2++;
        }
    }
}
