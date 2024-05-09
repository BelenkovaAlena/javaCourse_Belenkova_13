public class Main {
    public static void main(String[] args) {

        StringBuilder phonenumber = new StringBuilder();
        phonenumber.append("+79254522781");
//        System.out.println(phonenumber.replace(3,10, "********"));
        for(int i = 3; i < phonenumber.length()-2; i++){
            phonenumber.setCharAt(i, '*');
        }
        System.out.println(phonenumber);

        StringBuilder mailadress = new StringBuilder();
        mailadress.append("Ivanov_IN@rambler.com");
        for(int i = 0; i < mailadress.indexOf("@"); i++){
//            mailadress.deleteCharAt(i);
//            mailadress.insert(i,"*");
            mailadress.setCharAt(i,'*');
        }
        System.out.println(mailadress);
    }
}