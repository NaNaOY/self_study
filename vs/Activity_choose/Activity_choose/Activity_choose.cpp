
/*
 * 活动选择问题：
 *
 * 调度竞争共享资源的多个活动的问题，目标是选出一个最大的互相兼容的活动集合。假定有一个n个活动的集合S={a1,a2,a3...,an}，
 * 这些活动使用同一个资源（例如同一个阶梯教室），而这个资源在某个时刻只能供一个活动使用。每个互动ai都有一个开始时间s和一个结束时间fi，
 * 其中)<=si<fi<无穷。如果被选中，任务ai发生在半开时间区[si,fi)期间。如果两个活动ai和aj满足[si,fi)和[sj,fj)不重叠，则称它们是兼容的。
 * 也就是说，若si>=fj，或sj>=fi，则ai和j是兼容的。在活动选择问题中，我们希望选出一个最大兼容活动集。假定活动已按照结束时间的单调递增
 * 排序
 *
 * 原本的思路：按照动态规划的方法来求，先求子问题：将Sij的一个最大兼容活动集合设为Aij，于是Aij至少包含一个活动ak，则：
 * 可以将Aij划分为子问题：Aij=Aik+ak+Akj
 *
 * 但是我们一开始不能知道哪一个k能够使得ak一定在最大兼容活动集Aij中，于是一般的需要从i~j便利所有的k的可能取值，来找这个ak。
 *
 * 上面是动态规划的思路；但是对于贪心算法而言，这里ak不去 遍历，而只是去寻找第一个结束的活动，也就是a1。这里可以证明，a1一定是在
 * Sij的某一个最大兼容活动集Aij中。证明方法：
 *
 * 假设Aij是Sij的某个最大兼容活动集，假设Aij中，最早结束的活动是an，分两种情况：
 *
 * ①如果an=a1，则得证
 * ②如果an不等于a1，则an的结束时间一定会晚于a1的结束时间，我们用a1去替换Aij中的an，于是得到A`，由于a1比an结束的早，而Aij中的其他活动
 * 都比an的结束时间开始 的要晚，所以A`中的其他活动 都与a1不想交，所以A`中的所有活动是兼容的，所以A`也是Sij的一个最大兼容活动集。
 *
 * 得证
 *
 * 于是我们下面使用贪心算法来做，分别用递归和迭代两个版本。
 *
 */

#include <iostream>
#include <vector>

using namespace std;

void swap(int* a, int* b) {
	int tmp = *a;
	*a = *b;
	*b = tmp;
}

int Adjust_Arr(int* a, int* b, int start, int end) {

	int p = start;
	int q = end;
	int i = p - 1;
	int j = p;

	int key = a[q];

	while (j < q) {
		if (a[j] >= key) {
			j++;
			continue;
		}
		else {
			i++;
			swap(a + i, a + j);
			swap(b + i, b + j);
			j++;
		}
	}

	i++;
	swap(a + i, a + q);
	swap(b + i, b + q);
	return i;
}

void Quick_Sort(int* a, int* b, int start, int end) {
	if (start < end) {
		int mid = Adjust_Arr(a, b, start, end);
		Quick_Sort(a, b, start, mid - 1);
		Quick_Sort(a, b, mid + 1, end);
	}
}

void Print_Arr(int* a, int len) {
	for (int i = 0; i < len; i++) {
		cout << a[i] << ' ';
	}
	cout << endl;
}

/*
 * 递归版本
 */
void Recursive_Activity_Selector(vector<int>* A, int* s, int* f, int k, int n) {

	int m = k + 1;
	while (m <= n && s[m] < f[k]) {
		m++;
	}

	if (m <= n) {
		A->push_back(m);
		Recursive_Activity_Selector(A, s, f, m, n);
	}
}

/*
 * 迭代版本
 */
vector<int>* Greedy_Activity_Selector(int* s, int* f, int n) {
	vector<int>* A = new vector<int>;

	int k = 1;
	A->push_back(k);

	for (int m = 2; m <= n; m++) {
		if (s[m] >= f[k]) {
			A->push_back(m);
			k = m;
		}
	}

	return A;
}

int main() {

	int s[12] = { 0, 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12 };

	int f[12] = { 0, 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16 };

	//先将f按从小到大排序，s的位置随f而动
	Quick_Sort(f, s, 0, 12 - 1);

	//	vector<int>* A = new vector<int>;
	//	Recursive_Activity_Selector(A, s, f, 0, 12 - 1); //这里实际上下标只能取到11

	vector<int>* A = Greedy_Activity_Selector(s, f, 12 - 1);

	cout << "===========" << endl;
	vector<int>::iterator iter;

	for (iter = A->begin(); iter != A->end(); iter++) {
		cout << *iter << ' ';
	}
	cout << endl << "===========" << endl;

	delete A;

	return 0;
}
