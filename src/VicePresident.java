class VicePresident extends  Manager{
    //apabila di class parent terdapat constructor yang mempunyai param maka di kelas turunan wajib memmanggil constructor tersebut
    //apabila di class parent terdapat constructor yang tidak mempunyai param maka di kelas turunan tidak wajib memanggil constructor tersebut
    //apabila di class parent terdapat 2 constructor maka bisa dipanggil salah satu saja, agar tidak terjadi error saat kompilasi

    // cara akses super constructor
    VicePresident(String name){
        super(name);
    }

    //method overriding
    void sayHello(String name){
        System.out.println("Hello "+ name + " My name is VP " + this.name);
    }
}
