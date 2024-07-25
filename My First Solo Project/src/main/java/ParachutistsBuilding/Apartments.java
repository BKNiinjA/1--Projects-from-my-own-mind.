package ParachutistsBuilding;

public class Apartments extends Parachutist {

    private int bedroom = 2;
    private int bathroom = 1;
    private int kitchen = 1;
    private int i = 0, odd = 4, even = 0, j = 0,k = 1;
    protected static int[] apartmentNumber = {0,1,2,3,4,5,6};
    protected static int[] jumpingSequence = new int[7];

    public int getBedroom() {
        System.out.println("The apartment has " + this.bedroom + " bedroom");
        return bedroom;
    }

    public int getBathroom() {
        System.out.println("The apartment has " + this.bathroom + " bathroom");
        return bathroom;
    }

    public int getKitchen() {
        System.out.println("The apartment has " + this.kitchen + " kitchen");
        return kitchen;
    }

    public void apartmentsOwners() {

                System.out.println("The owner of this apartment is " + names[i]);
                System.out.println("Apartment number: " + k);
                i++;
                k++;

    }

    public void firstEven() {

      do {
          if(apartmentNumber[j] % 2 != 0){
              jumpingSequence[odd] = apartmentNumber[j];
              odd++;
              j++;
          } else {
              jumpingSequence[even] = apartmentNumber[j];
              even++;
              j++;
          }
      } while(j < 7);
    }

    public void masterMethod() {
        this.apartmentsOwners();
        this.getBedroom();
        this.getBathroom();
        this.getKitchen();
        System.out.println("____________________________");
        System.out.println(" ");

    }
}
