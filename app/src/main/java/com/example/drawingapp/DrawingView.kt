package com.example.drawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private lateinit var drawPath: FingerPath

    private lateinit var canvasPaint: Paint // how to draw

    private lateinit var drawPaint: Paint

    private var color = Color.BLACK
    private lateinit var canvas: Canvas // to hold the draw calls, what to draw
    private lateinit var canvasBitmap: Bitmap // to hold the pixels

    private var brushSize: Float = 0.toFloat()

    init {
        setUpDrawing()
    }

    private fun setUpDrawing() {
        drawPaint = Paint()
        drawPath = FingerPath(color, brushSize)
        drawPaint.color = color
        drawPaint.style = Paint.Style.STROKE
        drawPaint.strokeJoin = Paint.Join.ROUND
        drawPaint.strokeCap = Paint.Cap.ROUND
        brushSize = 20.toFloat()
    }

    internal inner class FingerPath(val color: Int, val brushThickness: Float) : Path() {

    }

}