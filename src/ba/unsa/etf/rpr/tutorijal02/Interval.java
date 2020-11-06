package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    private double pocetnaTacka;
    private double krajnjaTacka;
    private boolean daLiPripadaIntervalupocetna;
    private boolean isDaLiPripadaIntervalukrajnja;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean daLiPripadaIntervalupocetna, boolean isDaLiPripadaIntervalukrajnja) {
        if(pocetnaTacka>krajnjaTacka) throw new IllegalArgumentException("Pocetna tacka veca od krajnje");
        this.pocetnaTacka = pocetnaTacka;
        this.krajnjaTacka = krajnjaTacka;
        this.daLiPripadaIntervalupocetna = daLiPripadaIntervalupocetna;
        this.isDaLiPripadaIntervalukrajnja = isDaLiPripadaIntervalukrajnja;
    }
    public Interval()
    {
        pocetnaTacka=0;
        krajnjaTacka=0;
        daLiPripadaIntervalupocetna=false;
        isDaLiPripadaIntervalukrajnja=false;
    }

    public boolean isNull()
    {
        if(pocetnaTacka==0 && krajnjaTacka==0 && daLiPripadaIntervalupocetna==false && isDaLiPripadaIntervalukrajnja==false) return true;
        else return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetnaTacka, pocetnaTacka) == 0 &&
                Double.compare(interval.krajnjaTacka, krajnjaTacka) == 0 &&
                daLiPripadaIntervalupocetna == interval.daLiPripadaIntervalupocetna &&
                isDaLiPripadaIntervalukrajnja == interval.isDaLiPripadaIntervalukrajnja;
    }
    public boolean isIn(double tacka)
    {
        if(pocetnaTacka==tacka) return daLiPripadaIntervalupocetna;
        else if(krajnjaTacka==tacka) return isDaLiPripadaIntervalukrajnja;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pocetnaTacka, krajnjaTacka, daLiPripadaIntervalupocetna, isDaLiPripadaIntervalukrajnja);
    }

    @Override
    public String toString() {
        return "Interval{" +
                "pocetnaTacka=" + pocetnaTacka +
                ", krajnjaTacka=" + krajnjaTacka +
                ", daLiPripadaIntervalupocetna=" + daLiPripadaIntervalupocetna +
                ", isDaLiPripadaIntervalukrajnja=" + isDaLiPripadaIntervalukrajnja +
                '}';
    }
}
