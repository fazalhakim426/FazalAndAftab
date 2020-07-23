package assignment;

import java.text.DecimalFormat;

public class Project {
    int n;
    public Boolean prime(Integer n1) {
        Boolean b = true;
        if (n1 <= 1) {
            return false;
        } else {
            for(int i = 2; i < n1; ++i) {
                if (n1 % i == 0) {
                    b = false;
                    break;
                }
            }

            return b;
        }}
    public Boolean even(Integer n1) {

        boolean beven = true;
        if (n1 % 2 == 0) {
            beven = true;
        } else {
            beven = false;
        }

        return beven;

    }
    public boolean checkPalen(String str1, String str2) {
        StringBuilder strbul = new StringBuilder(str1);
        strbul.reverse();
        String res = strbul.toString();
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.reverse();
        String reverseee = sb2.toString();
        return str1.equals(res) && str2.equals(reverseee);
    }
    public double[] temp(double celcius) {
        double k = celcius + 271.15D;
        double f = 1.8D * celcius + 32.0D;
        double[] a = new double[]{k, f};
        return a;
    }
    public int CalculateAverage(int[] a) {
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum / a.length;
    }

}
