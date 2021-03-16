package dz3;
public class ATM {
    public int countBanknotes(int sum) {
        int [] babki = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int num = 0;
        while (i<babki.length){
            while (true==true){
                if (sum-babki[i]>=0){
                    num++;
                    sum-=babki[i];
                    continue;
                }
                break;
            }
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(997));
    }}