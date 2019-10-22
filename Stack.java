package StrukDat;

public class Stack {
    private String[] Buku ;
    private int indeks;

    public Stack (int jumlah ){
        Buku = new String[jumlah];
        indeks=0;

    }
    public void push(String  value){
        if (indeks <Buku.length) {
            Buku[indeks++] = value;
        } else {


            }

            }

            public String pop() {
                if (indeks >0) {
                    return Buku[--indeks];
                } else {
                    return "";
                }
            }

            public void print (){
        for (int i=0; i<Buku.length; i++){
            System.out.println("Buku"+Buku[i]);
        }
            }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println("Urutan buku sebelum saya baca:");
        stack.push (" Matematika");
        stack.push (" Fisika");
        stack.push (" Sastra");
        stack.push (" Biolgi");

        stack.print();
        System.out.println("Urutan buku sesudah saya baca :");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    }


