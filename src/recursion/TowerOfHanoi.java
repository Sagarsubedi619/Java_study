package recursion;
//Solution Generator

public class TowerOfHanoi {

    public void SolveTOH(int numberOfDisc, String fromTower,String destTower, String intermediateTower){
        if(numberOfDisc==1){
            System.out.println("Move Disc: "+numberOfDisc + fromTower + "to "+destTower);
        }
        else {
            SolveTOH(numberOfDisc - 1, fromTower, intermediateTower, destTower);
            System.out.println("Move Disc:" + numberOfDisc+ " " + fromTower + " to " + destTower);
            SolveTOH(numberOfDisc - 1, intermediateTower, destTower, fromTower);
        }

    }
}
