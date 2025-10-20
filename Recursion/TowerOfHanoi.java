public class TowerOfHanoi {
    public static void towerHanoi(int n, String src, String hlp, String des) {
        if(n == 1) {
            System.out.println("The disk move from "+src+" to "+des);
            return;
        }

        //move n-1 disks from source to helper by using destination as helper
        towerHanoi(n-1, src, des, hlp);
        //move the n th disk from the source to destination
        System.out.println("The disk move from "+src+" to "+des);
        //move the n-1 disks from the helper to destination by using source as a helper
        towerHanoi(n-1, hlp, src, des);
    }
    public static void main(String[] args) {
        int n =3;
        towerHanoi(n, "S", "H", "D");
    }
}
