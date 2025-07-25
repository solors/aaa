package com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coi222o222 */
/* loaded from: classes8.dex */
public class C32478coi222o222 extends View {
    private static final int cicic = 1000;
    private static final String coiic = "GifView";
    private int c2oc2i;
    private int c2oc2o;
    private float cco22;
    private volatile boolean cii2c2;
    private boolean ciii2coi2;
    private int cioccoiococ;
    private long coi222o222;
    private Movie coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    class CallableC32479coi222o222 implements Callable<Movie> {
        final /* synthetic */ InputStream coo2iico;

        CallableC32479coi222o222(InputStream inputStream) {
            this.coo2iico = inputStream;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Movie call() {
            return Movie.decodeStream(this.coo2iico);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2ccocci.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    class CallableC32480coo2iico implements Callable<Movie> {
        final /* synthetic */ String coo2iico;

        CallableC32480coo2iico(String str) {
            this.coo2iico = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Movie call() {
            return Movie.decodeFile(this.coo2iico);
        }
    }

    public C32478coi222o222(Context context) {
        super(context);
        this.c2oc2i = 0;
        this.cco22 = 1.0f;
        this.cii2c2 = false;
        this.ciii2coi2 = true;
        setLayerType(1, null);
    }

    private void cioccoiococ() {
        if (this.coo2iico == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.coi222o222 == 0) {
            this.coi222o222 = uptimeMillis;
        }
        int duration = this.coo2iico.duration();
        if (duration == 0) {
            duration = 1000;
        }
        this.c2oc2i = (int) ((uptimeMillis - this.coi222o222) % duration);
    }

    private void coi222o222() {
        if (this.ciii2coi2) {
            postInvalidateOnAnimation();
        }
    }

    private void coo2iico() {
        Movie movie = this.coo2iico;
        if (movie == null) {
            return;
        }
        try {
            float width = movie.width();
            float height = this.coo2iico.height();
            float width2 = getWidth();
            float height2 = getHeight();
            float min = Math.min(width2 / width, height2 / height);
            this.cco22 = min;
            int i = (int) ((width2 - (width * min)) / 2.0f);
            this.cioccoiococ = i;
            int i2 = (int) ((height2 - (height * min)) / 2.0f);
            this.c2oc2o = i2;
            if (min > 0.0f) {
                this.cioccoiococ = (int) (i / min);
                this.c2oc2o = (int) (i2 / min);
            }
        } catch (Exception e) {
            MLog.m25891d(coiic, "initViewType error", e);
        }
    }

    public boolean c2oc2i() {
        if (this.coo2iico != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.coo2iico != null) {
            if (!this.cii2c2) {
                cioccoiococ();
                coo2iico(canvas);
                coi222o222();
                return;
            }
            coo2iico(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        coo2iico();
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ciii2coi2 = z2;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie = this.coo2iico;
        if (movie != null) {
            int width = movie.width();
            int height = this.coo2iico.height();
            if (View.MeasureSpec.getMode(i) != 0) {
                width = View.MeasureSpec.getSize(i);
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                height = View.MeasureSpec.getSize(i2);
            }
            setMeasuredDimension(width, height);
            return;
        }
        setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
    }

    public void setGIFResource(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        if (this.coo2iico == null) {
            try {
                FutureTask futureTask = new FutureTask(new CallableC32479coi222o222(inputStream));
                C32465cioc2.c2oc2i.execute(futureTask);
                this.coo2iico = (Movie) futureTask.get(2000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                MLog.m25888e(coiic, "decode Gif file", e);
            }
        }
        requestLayout();
    }

    public void setGifFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.coo2iico == null) {
            try {
                FutureTask futureTask = new FutureTask(new CallableC32480coo2iico(str));
                C32465cioc2.c2oc2i.execute(futureTask);
                this.coo2iico = (Movie) futureTask.get(2000L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                MLog.m25888e(coiic, "decode Gif file: " + str, e);
            }
        }
        requestLayout();
    }

    private void coo2iico(Canvas canvas) {
        Movie movie = this.coo2iico;
        if (movie == null) {
            return;
        }
        movie.setTime(this.c2oc2i);
        canvas.save();
        float f = this.cco22;
        canvas.scale(f, f);
        this.coo2iico.draw(canvas, this.cioccoiococ, this.c2oc2o);
        canvas.restore();
    }
}
