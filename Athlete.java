import java.util.*;

public final class Athlete {

  public Athlete(int aId){
    //a toy implementation:
    fId = aId;
    fName = "Roger Bannister";
    //fAwards is not set here!
  }

  //..elided

  /**
   Lazy initialization is used here; this assumes that awards
   may not always be of interest to the caller,
   and that for some reason it is particularly expensive to
   fetch the List of Awards.
  */
  public List<String> getAwards(){
    if (fAwards == null) {
      //the fAwards field has not yet been populated
      //Here is a toy implementation
      List<String> awards = new ArrayList<>();
      awards.add("Gold Medal 2006");
      awards.add("Bronze Medal 1998");
      fAwards = awards;
    }
    return fAwards;
  }

  /**
   This style applies only if the object is immutable.
   
   Another alternative is to calculate the hashCode once, when the 
   object is initially constructed (again, applies only when object is 
   immutable).
  */
  @Override public int hashCode(){
    if (fHashCode == 0) {
     fHashCode = HashCodeUtil.SEED;
     fHashCode = HashCodeUtil.hash(fHashCode, fId);
     fHashCode = HashCodeUtil.hash(fHashCode, fName);
     //self-encapusulated: fAwards is not referenced directly, 
     //since it may be null:
     fHashCode = HashCodeUtil.hash(fHashCode, getAwards());
    }
    return fHashCode;
  }

  // PRIVATE
  private int fId;
  private String fName;
  private List<String> fAwards;
  private int fHashCode;
} 