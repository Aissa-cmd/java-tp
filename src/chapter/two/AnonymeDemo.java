package chapter.two;

import java.time.LocalDate;
import chapter.one.ma.esta.Personne;

public class AnonymeDemo {
    public static void main(String[] args) {
        Personne p = new Personne("John", "Doe", 24) {
            public int getBirthYear() {
                LocalDate today = LocalDate.now();
                LocalDate birthDate = today.minusYears(this.getAge());
                return birthDate.getYear();
            }

            @Override
            public String toString() {
                // TODO Auto-generated method stub
                return String.format("Personne{nom=%s, pernom=%s, age=%d, birthYear=%d}", getNom(), getPrenom(), getAge(), getBirthYear());
            }
        };

        System.out.println(p);
    }
}


