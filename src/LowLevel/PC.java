package LowLevel;

import java.util.Scanner;

public class PC {
    private String GenerateIP(){
        String ipAdress = "192.168. " ;

        Scanner in = new Scanner(System.in);
        in.hasNextLine();

        ipAdress += in;
                return ipAdress;
    }

    private int ThirdSymbolIP(){
        Scanner in = new Scanner(System.in);
        in.hasNextLine();
    }

    private int Mask(){

    }

    public String IpBuilder(int thirdSymbol){
        String ipAdress = "192.168 " + thirdSymbol;

    }
}
