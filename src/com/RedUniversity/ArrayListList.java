package com.RedUniversity;

public class ArrayListList<Student>extends University {
    private String name;
    private int matriculationNumber;
    private int yearOfBirth;

    public ArrayListList(String name, String address, Object students, Object staffs) {
        super(name, address, students, staffs);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void registerCourse(){
        System.out.println();
    }
}
