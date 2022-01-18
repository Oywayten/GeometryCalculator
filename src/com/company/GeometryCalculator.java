package com.company;

public class GeometryCalculator {
    // ����� ������ ������������ ���������� �������� radius
    public static double getCircleSquare(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    // ����� ������ ������������ ���������� �������� radius
    public static double getSphereVolume(double radius) {
        return ((4d / 3) * Math.PI * Math.pow(radius, 3));
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if (((a + b) <= c) || ((a + c) <= b) || ((b + c) <= a)) {
            return false;
        }
        else {
            return true;
        }
    }

    // ����� �������� ������� ������������� ��������� �������� �� ����� �����������
    // ������� isTriangleRightAngled, ���� ���������� ������� -1.0
    public static double getTriangleSquare(double a, double b, double c) {

        if (isTriangleRightAngled(a, b, c)) {
            double halfPerimetr = (a + b + c)/2;
            return Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));
        }
            else { return -1;}


    }
}
