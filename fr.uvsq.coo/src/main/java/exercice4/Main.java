package exercice4;

public class Main {private static final String PERSISTENCE_UNIT_NAME ="todos";
private static EntityManagerFactory factory ;
}
public static void main ( String[]args) {
factory= Persistence.createEntityManagerFactory (PERSISTENCE_UNIT_NAME) ;
// . . .
}


}
