package level_1;

import java.util.HashSet;

public class Practice42 {

    /*
     주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
     nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
    nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

    * */

    public static int solution(int[] nums) {
        int answer = -1;
        int n = nums.length;
        boolean[] visited = new boolean[n];
        HashSet<Integer> sumList = new HashSet<>();

        comb(nums, visited, 0, n, 3, sumList);

        for(Integer s : sumList){
            if(s%2==0)continue;

            for(int i = 3; i<s; i++){
                if(s%i == 0)break;
                answer++;
            }

        }

        return answer;
    }

    static void comb(int[] arr, boolean[] visited, int depth, int n, int r, HashSet<Integer> sumList) {

        if (r == 0) {
           sumList(arr, visited, n,sumList);
            return;
        }

        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1,sumList);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r,sumList);

    }


    // 배열 출력
    static void sumList(int[] arr, boolean[] visited, int n, HashSet<Integer> sumList) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                sum += arr[i];
            }
        }
        sumList.add(sum);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int num = solution(nums);
        System.out.println("num = " + num);
    }


}
