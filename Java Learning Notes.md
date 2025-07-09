# 一级标题
## 二级标题
### 三级标题
#### 四级标题

**粗体**
*斜体*
~~删除线~~

---

## IDEA
project 工程
module 模块
package 包 (com.itheima.hello) 
class

### AI 编程插件
Settings - Plugins -
TONGYI Lingma

### 常用快捷键
main / psvm sout
Ctrl + D	复制当前行数据到下一行
Ctrl + Y	删除所在行
Ctrl + Alt + L	格式化代码
Alt + Shift + ↑	上下移动当前代码

---

## 基础语法

### 功能单元
Java开发的软件，功能的最小单元：方法 
注释
	单行注释： `//`
	多行注释：`/* */`
	文档注释：

### 字面量 literal
1. 整数型 字面量
2. 浮点型 字面量
3. 布尔型 字面量
4. 字符型字面量 （用单引号包裹，里面有且仅有一个字符）
	a. `println('a');` √
	b. `println('我');` √
	c. `println('我们');` × 报错
	d. `println('');` × 报错
	e. `println(' ');` √
\n换行 \t缩进
5. 字符串字面量，用双引号包裹，里面可以有**任意**字符

### 变量 variable
**定义格式**
数据类型 变量名称 = 数据;
int age = 18;

### 数据类型
####  一、基本数据类型（Primitive Types）共 8 个

1. **byte**
   * 占用：1 字节
   * 范围：-128 \~ 127
   * 示例：`byte b = 100;`
2. **short**
   * 占用：2 字节
   * 范围：-32,768 \~ 32,767
   * 示例：`short s = 30000;`
3. **int**
   * 占用：4 字节（最常用的整数类型）
   * 范围：约 -21亿 \~ 21亿
   * 示例：`int x = 123456;`
4. **long**
   * 占用：8 字节
   * 用于更大的整数
   * 示例：`long l = 1234567890L;`（注意要加 `L`）
5. **float**
   * 占用：4 字节
   * 表示小数，精度有限
   * 示例：`float f = 3.14f;`（注意要加 `f`）
6. **double**
   * 占用：8 字节
   * 默认的小数类型，精度高
   * 示例：`double d = 3.1415926;`
7. **char**
   * 占用：2 字节
   * 表示单个字符（Unicode）
   * 示例：`char c = 'A';`
8. **boolean**
   * 占用：约 1 字节（实际实现依赖于 JVM）
   * 表示逻辑值：`true` 或 `false`
   * 示例：`boolean flag = true;`

#### 二、引用数据类型（Reference Types）

* **String**
  * 用于字符串，例如：`String name = "Trevor";`
* **数组（Array）**
  * 一组同类型数据：`int[] arr = {1, 2, 3};`
* **类（Class）**
  * 对象的实例
* **接口（Interface）**
  * 如：`Runnable r = new MyRunnable();`
* **枚举（Enum）**
  * 特定取值集合，例如：
* **null 值**
  * 所有引用类型可以为 `null`，但基本类型不能。

字节B 
比特位b

1B = 8bit

### 进制
- 0B开头	二进制 97: 01100001 
- 0开头	八进制 三个二进制一组 01 100 001 -> 141
- 0X开头	十六进制 四个二进制一组 0110 0001 -> 61

### 关键字和标识符
- class
- public
- static
- void
- if \ else \ while \ for
- true \ false

标识符：驼峰模式

### 方法 Method
**特定任务**或**操作**的**代码块**

修饰符 返回值类型 方法名（形参列表）{
	方法体代码（**需要执行的功能代码**）
	return 返回值;
}

调用：**方法名（数据）**

1. 方法是否需要接收数据？
2. 方法是否需要返回数据？

- **void** 无返回值声明

### 方法重载 Overloading
一个类中，出现多个方法的名称相同，但是他们的形参列表是不同的，那么这些方法就称为方法重载。

