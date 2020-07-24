package bank;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GetButtonLogic implements ActionListener {
    DisplayAccountUI displayAccountUI;

    GetButtonLogic(DisplayAccountUI displayAccountUI) {
        this.displayAccountUI = displayAccountUI;
    }
    // click button

    public void actionPerformed(ActionEvent e) {
        AccountFileHandler accountFileHandler = new AccountFileHandler();
        ArrayList<AccountInfo> accountList = accountFileHandler.getAccountInfoList();
        String textValue = DisplayAccountUI.f1.getText();

        int acc = Integer.parseInt(textValue);

        for (AccountInfo accountInfo : accountList) {
            if (acc == accountInfo.getAccountNumber()) {

                DisplayAccountUI.l2.setVisible(true);
                DisplayAccountUI.l3.setVisible(true);
                DisplayAccountUI.l4.setText(accountInfo.getName());
                DisplayAccountUI.l4.setVisible(true);
                Double amount = accountInfo.getAmount();
                DisplayAccountUI.l5.setText(amount.toString());
                DisplayAccountUI.l5.setVisible(true);
                break;
            } else {
                DisplayAccountUI.l3.setVisible(false);
                DisplayAccountUI.l2.setVisible(false);
                DisplayAccountUI.l4.setText("");
                DisplayAccountUI.l4.setVisible(false);
                DisplayAccountUI.l5.setText("");
                DisplayAccountUI.l5.setVisible(false);
                //JOptionPane optionPane = new JOptionPane();
                //optionPane.showMessageDialog(displayAccountUI, "Account not found");


            }
        }
    }
}
