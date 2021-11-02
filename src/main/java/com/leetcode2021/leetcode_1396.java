package com.leetcode2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class leetcode_1396 {
    Map<Integer, Map<String, Integer>> inMap = new HashMap<>();

    Map<String, List<Double>> outMap = new HashMap<>();

    public leetcode_1396() {

    }

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> userStationInfo = new HashMap();
        userStationInfo.put(stationName, t);
        inMap.put(id, userStationInfo);
    }

    public void checkOut(int id, String stationName, int t) {
        if (null == inMap.get(id)) {
            return;
        }
        Map<String, Integer> userStationInfo = inMap.get(id);
        String stationKey = "";
        double inTime = 0;
        for (String key : userStationInfo.keySet()) {
            stationKey = stationName + "-" + key;
            inTime = userStationInfo.get(key);
        }
        List<Double> timeSum = outMap.getOrDefault(stationKey, new ArrayList<Double>());
        timeSum.add((double) (t - inTime));
        outMap.put(stationKey, timeSum);
        inMap.remove(id);

    }

    public double getAverageTime(String startStation, String endStation) {
        List<Double> timeSumList = outMap.get(endStation + "-" + startStation);
        int size = timeSumList.size();
        double countTime = 0;
        for (double b : timeSumList) {
            countTime += b;
        }
        return (double) (countTime / size);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.stream().mapToDouble(Integer::valueOf).sum();
        System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
    }
}
