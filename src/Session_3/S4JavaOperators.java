package Session_3;

public class S4JavaOperators {

    public static void main(String[] args){

        //ArithmeticOperators

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int rez1 = valA - valB / valC;
        System.out.println("Rez1 = " +rez1);

        int rez2 = (valA - valB) / valC;
        System.out.println("Rez2 = " + rez2);

        int rez3 = valA / valC * valD + valB;
        System.out.println("Rez3= " + rez3);

        int rez4 = valA / ( valC *(valD + valB ));
        System.out.println("Rez4= " + rez4);


        int a = 2;
        int b = 3;
        int c = 4;


        // a += b; // a= a + b
        //a += b + 12; //a = a + (b + 12)
        //a += c * b - 5; // a = a + (c * b - 5)

        System.out.println("A = " + a);

        b *= a-- + ++c * 2;
        System.out.println("b = " + b);


        //Pre-post increment decrement


        int x = 5;
        int y = x++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        //Cast examples

        byte byteVal = 4;
        int intVal = 10;
        float floatVal = 1.0f;
        double doubleVal = 2.0d;
        long longVal = 12312L;
        short shortVal = 2;


        shortVal = byteVal;
        System.out.println("valoare short = " + shortVal);

        floatVal =longVal;
        System.out.println(" valoare float = " + floatVal);


        intVal = Integer.MIN_VALUE;
        System.out.println("valoarea minima int " + intVal);
        intVal = Integer.MAX_VALUE;
        System.out.println("valoarea minima int " + intVal);

        longVal = Long.MIN_VALUE;
        System.out.println("valoarea minima long " + longVal);
        longVal = Long.MIN_VALUE;
        System.out.println("valoarea maxima long " + longVal);

        //Logical operators

        boolean isPresent = true;
        boolean isRegistered = false;

        System.out.println(" isPresent = " + isPresent);
        System.out.println(" isRegistered = " + isRegistered);

        System.out.println(" isPresent = " + !isPresent);
        System.out.println(" isRegistered = " + !isRegistered);


        int valAp = 3;
        int valBp = 3;

        if(valAp > valBp) {
            System.out.println(("valA este mai mare"));
        }else if (valAp < valBp) {
            System.out.println("valA este mai mic");
        } else if (valAp == valBp) {
            System.out.println("valorile sunt egale ");
        }

        int ap = (3 < 5) ? 4 : 6;
        System.out.println("a = " + ap);
        }





    }

