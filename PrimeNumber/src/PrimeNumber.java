
public class PrimeNumber {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan sayılar arasında asal olanları bul ve yazdır
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden metot
    public static boolean isPrime(int number) {
        // 2'den küçük sayılar asal sayı değildir
        if (number < 2) {
            return false;
        }
        // Sayının asal olup olmadığını kontrol et
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Bölünebilen bir sayı bulundu, asal değil
            }
        }
        return true; // Asal
    }
}


