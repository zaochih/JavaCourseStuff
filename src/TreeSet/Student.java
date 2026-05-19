package TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double ChineseScore;
    private double MathScore;
    private double EnglishScore;

    public Student(String name, int age, double chineseScore, double mathScore, double englishScore) {
        this.name = name;
        this.age = age;
        ChineseScore = chineseScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
    }

    public Student() {
    }

    @Override
    public int compareTo (Student o) {
        double currentSum = this.ChineseScore + this.MathScore + this.EnglishScore;
        double objSum = o.ChineseScore +  o.MathScore + o.EnglishScore;

        int i = Double.compare(objSum, currentSum);

        i = (i == 0) ? Double.compare(o.ChineseScore, this.ChineseScore) : i;
        i = (i == 0) ? Double.compare(o.MathScore, this.MathScore) : i;
        i = (i == 0) ? Double.compare(o.EnglishScore, this.EnglishScore) : i;
        i = (i == 0) ? o.age - this.age : i;
        i = (i == 0) ? o.name.compareTo(this.name) : i;

        return i;
    }

    @Override
    public String toString() {
        return "Student [name: " + this.name
                + ", age:" + this.age
                + ", sum:" + (this.ChineseScore + this.MathScore + this.EnglishScore)
                + "]";
    }
}
