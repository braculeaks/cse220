//DO NOT CHANGE ANY CODES IN THIS CLASS
class Dancer {
    private String name;
    private char gender;
    private int id;

    public Dancer(String name, char gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
    
    public char getGender(){
      return this.gender;
    }

    @Override
    public String toString(){
      return this.name+"("+this.gender+"-"+this.id+")";
    }
}
