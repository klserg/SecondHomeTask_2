package com.mycompany.myapp;

public class PointList {
    Point[] pointList = null;

    public PointList() {
        pointList = new Point[1];
    }

    public int size() {
        return pointList.length;
    }

    public void addPoint(int position, Point p)
    {
        if (position >= pointList.length)
        {
            int newSize = pointList.length;
            if (position > newSize)
                newSize = position;
            Point[] newData = new Point[newSize];
            System.arraycopy(pointList, 0, newData, 0, pointList.length);
            pointList = newData;
        }
        pointList[position-1] = p;
    }

    public Point getPoint(int index) {
        return pointList[index];
    }
}
