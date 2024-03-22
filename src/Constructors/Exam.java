package Constructors;

import java.awt.font.TextHitInfo;

public class Exam {
    int exam_id;
    ReattemptExam reattemptExam;
    Exam(Exam other){
        this.exam_id=other.exam_id;
        this.reattemptExam=other.reattemptExam;

    }
    Exam(int id){
        exam_id = id;
        this.reattemptExam=new ReattemptExam();
    }
}
