package lesson4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // ��������� ������� ����� �������� 10 ��� ���� �� �� ����������
        // � ����� �� ��������� ��� ��� ������� ������� �� ������ ������
        // ���, ����, �����, �����, ������

        for (int year = 0; year < 10; year++) {
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < 31; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int min = 0; min < 60; min++) {
                            for (int sec = 0; sec < 60; sec++) {
                                System.out.printf("�� ������ ������: %d ���, %d ������, %d ���, %d ����, %d �����, %d ������ \n", year, month, day, hour, min, sec);
                                Thread.sleep(1000);

                            }
                        }
                    }
                }
            }
        }

    }
}
