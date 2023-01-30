import java.util.Arrays;
public class comabtwidthTest {
    public static void main(String[] args){
        int combatWidthSide1[] = new int[30];
        int combatWidthSide2[] = new int[30];

        int manuver = 10; //temp test values
        int selectedUnit = 10; // temp test values

        int start = selectedUnit - manuver;
        int totalTargets =  2 * manuver + 1;

        int[] totalTargetsAndStart = manuverInBounds(start,totalTargets,combatWidthSide1.length); //total is 0, start is 1
        manuverTargetFinder(combatWidthSide1,totalTargetsAndStart[1],totalTargetsAndStart[0]);

        System.out.println(Arrays.toString(combatWidthSide1));
        combatWidthSide2[selectedUnit] = 1;
        System.out.println(Arrays.toString(combatWidthSide2));


    }

    public static int[] manuverInBounds(int start, int totalTargets, int combatWidthLength){
        
        if(start < 0){
            totalTargets += start;
            start = 0;
        }
        else if(start+totalTargets > combatWidthLength){
            totalTargets = totalTargets - (start+totalTargets - combatWidthLength);
        }
        return new int[]{totalTargets,start};
    }

    public static int[] manuverTargetFinder(int combatWidthSide[],int start,int totalTargets){
        for(int count = 0; count < totalTargets;count++){
            combatWidthSide[start] = 1;
            start++;
        }
        return combatWidthSide;
    }
}
