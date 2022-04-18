# 10. 특정 범위의 숫자 나열되어 있을 때 각 숫자의 개수를 세어봅시다.

## 문제 정의

M 이상 N 이하의 수가 나열되어 순서에 상관없이 나열되어 있다고 할 때 각 수가 몇개인지 세어보는 방법을 구현해봅시다. 
가령 20세부터 100세 이하의 사람들이 어느 한 장소에 머물고 있다고 할때 연령대에따라 혹은 각 나이에 따른 인원을 체크해볼 수 있습니다. 

## 문제 해결
이런 문제의 경우 해결하려는 범위 내에서 counting에 필요한 변수의 개수를 생각해 볼 수 있습니다. 연령대에 따른 경우라면 20대, 30대... 100세 까지 셀 수 있는 변수를 선언해서 증가할 수 있습니다.
그렇지 않고 각 나이마다 counting을 하기 위해서는 그 개수만큼의 변수보다는 배열을 선언하여 개수를 세는 것이 합리적인 방법입니다.
수행에 걸리는 시간은 데이터의 개수가 n개라고 할 때, O(n)입니다.


```
public class Counting {

	public static void main(String[] args) {

		int[] people = { 55, 40, 27, 99, 76, 81, 29, 31,33, 62}; 
		int[] ages = new int[10]; //연령대에 따른 수 세기
		

		for(int i = 0; i<people.length; i++) {
			int age = people[i];
			if(age <30) ages[0]++;
			else if(age < 40) ages[1]++;
			else if(age < 50) ages[2]++;
			else if(age < 60) ages[3]++;
			else if(age < 70) ages[4]++;
			else if(age < 80) ages[5]++;
			else if(age < 90) ages[6]++;
			else if(age <= 100) ages[7]++;
		}
		int number = people.length;
		System.out.println( number + "명 중 20대는 " + ages[0]+ "명 입니다.");
		System.out.println( number + "명 중 30대는 " + ages[1]+ "명 입니다.");
		System.out.println( number + "명 중 40대는 " + ages[2]+ "명 입니다.");
		System.out.println( number + "명 중 50대는 " + ages[3]+ "명 입니다.");
		System.out.println( number + "명 중 60대는 " + ages[4]+ "명 입니다.");
		System.out.println( number + "명 중 70대는 " + ages[5]+ "명 입니다.");
		System.out.println( number + "명 중 80대는 " + ages[6]+ "명 입니다.");
		System.out.println( number + "명 중 90대는 " + ages[7]+ "명 입니다.");
		
		
	}

}
```
