import java.util.Scanner;

public class Caesar{

  public final static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public final static String EXAMPLE_KEY = "HAMNOGPQFEISTLJVWDXKCYZRBU";

  public static String applyCaesar(String text, String key, String clear){
    text = text.toUpperCase();
    StringBuilder verschluesselt = new StringBuilder();

    for(int i = 0; i < text.length(); i++){
      char c = text.charAt(i);
      int position = key.indexOf(c);

      if(position != -1){
        verschluesselt.append(clear.charAt(position));
      } else{
        verschluesselt.append(c);
      }
    }

  }
  

  public static void printStatistics(String text){
/*     Object[][] array = new Object[26][2]; 


    for(int i = 0; i < 26; i++){
      array[i][0] = (char) ("A" + i);
      array[i][1] = 0;
    }

    for(int j = 0; j < text.length(); j++){
      char currentchar = Character.toUpperCase(text.charAt(j));
      if(currentchar >= "A" && currentchar <= "Z"){
        int index = currentchar - "A";
        array[index][1] = (int) array[index] + 1;
      }
    } */
    int amountofletters = 0;
    int[] count = new int[26];
    int l = text.length();

    for(int i = 0; i < 26; i++){
      char currentchar = text.charAt(i);
      if(ABC.contains(String.valueOf(currentchar))){
        amountofletters++;
        count[ABC.indexOf(currentchar)]++;
      }
    }

    for(int j = 0; j < 26; j++){
      if(count[j] > 0){
        double percent = ((double) count[j] / amountofletters) * 100;
        System.out.println(percent);
    }
  }


  }

  public static void main(String[] args){
    String message = "PROGRAMMIEREN IN JAVA MACHT NOCH MEHR SPASS ALS IN PYTHON ODER C";

    String encrypted = applyCaesar(message, EXAMPLE_KEY, ABC);
    String decrypted = applyCaesar(encrypted, ABC, EXAMPLE_KEY);

    System.out.printf("Message: %s%n", message);
    System.out.printf("Encrypted: %s%n", encrypted);
    System.out.printf("Decrypted: %s%n", decrypted);

    printStatistics(encrypted);
  }

  public final static String EXAM_HINTS_ENCRYPTED = "WJ EG ULT SPDWFWT RW VLFKLNLG JÜFFLG FEL GWT HAPBLGUL NEGZLEFL VLDQNKLG:\r\n"+
" - UEL SPDWFWT ATELGKELTK FEQN DG ULG CTDSKESD!\r\n"+
" - VLDTVLEKLG FEL DPPL CTDSKESWJFDWHBDVLG FLPVFKFKÄGUEB. GWT FA OLTFKLNLG FEL UEL PÖFWGBLG WGU SÖGGLG DWQN EG ULT SPDWFWT FLPVFKFKÄGUEB DWH UEL PÖFWGB SAJJLG.\r\n"+
" - FLNLG FEL ULG PLEFKWGBFGDQNZLEF DPF LEGL BLPLBLGNLEK LEGL TÜQSJLPUWGB RW ENTLJ ZEFFLGFFKDGU RW VLSA JJLG. ZLGG FEL LEGJDP LEG CTDSKESWJ GEQNK VLFKLNLG, UDGG GWKRLG FEL UEL BLPLBLGNLEK WJ FEQN KELHLT EGUEL JDKLTEL LEGRWDTVLEKLG.\r\n"+
" - FLNLG FEL FEQN DPKL SPDWFWTLG DG WGU TLQNGLG FEL UELFL UWTQN. UEL SPDWFWTLG EG CTABTDJJELTLG 2 FEGU EJJLT ÄNGPEQN DWHBLVDWK. FEL UÜTHLG FEQN FABDT UEL DPKLG SPDWFWTLG JEK ENTLG PÖFWGBLG JEK EG UEL CTÜH WGB GLNJLG.\r\n"+
" - CTAVELTLG FEL UEL VLEFCELPL DWF ULT OATPLFWGB FLPVLT DWF, OLTÄGULTG FEL FEL, JDQNLG FEL FEL SDCWKK WGU TLCDTELTLG FEL FEL. FA VLSAJJLG FEL LEG BLHÜNP HÜT UEL CTABTDJJELTFCTDQNL.\r\n"+
"- ZLGG UDF DPPLF GEQNKF NEPHK, UDGG HEGULG FEL NELT UEL DWHBDVLG ULT GÄQNFKLG CTABTDJJJELTLG 2 SPDWFWT FDJK PÖFWGBLG: NKKCF://VEK.PY/CTAB2-SPDWFWT-FAFL24";







}
