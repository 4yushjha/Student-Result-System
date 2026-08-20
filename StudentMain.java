class Student{
    private int rollNo;
    private String name;
    private double phyMarks;
    private double mathMarks;
    private double chemMarks;


    public Student(int rollNo, String name, double phyMarks, double mathMarks, double chemMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.phyMarks = phyMarks;
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
    }

    public double calculateTotalMarks(){
       return phyMarks+mathMarks+chemMarks;
    }

    public double calculatePercentage(){
        return (phyMarks+mathMarks+chemMarks)/3;
    }
    
    public void displayResult(){
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+rollNo);
        System.out.println("Total marks of "+name+" is: "+calculateTotalMarks());
        System.out.println("Percentage of "+name+" is: "+calculatePercentage());
        System.out.print("Result status: ");
        System.out.println((calculatePercentage() >= 33) ? "Pass" : "Fail");

        
    }

    
}

class StudentMain{
    public static void main(String[] args) {
        Student s1=new Student(49, "Ayush", 61, 97, 50);
        s1.displayResult();
    }
}