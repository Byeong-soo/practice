import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class practice32 {

    /*
    * 신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

    각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
    신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
    한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
    k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
    유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
    *
    *
    * 제한사항
        2 ≤ id_list의 길이 ≤ 1,000
        1 ≤ id_list의 원소 길이 ≤ 10
        id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
        id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
        1 ≤ report의 길이 ≤ 200,000
        3 ≤ report의 원소 길이 ≤ 21
        report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
        예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
        id는 알파벳 소문자로만 이루어져 있습니다.
        이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
        자기 자신을 신고하는 경우는 없습니다.
        1 ≤ k ≤ 200, k는 자연수입니다.
        return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.
*
* */

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int[] report_count = {};

        answer = new int[id_list.length];
        report_count = new int[id_list.length];


        ArrayList<String> list = new ArrayList<>();

        for (String s : report) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        for (String s : list) {
            String[] member = s.split(" ");
            int num = Arrays.asList(id_list).indexOf(member[1]);
            report_count[num] += 1;
        }

        for (int i=0; i< report_count.length; i++){

            if(report_count[i]>=k){
                String n = Arrays.asList(id_list).get(i);

                for (String s : list) {
                    String[] member = s.split(" ");
                    if (n.equals(member[1])) {
                        int num = Arrays.asList(id_list).indexOf(member[0]);
                        answer[num] += 1;
                    }
                }
            }
        }

        return answer;
    }


    public static int[] solution2(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Arrays.fill(answer,0);

        ArrayList<String> list = new ArrayList<>();

        //리포트에서 신고자와 신고받은사람 중복된거 빼고 리포트 만들기
        for (String s : report) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        HashMap<String,Integer> reporter = new HashMap<>();
        HashMap<String,Integer> reported = new HashMap<>();
        List<String> reportedStrings = new ArrayList<>();
        List<String> reporterStrings = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            // 리포트 들어온거 신고자와 신고받은사람으로 나누기
            String[] man = list.get(i).split(" ");

            reporterStrings.add(man[0]);

            // 신고자 해쉬맵에 추가
            if(!reporter.containsKey(man[0])){
                reporter.put(man[0],0);
            }

            // 리포트에서 신고받은사람이 해쉬맵에 없으면 추가
            if(!reported.containsKey(man[1])){
                reported.put(man[1],1);

            } else{
                // 이미 한번 신고받은사람이면 1회 추가
                reported.put(man[1],reported.get(man[1])+1);

                // 만약 신고횟수가 k번 이상이고, k번이상인게 처음이라면 제재자로 올리기기
                if(reported.get(man[1])>=k && !reportedStrings.contains(man[1])){
                    reportedStrings.add(man[1]);
                    System.out.println("man[1] = " + man[1]);
                }

            }


        }


        // 신고자 있으면 목록에서 반복문
        for(int j=0; j<reportedStrings.size(); j++){
            // 제재자 목록에서 신고자 뽑아내기
            for(int i=0; i< list.size(); i++){
                // 리포트 들어온거 신고자와 신고받은사람으로 나누기
                String[] man = list.get(i).split(" ");

                // 만약 제재자 리스트와 신고받은사람이 같다면 신고자 해쉬맵에 횟수 추가해주기기
                if(man[1].equals(reportedStrings.get(j))){
                    System.out.println("확인 = " + reporter.get(man[0]));
                    System.out.println("확인 = " + reporter.get(man[0])+1);

                    reporter.put(man[0],reporter.get(man[0])+1);
                }
            }
        }


        for(int i=0; i<reporterStrings.size();i++){
            String s_reporter = reporterStrings.get(i);
            if(reporter.containsKey(s_reporter)){
                int num = Arrays.asList(id_list).indexOf(s_reporter);
                answer[num] = reporter.get(s_reporter);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        solution2(id_list, report, 2 );
    }


}
