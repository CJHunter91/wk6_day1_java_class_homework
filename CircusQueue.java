
class CircusQueue{
  private Person[] queue;

  public CircusQueue(){
    this.queue = new Person[10];
  }

  public int countPeople(){
    int count = 0;
    for(Person person : this.queue){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void addPerson(){
    this.queue[countPeople()] = new Person();
  }

  
}