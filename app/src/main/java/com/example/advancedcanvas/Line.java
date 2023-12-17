package com.example.advancedcanvas;

import android.graphics.Paint;

public class Line
{
    Mypoint start, end;
    Paint draw;

//    public Line(Mypoint start, Mypoint end)
//    {
//        this.start = start;
//        this.end = end;
//    }

    public Line(Mypoint start, Mypoint end, Paint draw) {
        this.start = start;
        this.end = end;
        this.draw = draw;
    }
}
