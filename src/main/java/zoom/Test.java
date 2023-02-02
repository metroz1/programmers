package zoom;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();

//        System.out.println(test.solution(6));

//        int[][] data = {{1, 0, 5}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}};
//
//        for (int num : test.solution(data)) {
//            System.out.println(num);
//        }

        int[] histogram = {6, 5, 7, 3, 4, 2};

        System.out.println(test.solution(histogram));

    }

    public long solution(long n) {

        long answer = 0;


        for (int i = (int) n + 1; i / n <= n; i++) {

            if (i / n == i % n)
                answer += i;
        }

        return answer;
    }

    public int[] solution(int[][] data) {

        int[] answer = new int[data.length];
        answer[0] = 1;
        int time = data[0][2];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        List<Integer> requestTimeList = new ArrayList<>();

        for (int i = 2; i <= data.length; i++) {

            requestTimeList.add(data[i - 1][1]);
            treeMap.put(i, data[i - 1][2]);
        }

        List<Map.Entry<Integer, Integer>> keyList = new LinkedList<>(treeMap.entrySet());

        keyList.sort(Map.Entry.comparingByValue());

        for (int i = 1; i < data.length; i++) {

            if (time < requestTimeList.get(treeMap.firstKey() - 2)) {
                answer[i] = treeMap.firstKey();
                time += treeMap.get(treeMap.firstKey());

                for (int j = 0; j < keyList.size(); j++) {
                    if (keyList.get(j).getKey() == treeMap.firstKey())
                        keyList.remove(j);
                }

                treeMap.remove(treeMap.firstKey());
            }
            else {
                answer[i] = keyList.get(0).getKey();
                time += treeMap.get(keyList.get(0).getKey());
                treeMap.remove(keyList.get(0).getKey());
                keyList.remove(0);
            }

        }

        return answer;
    }

    public int solution(int[] histogram) {

        int[] width = new int[10001];
        width[0] = 0;
        Map<Integer, Integer> histogramMap = new HashMap<>();

        for (int i = 0; i < histogram.length; i++) {
            histogramMap.put(i, histogram[i]);
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i <= 10000; i++) {


            if (histogramMap.containsValue(i)) {

                for (int j = 0; j < histogram.length; j++) {

                    if (histogram[j] >= i) {
                        minIndex = j;
                        break;
                    }
                }

                for (int j = histogram.length - 1; j >= 0; j--) {

                    if (histogram[j] >= i) {
                        maxIndex = j;
                        break;
                    }
                }

                width[i] = (maxIndex - minIndex - 1) * i;
                System.out.println(i + " " + width[i]);
                System.out.println("max : " + maxIndex + " min : " + minIndex);

            }
        }

        return Arrays.stream(width).max().getAsInt();
    }
}
