package objects;

public class AdmissionForm {
    public String name;
    public Integer gradMarksPercentage;
    public Integer yearOfGraduation;
    public Integer ojeeRank;

    public Integer getScholarshipAmount() {
        if (ojeeRank > 0 && ojeeRank <= 100)
        {
            return 70;
        }
        if (ojeeRank > 101 && ojeeRank <=200)
        {
            return 50;
        }
        if (ojeeRank > 201 && ojeeRank <=300)
        {
            return 30;
        }
        if (ojeeRank >301)
        {
            return 0;
        }
        return 0;
    }

}
