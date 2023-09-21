package org.example;

import java.util.Arrays;

public class WalkInThePark {

    public int[] solution(String[] park, String[] routes) {

        for (int i = 0; i < park.length; i++) {

            for (int j = 0; j < park[i].length(); j++) {

                if (park[i].charAt(j) == 'S') {

                    for (int k = 0; k < routes.length; k++) {

                        int distance = Integer.parseInt(routes[k].split(" ")[1]);

                        switch (routes[k].split(" ")[0]) {
                            case "E":
                                if (j + distance < park[i].length())    {

                                    for (int l = 1; l <= distance; l++) {

                                        if (park[i].charAt(j + l) == 'X')
                                            break;

                                        if (l == distance)
                                            j = j + distance;
                                    }
                                }
                                break;


                            case "W":
                                if (j - distance >= 0)    {

                                    for (int l = 1; l <= distance; l++) {

                                        if (park[i].charAt(j - l) == 'X')
                                            break;

                                        if (l == distance)
                                            j = j - distance;
                                    }
                                }
                                break;

                            case "S":
                                if (i + distance < park.length)    {

                                    for (int l = 1; l <= distance; l++) {

                                        if (park[i + l].charAt(j) == 'X') {
                                            break;
                                        }
                                        else if (l == distance)
                                            i = i + distance;
                                    }
                                }
                                break;


                            case "N":
                                if (i - distance >= 0)    {

                                    for (int l = 1; l <= distance; l++) {

                                        if (park[i - l].charAt(j) == 'X')
                                            break;

                                        if (l == distance)
                                            i = i - distance;
                                    }
                                }
                                break;
                        }
                    }

                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
