class Student {
    private String name,id;
    private double midScore,finalScore,quizScore,prjScore,collabScore;

    // default constructor
    public Student() {
        name = "";
        id = "";
        midScore = 0;
        finalScore = 0;
        quizScore = 0;
        prjScore = 0;
        collabScore = 0;
    }

    public Student(String idS, String nameS, double midS, double finalS, double quizS,double collabS,double prjS) {
        id = idS;
        name = nameS;
        midScore = midS;
        finalScore = finalS;
        quizScore = quizS;
        collabScore = collabS;
        prjScore = prjS;
    }
    public void setStudent(String idS, String nameS,double midS,double finalS,double quizS,double collabS,double prjS) {
        id = idS;
        name = nameS;
        midScore = midS;
        finalScore = finalS;
        quizScore = quizS;
        collabScore = collabS;
        prjScore = prjS;
    }
    public Student getStudent() {
        return this;
    }
    public double getTotalScore(){
        return this.midScore+this.finalScore+this.quizScore+this.collabScore+this.prjScore;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getMidScore() {
        return this.midScore;
    }
    public double getFinalScore() {
        return this.finalScore;
    }
    public double getQuizScore() {
        return this.quizScore;
    }
    public double getCollabScore() {
        return this.collabScore;
    }
    public double getPrjScore() {
        return this.prjScore;
    }
    
}
