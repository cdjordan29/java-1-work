/***********************
 *
 *   Tests methods of the PiggyBank class
 *
 *   Author:   Shawn Brenneman
 *   Date:     2016-Mar 24
 *
 ***********************/
 public class PiggyBankTest
 {

 public static void addCoins(PiggyBank bank, int qs, int ds, int ns, int ps)
 {
    for (int i=0; i<qs; i++)
        bank.addQuarter();
    for (int i=0; i<ds; i++)
        bank.addDime();
    for (int i=0; i<ns; i++)
        bank.addNickel();
    for (int i=0; i<ps; i++)
        bank.addPenny();
 }

 public static void main(String[] args) {

    final double THRESHOLD = .00001;

    PiggyBank jojo = new PiggyBank("Jojo");
    PiggyBank sammy = new PiggyBank("Sammy");

    System.out.println("\n---Creating and printing two piggy banks.\n");

    System.out.println(jojo + "\n" + sammy);

    System.out.println("\n---Adding coins to both piggy banks.\n");

    addCoins(jojo,27,9,5,4);
    addCoins(sammy,5,38,14,8); 

    System.out.println(jojo + "\n" + sammy);

    // Testing getters and the add methods

    int passCnt = 0;
    if (jojo.getQuarterCnt() == 27 && sammy.getQuarterCnt() == 5) 
        passCnt++;
    else
        System.out.println("Something is wrong with addQuarter() or getQuarterCnt().");

    if (jojo.getDimeCnt() == 9 && sammy.getDimeCnt() == 38) 
        passCnt++;
    else
        System.out.println("Something is wrong with addDime() or getDimeCnt().");
        
    if (jojo.getNickelCnt() == 5 && sammy.getNickelCnt() == 14) 
        passCnt++;
    else
        System.out.println("Something is wrong with addNickel() or getNickelCnt().");
        
    if (jojo.getPennyCnt() == 4 && sammy.getPennyCnt() == 8) 
        passCnt++;
    else
        System.out.println("Something is wrong with addPenny() or getPennyCnt().");
        
    if (passCnt == 4)
        System.out.println("\nAll tests PASS for add and get methods.\n");

    passCnt=0;
    if (Math.abs(7.94 - jojo.contains()) < THRESHOLD)
        passCnt++;
    else
        System.out.println("Jojo's bank should contain $7.94.  It contains: $" + jojo.contains());

    if (Math.abs(5.83 - sammy.contains()) < THRESHOLD)
        passCnt++;
    else
        System.out.println("Sammy's bank should contain $5.83.  It contains: $" + sammy.contains());

    System.out.println("---Emptying Jojo's piggybank....");
    double amount = jojo.empty();
    
    if (Math.abs(7.94 - amount) < THRESHOLD)
    {
        System.out.println("Jojo's bank had $" + amount + " in it.");
        System.out.println("It now has $" + jojo.contains() + " in it.");
    }
    else
    {
        System.out.println("Jojo's bank should have had $7.94 in it, but it had $" + amount); 
        passCnt--;
    }



    if (Math.abs(0-jojo.contains()) < THRESHOLD )
        passCnt++;
    else
        System.out.println("Jojo's bank should now be empty, but it contains $" + jojo.contains());

    if (passCnt ==3)
        System.out.println("\nAll tests PASS for the contains method.\n");


 } //main
 }
