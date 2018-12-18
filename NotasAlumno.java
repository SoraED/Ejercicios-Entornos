public class Persona {

private String nombre;
private int telefono;
private int edad;

public String getnombre(){
return nombre;
}
public void setnombre(String nom){
nombre=nom;
}

public int gettelefono(){
return telefono;
}
public void settelefono(int tel)
telefono = tel;
}

public int getedad(){
return edad;
}
public void setedad(int ed){
edad = ed;
}

public Persona (String nom, int tel, int ed){
nombre = nom;
telefono = tel;
edad=ed;
}

public void imprimir (){

System.out.println(nombre+" "+telefono+" "+edad);
}

}
