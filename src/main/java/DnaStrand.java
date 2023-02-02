public class DnaStrand {
    public static String makeComplement(String dna) {
       
        StringBuilder dnaForChange=new StringBuilder(dna);

        for(int i=0; i<dnaForChange.length(); i++){
           switch (dnaForChange.charAt(i)){
               case'T':
                   dnaForChange.replace(i, i+1,"A");
                   break;
               case'A':
                   dnaForChange.replace(i, i+1,"T");
                   break;
               case'C':
                   dnaForChange.replace(i, i+1,"G");
                   break;
               case'G':
                   dnaForChange.replace(i, i+1,"C");
                   break;

           }

        }

        return dnaForChange.toString();

//        dna=dna.replace("A","t");
//        dna=dna.replace("T","a");
//        dna=dna.replace("G","c");
//        dna=dna.replace("C","g");
//        return dna.toUpperCase();



    }
}
