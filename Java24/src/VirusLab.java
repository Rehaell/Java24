public class VirusLab {
  public static void main(String[] args) {
    int numVirus = 10;
    
    
      Virus[] virii = new Virus[numVirus];
     
    for ( int i = 0; i < numVirus; i++) {
        virii[i] = new Virus();
     }
    System.out.println("There are "+ Virus.getVirusCount() + " viruses.");
  }
}
