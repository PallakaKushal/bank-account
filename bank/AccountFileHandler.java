package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountFileHandler {
    public ArrayList<AccountInfo> getAccountInfoList() {
        //open file
        File f = new File("/Users/kp/IdeaProjects/userinterdce/src/Bank/Accountinfo.txt");
        ArrayList<AccountInfo> accountList = new ArrayList<AccountInfo>();
        Scanner scan = null;
        try {
            scan = new Scanner(f, StandardCharsets.UTF_8.name());
            while (scan.hasNext()) {
                String[] info = scan.next().split(",");
                System.out.println("----");
                System.out.println(info[0] + "--" + info[1] + "--" + info[2]);
                System.out.println("----");
                AccountInfo accountInfo1 = new AccountInfo();
                accountInfo1.setAccountNumber(Integer.parseInt(info[0]));
                accountInfo1.setName(info[1]);
                accountInfo1.setAmount(Double.parseDouble(info[2]));
                accountList.add(accountInfo1);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return accountList;

    }
}

