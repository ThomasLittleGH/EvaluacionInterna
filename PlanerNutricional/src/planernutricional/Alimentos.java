/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planernutricional;

public class Alimentos {

    private int id;
    private String nombre;
    private float calorias, proteinas, carbohidratos, vit_a, vit_c, vit_k, fibra, calcio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(float carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public float getVit_a() {
        return vit_a;
    }

    public void setVit_a(float vit_a) {
        this.vit_a = vit_a;
    }

    public float getVit_c() {
        return vit_c;
    }

    public void setVit_c(float vit_c) {
        this.vit_c = vit_c;
    }

    public float getVit_k() {
        return vit_k;
    }

    public void setVit_k(float vit_k) {
        this.vit_k = vit_k;
    }

    public float getFibra() {
        return fibra;
    }

    public void setFibra(float fibra) {
        this.fibra = fibra;
    }

    public float getCalcio() {
        return calcio;
    }

    public void setCalcio(float calcio) {
        this.calcio = calcio;
    }

    @Override
    public String toString() {
        return "Alimentos{" + "id=" + id + ", nombre=" + nombre + ", calorias=" + calorias + ", proteinas=" + proteinas + ", carbohidratos=" + carbohidratos + ", vit_a=" + vit_a + ", vit_c=" + vit_c + ", vit_k=" + vit_k + ", fibra=" + fibra + ", calcio=" + calcio + '}';
    }

}
