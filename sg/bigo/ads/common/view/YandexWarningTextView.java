package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43822e;

/* loaded from: classes10.dex */
public class YandexWarningTextView extends TextView {

    /* renamed from: a */
    private int f114858a;

    /* renamed from: b */
    private int f114859b;

    /* renamed from: c */
    private float f114860c;

    /* renamed from: d */
    private int f114861d;

    /* renamed from: e */
    private int f114862e;

    /* renamed from: f */
    private float f114863f;

    /* renamed from: g */
    private boolean f114864g;

    /* renamed from: h */
    private int f114865h;

    /* renamed from: i */
    private float f114866i;

    /* renamed from: j */
    private int f114867j;

    /* renamed from: k */
    private int f114868k;

    /* renamed from: l */
    private final int f114869l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f114858a = 25;
        this.f114859b = 10;
        this.f114860c = 35.0f;
        this.f114862e = 1;
        this.f114863f = 50.0f;
        this.f114864g = false;
        this.f114865h = 0;
        this.f114866i = 0.0f;
        this.f114867j = 1000;
        this.f114868k = 1000;
        this.f114869l = 1000;
        m4729a(null);
    }

    /* renamed from: a */
    private void m4729a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C42750R.styleable.YandexWarningTextView);
            this.f114858a = C43822e.m4902c(C43617a.f114190a, obtainStyledAttributes.getDimensionPixelSize(C42750R.styleable.YandexWarningTextView_maxTextSize, this.f114858a));
            this.f114859b = C43822e.m4902c(C43617a.f114190a, obtainStyledAttributes.getDimensionPixelSize(C42750R.styleable.YandexWarningTextView_minTextSize, this.f114859b));
            obtainStyledAttributes.recycle();
        }
        this.f114867j = C43822e.m4903c(getContext());
        this.f114868k = C43822e.m4905b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i = this.f114862e;
        if (i > 2) {
            i = 2;
        }
        canvas.save();
        float f = (this.f114861d * 1.0f) / i;
        float f2 = f / this.f114863f;
        C43782a.m5008a("yandexWarn", "onDraw...singleLineHeight:" + f + "...scaleY:" + f2 + "...mPy:" + this.f114866i);
        canvas.scale(1.0f, f2, 0.0f, this.f114866i);
        super.onDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:5:0x0007, B:8:0x0013, B:9:0x004f, B:11:0x0059, B:16:0x0080, B:18:0x00a9, B:23:0x00b2, B:34:0x00d6, B:36:0x00dc, B:38:0x00e0, B:39:0x00e2, B:26:0x00bb, B:27:0x00c0, B:33:0x00d2, B:13:0x005f, B:15:0x0066), top: B:42:0x0007 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onSizeChanged(int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.YandexWarningTextView.onSizeChanged(int, int, int, int):void");
    }

    public void setIsHorizontal(boolean z) {
        this.f114864g = z;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114858a = 25;
        this.f114859b = 10;
        this.f114860c = 35.0f;
        this.f114862e = 1;
        this.f114863f = 50.0f;
        this.f114864g = false;
        this.f114865h = 0;
        this.f114866i = 0.0f;
        this.f114867j = 1000;
        this.f114868k = 1000;
        this.f114869l = 1000;
        m4729a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114858a = 25;
        this.f114859b = 10;
        this.f114860c = 35.0f;
        this.f114862e = 1;
        this.f114863f = 50.0f;
        this.f114864g = false;
        this.f114865h = 0;
        this.f114866i = 0.0f;
        this.f114867j = 1000;
        this.f114868k = 1000;
        this.f114869l = 1000;
        m4729a(attributeSet);
    }
}
