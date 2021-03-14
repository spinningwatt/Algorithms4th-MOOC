# 1.3 Bags, Queues and Stacks 包，队列，栈

---

## Pushdown Stacks 栈

栈是一个线性的数据解构，包含了两种操作：

1. Push。把元素添加到原有的栈中
2. Pop。把最近一次添加的元素删除 (remove the most recently added item)

栈很像一个单边开口装网球的球筒，我们可以不停地从开口处往里面装新的元素，但取的时候也只能从这个口取，结果就是取的时候必然拿到最新放进去的元素。

**特点：**

+ Last-in-first-out （LIFO）先进后出

**应用：**

+ 软件中常用的undo功能逻辑就类似于栈，每次撤销回到的总是较近的一步操作。
+ 书中举的例子是浏览器的前进和后退，后退一次到达的是最近浏览过的一个页面。

**代码杂记：**

以下的pop()函数是第一次实现的代码，当时把pop操作完全和删除挂钩。在拿到需要pop的元素后，将数组中这个下标的位置置为null，然后返回待pop的元素。

注释行是书本中的写法，pop出的元素实际上并没有被显式地删除，只是把数组的最大下标向前移动。并不影响下次添加新的元素，新的元素会覆盖掉pop走的元素原有的位置。

~~两种思维目前并不能理解孰优孰劣~~，但书中的思路确实是比较自然的，表面效果和实际逻辑并不需要一一对应，背后逻辑尽量简洁明了地完成效果即可，此处需要达到的效果有两点：

1. 返回pop的元素
2. 对象的数组中不再可以**直接**访问到已被pop的元素

书中的写法已经可以达到既定的效果，无需其他复杂的考虑。

更：P137 Loitering中马上就提到了这个问题，我最开始的想法确实是更加严谨的，可能是受到了cpp的影响，对于指针问题的处理比较敏感。Java中的GC机制并不了解，但这种情况下不置null会导致被pop的元素继续存在，直到下次被重写。

```java
// FixedCapacityStackOfString.java
// Remove the most recently added string
String pop()
{
    String temp = stack[--number];
    stack[number] = null;
    return temp;
    // return stack[--number]
}
```





---

## Bags 包



---

## Queues 队列