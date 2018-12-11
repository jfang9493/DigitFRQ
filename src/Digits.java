import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits (int num)
    {
        digitList = new ArrayList<Integer>();
        while(num > 0)
        {
            digitList.add(0, (num % 10));
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size() - 1; i++)
        {
            if (digitList.get(i) >= digitList.get(i+1)) return false;
        }
        return true;
    }

    public String getDigitList()
    {
        String str = "";
        for (int i = 0; i < digitList.size(); i++)
        {
            if (i == 0) str += digitList.get(i) + ",";
            else str += " " + digitList.get(i) + ",";
        }
        return "[" + str + "]";
    }
}
