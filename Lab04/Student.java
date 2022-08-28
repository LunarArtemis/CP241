class Student {
    private String name,id;
    private double midScore,finalScore,quizScore,prjScore,collabScore;

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
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMidScore() {
        return midScore;
    }
    public double getFinalScore() {
        return finalScore;
    }
    public double getQuizScore() {
        return quizScore;
    }
    public double getCollabScore() {
        return collabScore;
    }
    public double getPrjScore() {
        return prjScore;
    }
    
}
