package unidade02.topicoIII.example;

public class Copier <T>{
    public void copy(T a[], T b[], int n){
        for(int i = 0; i < n; i++){
            a[i] = b[i];
        }
    }
}
