

import java.io.*;
import java.util.*;

class Solution {

    int peopleUnderMeIncMe(String manager, HashMap<String, ArrayList<String>> directReportie, TreeMap<String, Integer> ans) {
        if (directReportie.containsKey(manager) == false) { //if i am not manager to anyone means 
            ans.put(manager, 0);
            return 1; //i am one employee to my manager
        }

        int cnt = 0;
        for (String emp : directReportie.get(manager)) {
            cnt += peopleUnderMeIncMe(emp, directReportie, ans);
        }

        ans.put(manager, cnt);

        return cnt + 1; //i am reporting number of employees under me + myselft to my manager
    }

    public void EmpUnderManager(Map<String, String> emp) {
        HashMap<String, ArrayList<String>> directReportie = new HashMap<>();
        String ceo = "";

        /*
         * k, v
         * e, m
         * ====
         * A C
         * B C
         * C F
         * D E
         * E F
         * F F
         */

        /*
         * m, list
         * C -> {A, B}
         * F -> {C}
         */

        for (String employee : emp.keySet()) {
            String manager = emp.get(employee);

            if (manager.equals(employee)) {
                ceo = employee;
                continue;
            } else {
                // if (directReportie.containsKey(manager)) {
                // ArrayList<String> listOfPeople = directReportie.get(manager);
                // listOfPeople.add(employee);
                // directReportie.put(manager, listOfPeople);
                // } else {
                // ArrayList<String> listOfPeople = new ArrayList<>();
                // listOfPeople.add(employee);
                // directReportie.put(manager, listOfPeople);
                // }
 //if any people is there under me then i will employee to thier list or else i will create new list 
                ArrayList<String> listOfPeople = directReportie.getOrDefault(manager, new ArrayList<>());
                listOfPeople.add(employee);
                directReportie.put(manager, listOfPeople);
            }
        }

        TreeMap<String, Integer> ans = new TreeMap<>();
        peopleUnderMeIncMe(ceo, directReportie, ans);
        

        for (String key : ans.keySet()) {
            System.out.println(key + " " + ans.get(key));
        }
    }
}

public class EmpAndMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String, String> emp = new HashMap<String, String>();
        for (int i = 0; i < n; ++i) {
            emp.put(sc.next(), sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp);
    }
}