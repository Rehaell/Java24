public class Virus {
  static int virusCount = 0;
  
  public Virus() {
    virusCount++;
  }
  
  static in getVirusCount() {
    return virusCount;
  }
}
