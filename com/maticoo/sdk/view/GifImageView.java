package com.maticoo.sdk.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class GifImageView extends ImageView {
    private static final long DEFAULT_MOVIE_VIEW_DURATION = 1000;
    private int currentAnimationTime;
    private Movie gifMovie;
    private volatile boolean isPaused;
    private boolean isVisible;
    private float movieLeft;
    private int movieMeasuredMovieHeight;
    private int movieMeasuredMovieWidth;
    private float movieScale;
    private long movieStart;
    private float movieTop;

    public GifImageView(Context context) {
        this(context, null);
    }

    private void drawMovieFrame(Canvas canvas) {
        this.gifMovie.setTime(this.currentAnimationTime);
        canvas.save();
        float f = this.movieScale;
        canvas.scale(f, f);
        Movie movie = this.gifMovie;
        float f2 = this.movieLeft;
        float f3 = this.movieScale;
        movie.draw(canvas, f2 / f3, this.movieTop / f3);
        canvas.restore();
    }

    private void invalidateView() {
        if (this.isVisible) {
            postInvalidateOnAnimation();
        }
    }

    private void updateAnimationTime() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.movieStart == 0) {
            this.movieStart = uptimeMillis;
        }
        long duration = this.gifMovie.duration();
        if (duration == 0) {
            duration = 1000;
        }
        this.currentAnimationTime = (int) ((uptimeMillis - this.movieStart) % duration);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.gifMovie != null) {
            if (!this.isPaused) {
                updateAnimationTime();
                drawMovieFrame(canvas);
                invalidateView();
                return;
            }
            drawMovieFrame(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        this.movieLeft = (getWidth() - this.movieMeasuredMovieWidth) / 2.0f;
        this.movieTop = (getHeight() - this.movieMeasuredMovieHeight) / 2.0f;
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isVisible = z2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        int size;
        int size2;
        Movie movie = this.gifMovie;
        if (movie == null) {
            super.onMeasure(i, i2);
            return;
        }
        int width = movie.width();
        int height = this.gifMovie.height();
        if (View.MeasureSpec.getMode(i) != 0 && width > (size2 = View.MeasureSpec.getSize(i))) {
            f = width / size2;
        } else {
            f = 1.0f;
        }
        if (View.MeasureSpec.getMode(i2) != 0.0f && height > (size = View.MeasureSpec.getSize(i2))) {
            f2 = height / size;
        } else {
            f2 = 1.0f;
        }
        float max = 1.0f / Math.max(f, f2);
        this.movieScale = max;
        int i3 = (int) (width * max);
        this.movieMeasuredMovieWidth = i3;
        int i4 = (int) (height * max);
        this.movieMeasuredMovieHeight = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        boolean z;
        super.onScreenStateChanged(i);
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.isVisible = z;
        invalidateView();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.isVisible = z;
        invalidateView();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.isVisible = z;
        invalidateView();
    }

    public void pause() {
        if (!this.isPaused) {
            this.isPaused = true;
            invalidate();
        }
    }

    public void play() {
        if (this.isPaused) {
            this.isPaused = false;
            this.movieStart = SystemClock.uptimeMillis() - this.currentAnimationTime;
            invalidate();
        }
    }

    public void setGifFile(File file) {
        try {
            setGifStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setGifResource(int i) {
        setGifStream(getResources().openRawResource(i));
    }

    public void setGifStream(InputStream inputStream) {
        this.gifMovie = Movie.decodeStream(inputStream);
        requestLayout();
    }

    public GifImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GifImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.movieStart = 0L;
        this.currentAnimationTime = 0;
        this.movieLeft = 0.0f;
        this.movieTop = 0.0f;
        this.movieScale = 0.0f;
        this.movieMeasuredMovieWidth = 0;
        this.movieMeasuredMovieHeight = 0;
        this.isPaused = false;
        this.isVisible = true;
    }
}
