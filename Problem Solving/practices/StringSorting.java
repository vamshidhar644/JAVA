package practices;

import java.util.*;

class Student{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getCgpa(){
        return cgpa;
    }
}
public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        List<Student> stList = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            
            Student st = new Student(id, name, cgpa);
            stList.add(st);
        }
        
        Collections.sort(stList, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if(s1.getCgpa()*100 != s2.getCgpa()*100){
                    return (int)((s2.getCgpa()*1000 - s1.getCgpa()*1000));
                }else if(!(s1.getName().equals(s2.getName()))){
                    return s1.getName().compareTo(s2.getName());
                }else{
                    return s1.getId() - s2.getId();
                }
            }
        });
        
        for(Student st : stList){
            System.out.println(st.getName());
        }
    }
}