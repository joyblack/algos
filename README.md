# Getting Started
This is a learn item, about a book, that name is 'Algorithm Fourth Edition'.

## Book Chapter
### 1、基础
* 基础编程模型
* 数据抽象
* 背包、队列和栈
* 算法分析
* union-find算法

### 2、排序


## Reference Documentation
算法项目。包的解释。util是算法书籍配的一套方便编程的工具包。

```html
!StdIn.isEmpty() 使用ctrl+d跳出此循环。
```
## basic package
基本的算法。
1、NumberTheory（数论）
* 获取最大公约数： gcd
> 算法原理：计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。


## data package
数据结构。

1、FixedCapacityStackOfStrings: 只支持字符串类型的定容栈；

2、FixedCapacityStack： 定容栈的泛型实现；
* 支持动态改变大小；
* 支持迭代；

3、Stack: 使用链表实现的下压堆栈（FIFO）

4、Queue：使用链表实现的队列(FILO)

5、Bag: 使用链表实现背包

## algorithm package
1、union-find: 连通性问题算法
* UF: 连通算法的通用实现接口；
* quick-find: find函数进行优化的；
* quick-union: union函数进行优化；
* Weighted-quick-union: 甲醛quick-union算法；


