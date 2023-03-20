package Seminar5.Core;

import Seminar5.Infrasructure.Attestation.Schedule;
import Seminar5.Infrasructure.Attestation.Subjects;
import Seminar5.Infrasructure.Exception.ExceptionIssuingDiploma;
import Seminar5.Infrasructure.People.Student;
import Seminar5.Infrasructure.People.StudyGroup;
import Seminar5.Infrasructure.People.Teacher;

import java.io.*;
import java.util.ArrayList;

public class Presenter implements View {
    Model model;
    @Override
    public void viewData() {
        System.out.println("Студенты");
        for (Student s : this.model.getStudents()) {
            System.out.printf(String.format("\t%s\n", s.toString()));
            System.out.printf(String.format("%s\n", s.getSchedule().toString("\t\t")));
        }
        System.out.println("Преподаватели");
        for (Teacher t : this.model.getTeachers()) {
            System.out.printf(String.format("\t%s\n", t.toString()));
        }
    }
    @Override
    public void setData() throws IOException {
        StudyGroup<Student> students = new StudyGroup<>(groupCreate("Students.txt"), "GP-19");
        StudyGroup<Teacher> teachers = new StudyGroup<>(teamCreate());
        this.model = new Model(students,teachers);
    }

    /**
     * Проверка исключения
     * @throws IOException
     */
    public void setDataForTest() throws IOException {
        StudyGroup<Student> students = new StudyGroup<>(groupCreate("StudentsForTest.txt"), "GP-19");
        StudyGroup<Teacher> teachers = new StudyGroup<>(teamCreate());
        this.model = new Model(students,teachers);
    }
    public ArrayList<Student> groupCreate(String nameFile) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        String[] dataStudents = readFile(nameFile);
        for (int i = 0; i < dataStudents.length; i++) {
            String[] temp = dataStudents[i].split(" ");
            Student student = new Student(temp[0], temp[1], temp[2]);
            student.setSchedule(new Schedule<>(setSubjAndMak(temp,3)));
            students.add(student);
        }
        return students;
    }
    public void getDiploma() throws ExceptionIssuingDiploma {
        for (Student s: this.model.getStudents()) {
            Schedule ss = s.issueADiploma();
            System.out.println(String.format("Поздравляем студента группы %s с дипломированием!\n",s.getNumGroup()));
            System.out.println(String.format("Диплом %s\n%s",s.toString(),ss.toString("\t")));
        }
    }

    public ArrayList<Teacher> teamCreate() throws IOException {
        ArrayList<Teacher> teachers = new ArrayList<>();
        String[] dataStudents = readFile("Teachers.txt");
        for (int i = 0; i < dataStudents.length; i++) {
            String[] temp = dataStudents[i].split(" ");
            StringBuilder specialization = new StringBuilder();
            for (int j = 3; j < temp.length; j++) {
                specialization.append(temp[j]);
                if (j != temp.length - 1) specialization.append(" ");
            }
            teachers.add(new Teacher(temp[0], temp[1], temp[2], specialization.toString()));
        }
        return teachers;
    }
    public ArrayList<Subjects> setSubjAndMak(String[] strings, int index) {
        String[] s = findSubjAndMak(strings, index);
        ArrayList<Subjects> subjects = new ArrayList<>();
        for (String str : s) {
            String[] temp = str.split(":");
            Subjects subject = new Subjects(temp[0]);
            if (!temp[1].equals("*")) {
                subject.addMark(Integer.parseInt(temp[1]));
            }
            subjects.add(subject);
        }
        return subjects;
    }
    public String[] findSubjAndMak(String[] strings,int index){
        StringBuilder sb = new StringBuilder();
        for (int i = index; i < strings.length; i++) {
            sb.append(strings[i]);
            if(i!=strings.length-1) sb.append(" ");
        }
        String[] s = sb.toString().split("-");
        return s;
    }
    public String[] readFile(String nameFile) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(String.format("/homeWork/src/Seminar5/Data/%s", nameFile));
        BufferedReader br = new BufferedReader(new FileReader(pathFile));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(";");
            line = br.readLine();
        }
        String everything = sb.toString();
        String[] sss = everything.split(";");
        br.close();
        return sss;
    }
}
