package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        return (getEarnedMarks() * 100) / getPossibleMarks() > 90 ? "A": (getEarnedMarks() * 100) / getPossibleMarks()  > 80 ?  "B" : (getEarnedMarks() * 100) / getPossibleMarks() > 70 ? "C": (getEarnedMarks() * 100) / getPossibleMarks() > 60 ? "D" : "F";



    }
}