# softwore_project
# 软件工程作业
### 1.全部用命令行工具和notepad编辑器，不用Eclipse 等集成编辑环境，每人手工创建并编译一个Java的命令行程序：“Hello World”。
### 2.练习数值计算。找出一个整数数组中子数组之和的最大值，例如：数组[1, -2, 3, 5, -1]，返回8（因为符合要求的子数组是 [3, 5]）；数组[1, -2, 3, -8, 5, 1]，返回6（因为符合要求的子数组是 [5, 1]）; 数组[1, -2, 3,-2, 5, 1]，返回7（因为符合要求的子数组是 [3, -2, 5, 1]）。
### 3.写一个命令行程序， 输入1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？ 
### 4.使用工具Eclipse，创建一个Java GUI程序，在主窗口中显示“Hello World”，用户可以用鼠标拖动“Hello World”在主窗口中移动。

## 软件工程个人项目
### 第0步：输出某个英文文本文件中 26 字母出现的频率，由高到低排列，并显示字母出现的百分比，精确到小数点后面两位。
### 第一步：输出单个文件中的前 N 个最常出现的英语单词。
####  功能1：wf.exe -f <file>  输出文件中所有不重复的单词，按照出现次数由多到少排列，出现次数同样多的，以字典序排列。
####  功能2：wf.exe -d <directory>  指定文件目录，对目录下每一个文件执行  wf.exe -f <file> 的操作。
####  功能3：支持 -n 参数，输出出现次数最多的前 n 个单词，  例如，  -n 10 就是输出最常出现单词的前 10 名。 当没有指明数量的时候，我们默认列出所有单词的频率。

### 第二步:  支持 stop words
#### 功能 4：支持新的命令行参数, 例如：   wf.exe -x <stopwordfile>  -f <file> 
  
### 第三步:  我们想看看常用的短语是什么， 怎么办呢？
#### 功能 5：支持新的命令行参数  -p <number> 
  
### 第四步：把动词形态都统一之后再计数。
  
### 功能 6：支持动词形态的归一化，参数为 -v wf.exe -v <verb file>  其中 <verb file> 是纪录动词形态的文本文件。 
 