### 类型转换
- **自动类型转换**
	类型范围小的变量，可以直接赋值给类型范围大的变量。
	byte -> short -> int -> long -> float -> double
	
- **强制类型转换**
	类型范围大的变量，不可以直接赋值给类型范围小的变量。
	会报错，需要强制类型转换。
	类型 变量 = (类型)变量；
	
- **表达式的自动类型提升**
	在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算。
	
### 输入&输出
 - **输入**
	通过Java提供的Scanner程序来实现
	`Scanner sc = new Scanner(System.in);`
 - **输出**
	`System.out.println("Hello World!");`

### 运算符
- 基本运算符
	`+ - * / %（取余）`
	`自增：++ `
	`自减： --`
- 赋值运算符
	`= += -= *= /= %=`
	`? :` 三元运算符
- 逻辑运算符
	`与 &`
	`或 |`
	`非 ！`
	`逻辑异或 ^ 前后条件结果相同，就直接返回false，前后条件结果不同，才返回true`

## 程序流程控制
- **顺序结构**
	自上而下的执行程序
- **分支结构**
	if \ switch

### if 分支结构
```java
// 单分支 if
if (condition) {
    // 条件为 true 时执行
    code;
}

// 双分支 if-else
if (condition) {
    // 条件为 true 时执行
    code;
} else {
    // 条件为 false 时执行
    code;
}

// 多分支 if-else if-else
if (condition1) {
    code;
} else if (condition2) {
    code;
} else if (condition3) {
    code;
} else {
    // 以上条件都不满足时执行
    code;
}
```

### switch 分支结构
```java
int day = 1;

switch (day) {
    case 1:
        System.out.println("星期一");
        break;
    case 2:
        System.out.println("星期二");
        break;
    case 3:
        System.out.println("星期三");
        break;
    case 4:
        System.out.println("星期四");
        break;
    case 5:
        System.out.println("星期五");
        break;
    case 6:
    case 7:
        System.out.println("周末");
        break;
    default:
        System.out.println("无效的输入");
}
```

> 🔹 `break` 表示跳出 `switch` 语句块，防止继续执行下面的 case  
> 🔹 `default` 表示不匹配任何 `case` 时的处理逻辑（可选）  
> 🔹 支持多个 `case` 合并处理，如上方的 `case 6` 和 `case 7`

- **循环结构**
	while \ for \ do while

### for 循环
```java
// 标准 for 循环语法结构：
for (初始化语句; 循环条件; 迭代语句) {
    // 循环体（每次执行的代码）
}

// 示例：输出 3 次 HelloWorld
for (int i = 0; i < 3; i++) {
    System.out.println("HelloWorld");
}
```

### while 循环
```java
// while 循环先判断条件，再执行循环体
while (循环条件) {
    // 循环体
}

// 示例：输出 3 次 HelloWorld
int i = 0;
while (i < 3) {
    System.out.println("HelloWorld");
    i++;
}
```

### do...while 循环

```java
// do...while 先执行一次，再判断条件
do {
    // 循环体
} while (循环条件);

// 示例：输出 3 次 HelloWorld
int i = 0;
do {
    System.out.println("HelloWorld");
    i++;
} while (i < 3);
```

> ✅ 区别总结：
> - `for`：常用于已知循环次数
> - `while`：先判断后执行
> - `do...while`：至少执行一次

## 数组（Array）
- 静态初始化数组：定义数组的时候，数据就已经确定好了。
1. `String [ ] name = {"Alex","Bob"};`
2. `String [ ] name = new String [ ] {"Alex","Bob"};`

**访问数组** 
数组名[索引] 
name[0] \ name [1]

数组名表示第一个元素的**地址**

- 动态初始化数组
1. `String [ ] name = new String [10];`
数据类型 [ ] 数组名 = new 数据类型 [长度]

**动态初始化数组默认值**
byte - short - char - int - long : 0
float - double: 0.0
boolean: false
类 接口 数组 String: null

