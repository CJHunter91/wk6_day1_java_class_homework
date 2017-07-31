

class Circus{
  private String name = "Zippos Circus";
  private Person[] customers;

  public Circus(){
    this.customers = new Person[5];
  }

  public String getName(){
    return this.name;
  }

  public int countPeople(){
    int count = 0;
    for(Person person : this.customers){
      if(person != null){
        count ++;
      }
    }
    return count;
  }

  public void addPerson(){
    if(!isFull()){
      this.customers[countPeople()] = new Person();
    }
  }

  public boolean isFull(){
    return countPeople() == this.customers.length; 
  }

}