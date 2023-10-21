import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class Tempo {
    private Integer hr, min, seg;
    Scanner ler = new Scanner(System.in);

    public Tempo(int h, int m, int s) {
        hr = h;
        min = m;
        seg = s;
    }

    public Tempo() {
        Calendar now = Calendar.getInstance();
        hr = now.get(Calendar.HOUR_OF_DAY);
        min = now.get(Calendar.MINUTE);
        seg = now.get(Calendar.SECOND);
    }


    public Tempo(int h, int m) {
        if(h >= 0 && h <= 24){
            hr = h;
        } else {
            while (h < 0 || h > 24) {
                System.out.printf("Hora inválida, digite outra hora:\n");
                h = ler.nextInt();
            }
            hr = h;
        }

        if(m >= 0 && m <= 59){
            min = m;
        } else {
            while (m < 0 || m > 59) {
                System.out.printf("Minuto inválido, digite outro:\n");
                m = ler.nextInt();
            }
            min = m;
        }
        seg = 0;
    }

    public void setHora(int h, int m, int s) {
        if(h >= 0 && h <= 24){
            hr = h;
        } else {
            while (h < 0 || h > 24) {
                System.out.printf("Hora inválida, digite outra hora:\n");
                h = ler.nextInt();
            }
            hr = h;
        }

        if(m >= 0 && m <= 59){
            min = m;
        } else {
            while (m < 0 || m > 59) {
                System.out.printf("Minuto inválido, digite outro:\n");
                m = ler.nextInt();
            }
            min = m;
        }

        if(s >= 0 && s <= 59){
            seg = s;
        } else {
            while (s < 0 || s > 59) {
                System.out.printf("Segundo inválido, digite outro:\n");
                s = ler.nextInt();
            }
            seg = s;
        }
    }

    public String toString() {
        return hr + ":" + min + ":" + seg;
    }

    public int subtrair(Tempo t) {
        return Math.abs((hr * 60 + min) - (t.hr * 60 + t.min));
    }
}
