class Person{
    private int id;
    private static int nmbr;
    private String fname;
    private String lname;
    private int age;

    public Person(String fname,String lname,int age){
        this.id = ++nmbr;
        this.fname = fname;
        this.lname=lname;
        this.age=age;
    }

    @Override
    public String toString(){
        return this.fname+" "+this.lname+" de "+this.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}