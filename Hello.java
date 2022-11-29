public class HelloWorld {
    public static void main(String [] args) {
        System.out.println("Hello, World!");
    }
    int main() {
        int n1, n2; // создаем две переменной типа int
        cin >> n1 >> n2; // считываем данные с клавиатуры

        int res = n1 * n2; // вычисляем произведение

        cout << "Result: " << res << endl; // выводим результат

        return 0; // завершаем работу программы
    }
}
