package objects;

public class AdmissionFormMain {
    public static void main(String[] args) {
        AdmissionForm admissionFormTapaswini = new AdmissionForm();
        admissionFormTapaswini.name = "Tapaswini";
        admissionFormTapaswini.yearOfGraduation = 2018;
        admissionFormTapaswini.gradMarksPercentage = 70;
        admissionFormTapaswini.ojeeRank = 5;
        System.out.println(admissionFormTapaswini.getScholarshipAmount());


        AdmissionForm admissionFormManisha = new AdmissionForm();
        admissionFormManisha.name = "Manisha";
        admissionFormManisha.yearOfGraduation = 2018;
        admissionFormManisha.gradMarksPercentage = 75;
        admissionFormManisha.ojeeRank = 6;
        System.out.println(admissionFormManisha.getScholarshipAmount());

        System.out.println(admissionFormTapaswini==admissionFormManisha);
        System.out.println(admissionFormManisha.getClass());
    }

}
