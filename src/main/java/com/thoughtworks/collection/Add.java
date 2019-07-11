package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int max=Math.max(leftBorder,rightBorder);
        int min=Math.min(leftBorder,rightBorder);
        int sum=IntStream.rangeClosed(min,max).filter((num)->{
            return num%2==0;
        }).sum();
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int max=Math.max(leftBorder,rightBorder);
        int min=Math.min(leftBorder,rightBorder);
        int sum=IntStream.rangeClosed(min,max).filter((num)->{
            return num%2!=0;
        }).sum();
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum=sum+(arrayList.get(i)*3+2);
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
