
public class Impressora {
    float f1,f2;
    String s1,s2,s3;
    int i1,i2; 
    public String exibir (float f1){
        this.f1 = f1;
        return Float.toString(f1);
    }
    public String exibir (float f1,float f2){
        this.f1 = f1;
        this.f2 = f2;
        return ((Float.toString(f1)) + ", " + Float.toString(f2));
    }
    public String exibir (float f1, String s1){
        this.f1 = f1;
        this.s1 = s1;
        return (f1 +", " + s1);
    }
    public String exibir (String s1 , float f1){
        this.s1 = s1;
        this.f1 = f1;
        return (s1 +", " + f1);
    }
    public String exibir (String s1, String s2, String s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        return (s1 + ", " + s2 + ", " + s3 );
    }
    public String exibir (int i1, int i2, String s1){
        this.i1 = i1;
        this.i2 = i2;
        this.s1 = s1;
        return (i1 + ", " + i2 + ", " + s1);
    }
    
}