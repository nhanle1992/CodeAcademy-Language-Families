class Language{
  
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }
  
  public void getInfor(){
  System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
  System.out.println("The language follows the word order: " + this.wordOrder);
  }
  
  public static void main(String[] args){
    Language Japanese = new Language("Japanese",65700, "Japan and East Asia", "subject-object-verb");
   Japanese.getInfor();
    
    System.out.println();
    
    Language Chontal = new Mayan("Chontal", 36810);
    Chontal.getInfor();
    
    System.out.println();
    
    Language mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfor();
    
    System.out.println();
    
  Language burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfor();
  }
}