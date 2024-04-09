/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Hora;

import view.Principal;

/**
 *
 * @author Mestre
 */
public class Horario {

    private Hora hora;
    private Minuto minuto;

    public Horario(Integer h, Integer min) {
        this.hora = new Hora();
        this.hora.setUnidade(h);

        this.minuto = new Minuto();
        this.minuto.setUnidade(min);
    }

    public void menosHora() {

        Integer uni = hora.getUnidade();
        if (uni == 0) {
            uni = 23;
        } else {
            uni--;
        }
        hora.setUnidade(uni);
        Principal.txtHoras.setText("" + hora.getUnidade());
    }

    public void maisHora() {

        Integer uni = hora.getUnidade();
        if (uni == 23) {
            uni = 0;
        } else {
            uni++;
        }
        hora.setUnidade(uni);
        Principal.txtHoras.setText("" + hora.getUnidade());
    }

    public void maisMinuto() {
        Integer uni = minuto.getUnidade();
        if (uni == 59) {
            uni = 0;
            maisHora();
        } else {
            uni++;
        }
        minuto.setUnidade(uni);
        Principal.txtMinutos.setText("" + minuto.getUnidade());

    }

    public void menosMinuto() {
                Integer uni = minuto.getUnidade();
        if (uni == 0) {
            uni = 59;
            menosHora();
        } else {
            uni--;
        }
        minuto.setUnidade(uni);
        Principal.txtMinutos.setText("" + minuto.getUnidade());
    }
}
