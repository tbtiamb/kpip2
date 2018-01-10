package entities;

import java.sql.Date;

public class Main {
    public static void main(String[] args){
        AutorsEntity autor = new AutorsEntity("a", "a", 2, null, null);
      //  AutorsEntity.addElem(autor);
        AutorsEntity.updateFirstName(AutorsEntity.readElem(217), "b");

        //AutorsEntity.removeElem(AutorsEntity.readElem(216));

    }
}
