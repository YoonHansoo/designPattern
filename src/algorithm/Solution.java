package algorithm;

public class Solution {
	int[] valueList;
	public int solution(int[] A) {
		valueList = A;
		int result = 0;
		int temp_result;
		
		//배열의 길이만큼 반복되는 횟수를 구함
		for (int i = 0; i < A.length; i++) {
			temp_result = calculationCnt(A[i], i, 0);
			if (temp_result > result) { //길이가 가장 긴 것만 저장해서  리턴
				result = temp_result;
			}
		}
		return result;
	} 
	// 재귀함수로 자신이 처음 설정한 값이 나올 때 리턴해서  호출할 때마다 cnt 값을 증가시켜 길이를 구함
	int calculationCnt(int start, int key, int cnt) {
		int value = valueList[key];
			if ( cnt != 0 && value == start) {
				return cnt;
			}
		cnt += 1;
		return calculationCnt(start, value, cnt);
	}
}
