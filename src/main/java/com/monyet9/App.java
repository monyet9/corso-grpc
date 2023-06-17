package com.monyet9;

import com.google.protobuf.Int32Value;
import com.monyet9.models.*;
import com.monyet9.models.common.CarType;
import com.monyet9.models.common.Cars;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        /*
        * TEST PROTO CONTAINS SIMPLE OBJECT
         */
        Person frenk = Person.newBuilder()
                .setName("ciccio")
                        .setAge(2).build();
        System.out.println( "SimpleProto !" );
        System.out.println( frenk );

        /*
         * TEST PROTO CONTAINS COMPOSITE OBJECT WITH LIST
         */
        PersonComposite compositeFrenk= PersonComposite.newBuilder()
                .setName("ciocio")
                .setAge(20)
                .addCars(Cars.newBuilder().setType("honda").build())
                .addCars(Cars.newBuilder().setType("mercedes").build())
                        .build();
        System.out.println( "CompositeProto list !" );
        System.out.println( compositeFrenk );

        /*
         * nei vari metodo ho a dispozionione anche un metodo grazie al quale vado a recuperare il tipo
         * e posso accedere ai suoi metodi nativi
         * Se prendiamo di esempio la lista , recupero il tipo di car , recuperando il tipo accedo ai suoi tipi.
         * Stessa cosa per una mappa
         */
        compositeFrenk.getCarsList().size();

        PersonComposite compositeFrenkMap= PersonComposite.newBuilder()
                .setName("ciocio")
                .setAge(21)
                .addCars(Cars.newBuilder().setType("honda").build())
                .addCars(Cars.newBuilder().setType("mercedes").build())
                .putDetails("ciccio","ciccio")
                .build();

        compositeFrenkMap.getDetailsMap();


        System.out.println( "CompositeProto map !" );
        System.out.println( compositeFrenkMap );

        PersonComposite compositeFrenkEnum= PersonComposite.newBuilder()
                .setName("ciocio")
                .setAge(21)
                .addCars(Cars.newBuilder().setType(CarType.ALFA.name()).build())
                .addCars(Cars.newBuilder().setType(CarType.BMW.name()).build())
                .build();

        System.out.println( "CompositeProto enum !" );
        System.out.println( compositeFrenkEnum );

        Credential credential= Credential.newBuilder()
                .setUserCredential(UserCredential.newBuilder()
                        .setUsurname("cicccio")
                        .setPassword("adde345").build()).build();

        authMode(credential);

        Int32Value age= Int32Value.newBuilder()
                .setValue(23).build();

        PersonWrapper personWrapper= PersonWrapper.newBuilder()
                .setAge(age).build();

        if(personWrapper.hasAge()){
            System.out.println("persona wrapper con eta : " + personWrapper);
        }

    }

    /*
    * il one oneOf mette a disposizione un metodo che ti fa gestire i tipi differenti
     */
    public static void authMode (Credential credential){
        switch(credential.getAuthModeCase()){
            case EMAILCREDETIAL:
                System.out.println(credential.getEmailCredetial());
            case USERCREDENTIAL:
                System.out.println(credential.getUserCredential());
        }
    }

}
