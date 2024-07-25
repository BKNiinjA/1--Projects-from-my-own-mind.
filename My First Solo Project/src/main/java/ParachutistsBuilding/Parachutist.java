package ParachutistsBuilding;

public class Parachutist {

    protected String[] names = {"Michael","Jhohane","Clark","Bishop","Lindsey","Matthew","Jullia"};
    private Apartments parachutist;
    private int aux;

    public void packingTheParachute() {
        System.out.println("The parachutists are organizing their equipment!");
        System.out.println("Now they are getting up to the helipad!");
        System.out.println(" ");
    }

    public void jumpingParachute() {
        for (int i = 0; i < parachutist.jumpingSequence.length; i++) {
            if(parachutist.jumpingSequence[i] % 2 != 0){
                aux = parachutist.jumpingSequence[i];
            } else {
                aux = parachutist.jumpingSequence[i];
            }
            System.out.println(names[aux]+" is jumping from tower's helipad.");
        }
    }
}
