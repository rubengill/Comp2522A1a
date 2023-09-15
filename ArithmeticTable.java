public class ArithmeticTable {

public boolean argumentCheck(String[] args){
    if(args.length!=3){
      System.err.println("Usage: Main <type> <start> <stop>");
      System.err.println("\tWhere <type> is one of +, \"*\"");
      System.err.println("\tand <start> is between 1 and 100");
      System.err.println("\tand <stop> is between 1 and 100");
      System.err.println("\tand start < stop");
      return false;
    }        

    if(args[0].charAt(0) == '+')
      tableType = TableType.ADD;
    else
      tableType = TableType.MULT;
      int sta;
      int sto;

      try{
        sta = Integer.parseInt(args[1]);
        sto = Integer.parseInt(args[2]);
      }
      catch(NumberFormatException ex){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, \"*\"");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }

      if((sta < 1 || sta > 100)||((sto < 1 || sto > 100))){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, \"*\"");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }

      if(sta >= sto){
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +,\"*\"");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
        return false;
      }
      
    start = sta;
    end = sto;
    return true;
  }
  public static void main(String[] args){
    ArithmeticTable table = new ArithmeticTable();
    if (table.argumentCheck(args)){
      table.createTable(table.start, table.end, table.tableType);
      table.printTable();
    }
  }
}