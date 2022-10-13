import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChanceCard
{
    String msg;
    int udgift;
    int indkomst;
    ChanceCard(String msg, int udgift, int indkomst)
    {
        this.indkomst = indkomst;
        this.udgift = udgift;
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }

    public int getUdgift()
    {
        return udgift;
    }

    public int getIndkomst()
    {
        return indkomst;
    }
}
