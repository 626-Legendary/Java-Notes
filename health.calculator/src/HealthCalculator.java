import java.util.Scanner;

/**
 * 健康计算器 - 计算 BMI（身体质量指数）和 BMR（基础代谢率）
 * 支持用户输入身高、体重、性别和年龄，并输出评估结果。
 */
public class HealthCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 创建 Scanner 对象获取用户输入

        // 获取身高（单位：厘米）
        System.out.print("请输入您的身高（cm）：");
        double height = sc.nextDouble();

        // 获取体重（单位：千克）
        System.out.print("请输入您的体重（kg）：");
        double weight = sc.nextDouble();

        // 获取性别（M 或 F）
        System.out.print("请输入您的性别（M/F）：");
        char gender = sc.next().charAt(0);  // 只读取第一个字符

        // 获取年龄
        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();

        // 调用计算方法并输出结果
        String result = calculate(height, weight, gender, age);
        System.out.println("\n===== 评估结果 =====");
        System.out.println(result);

        sc.close(); // 关闭输入流（推荐做法）
    }

    /**
     * 计算 BMI 和 BMR 并返回评估信息
     * @param heightCm 身高（厘米）
     * @param weightKg 体重（千克）
     * @param gender 性别（M/F）
     * @param age 年龄（岁）
     * @return 包含 BMI、分类 和 BMR 的字符串
     */
    public static String calculate(double heightCm, double weightKg, char gender, int age) {
        // 身高转换为米用于 BMI 计算
        double heightM = heightCm / 100.0;

        // BMI 计算公式
        double bmi = weightKg / (heightM * heightM);

        // 性别转换为大写（忽略大小写输入）
        gender = Character.toUpperCase(gender);

        // BMR 计算公式（Mifflin-St Jeor）
        double bmr;
        if (gender == 'M') {
            bmr = 10 * weightKg + 6.25 * heightCm - 5 * age + 5;
        } else {
            bmr = 10 * weightKg + 6.25 * heightCm - 5 * age - 161;
        }

        // BMI 分类（根据中国成人标准）
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "体重过轻";
        } else if (bmi < 24) {
            bmiCategory = "正常";
        } else if (bmi < 28) {
            bmiCategory = "超重";
        } else {
            bmiCategory = "肥胖";
        }

        // 返回格式化结果（保留两位小数）
        String result = String.format(
                "您的 BMI 为：%.2f（%s）\n您的 BMR 为：%.2f 千卡/天",
                bmi, bmiCategory, bmr
        );

        return result;
    }
}
