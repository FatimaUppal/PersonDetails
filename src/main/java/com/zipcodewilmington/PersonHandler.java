package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";

        // create a `counter`
        int counter = 0;

        while (counter < personArray.length) {

            Person person = personArray[counter];

            String representation = person.toString();

            result = result.concat(representation);

            counter++;
        }

            return result;
        }

    // identify initial value
    // identify terminal condition
    // identify increment

    // use the above clauses to declare for-loop signature
    // begin loop
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop
        public String forLoop () {
            String result = "";
            for (int i =0; i< personArray.length;i++){
                Person person = personArray[i];

                String representation = person.toString();

                result = result.concat(representation);

            }

            return result;
        }

// identify array's type
    // identify array's variable-name

    // use the above discoveries to declare for-each-loop signature
    // begin loop
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop
        public String forEachLoop () {
            String result = "";
            for (Person person: personArray){

                String representation = person.toString();
                result = result.concat(representation);
            }

            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }

