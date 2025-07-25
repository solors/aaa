package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.webview.IWebProgressBar;

/* loaded from: classes6.dex */
public class ProgressBar extends View implements IWebProgressBar {

    /* renamed from: a */
    Runnable f57051a;

    /* renamed from: b */
    private float f57052b;

    /* renamed from: c */
    private float f57053c;

    /* renamed from: d */
    private float f57054d;

    /* renamed from: e */
    private Drawable f57055e;

    /* renamed from: f */
    private float f57056f;

    /* renamed from: g */
    private long f57057g;

    /* renamed from: h */
    private Handler f57058h;

    /* renamed from: i */
    private Drawable f57059i;

    /* renamed from: j */
    private int f57060j;

    /* renamed from: k */
    private boolean f57061k;

    /* renamed from: l */
    private boolean f57062l;

    /* renamed from: m */
    private long f57063m;

    /* renamed from: n */
    private float f57064n;

    /* renamed from: o */
    private boolean f57065o;

    /* renamed from: p */
    private IWebProgressBar.InterfaceC22086a f57066p;

    /* renamed from: q */
    private Drawable f57067q;

    /* renamed from: r */
    private Rect f57068r;

    /* renamed from: s */
    private Drawable f57069s;

    /* renamed from: t */
    private float f57070t;

    /* renamed from: u */
    private boolean f57071u;

    /* renamed from: v */
    private int f57072v;

    /* renamed from: w */
    private int f57073w;

    /* renamed from: x */
    private int f57074x;

    /* renamed from: y */
    private long f57075y;

    public ProgressBar(Context context) {
        super(context);
        this.f57051a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f57057g = 25L;
        this.f57058h = new Handler(Looper.getMainLooper());
        this.f57061k = false;
        this.f57064n = 0.95f;
        this.f57065o = false;
        this.f57068r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r11.f57062l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r11.f57062l != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r11.f57062l != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        if (r11.f57062l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        r8 = 1.0f;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public float getProgress() {
        return this.f57052b;
    }

    public void initResource(boolean z) {
        if (!z && (this.f57059i != null || this.f57067q != null || this.f57069s != null || this.f57055e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", MBSDKContext.m52746m().m52783g()));
        this.f57059i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f57059i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", MBSDKContext.m52746m().m52783g()));
        this.f57067q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f57067q.getIntrinsicHeight());
        }
        this.f57069s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", MBSDKContext.m52746m().m52783g()));
        this.f57055e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", MBSDKContext.m52746m().m52783g()));
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f57070t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f57061k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.f57059i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f57067q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z) {
        this.f57065o = z;
        if (!z) {
            this.f57063m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f, boolean z) {
        if (z && f >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setProgressBarListener(IWebProgressBar.InterfaceC22086a interfaceC22086a) {
        this.f57066p = interfaceC22086a;
    }

    public void setProgressState(int i) {
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    if (i == 8) {
                        this.f57074x = 1;
                        if (this.f57073w == 1) {
                            startEndAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                startEndAnimation();
                return;
            }
            this.f57073w = 1;
            if (this.f57074x == 1) {
                startEndAnimation();
            }
            this.f57075y = 0L;
            return;
        }
        this.f57072v = 1;
        this.f57073w = 0;
        this.f57074x = 0;
        this.f57075y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            IWebProgressBar.InterfaceC22086a interfaceC22086a = this.f57066p;
            if (interfaceC22086a != null) {
                interfaceC22086a.m51569a(true);
                return;
            }
            return;
        }
        IWebProgressBar.InterfaceC22086a interfaceC22086a2 = this.f57066p;
        if (interfaceC22086a2 != null) {
            interfaceC22086a2.m51569a(false);
        }
    }

    public void setVisible(boolean z) {
        if (z) {
            this.f57062l = true;
            this.f57063m = System.currentTimeMillis();
            this.f57054d = 0.0f;
            this.f57075y = 0L;
            this.f57071u = false;
            this.f57056f = 0.0f;
            this.f57052b = 0.0f;
            this.f57070t = getMeasuredWidth();
            this.f57065o = false;
            this.f57072v = 0;
            this.f57073w = 0;
            this.f57074x = 0;
            Drawable drawable = this.f57059i;
            if (drawable != null) {
                this.f57060j = -drawable.getIntrinsicWidth();
            } else {
                this.f57060j = 0;
            }
            Drawable drawable2 = this.f57069s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f57055e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f57067q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public void startEndAnimation() {
        if (!this.f57071u) {
            this.f57071u = true;
            this.f57056f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57051a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f57057g = 25L;
        this.f57058h = new Handler(Looper.getMainLooper());
        this.f57061k = false;
        this.f57064n = 0.95f;
        this.f57065o = false;
        this.f57068r = new Rect();
        setWillNotDraw(false);
    }
}
