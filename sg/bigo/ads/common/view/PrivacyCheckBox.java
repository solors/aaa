package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.C42750R;

/* loaded from: classes10.dex */
public class PrivacyCheckBox extends View {

    /* renamed from: a */
    public boolean f114756a;

    /* renamed from: b */
    private int f114757b;

    /* renamed from: c */
    private int f114758c;

    /* renamed from: d */
    private float f114759d;

    /* renamed from: e */
    private Paint f114760e;

    /* renamed from: f */
    private float f114761f;

    /* renamed from: g */
    private int f114762g;

    /* renamed from: h */
    private int f114763h;

    /* renamed from: i */
    private int f114764i;

    /* renamed from: j */
    private int f114765j;

    /* renamed from: k */
    private PorterDuffXfermode f114766k;

    /* renamed from: l */
    private float f114767l;

    /* renamed from: m */
    private C43854a f114768m;

    /* renamed from: n */
    private InterfaceC43857d f114769n;

    /* renamed from: sg.bigo.ads.common.view.PrivacyCheckBox$a */
    /* loaded from: classes10.dex */
    class C43854a {
        private C43854a() {
        }

        /* renamed from: a */
        protected void mo4756a(Canvas canvas) {
            Paint paint;
            int i;
            if (PrivacyCheckBox.this.f114756a) {
                paint = PrivacyCheckBox.this.f114760e;
                i = PrivacyCheckBox.this.f114762g;
            } else {
                paint = PrivacyCheckBox.this.f114760e;
                i = PrivacyCheckBox.this.f114763h;
            }
            paint.setColor(i);
            canvas.drawCircle(0.0f, 0.0f, PrivacyCheckBox.this.f114759d, PrivacyCheckBox.this.f114760e);
        }

        /* renamed from: b */
        protected void mo4757b(Canvas canvas) {
            Paint paint;
            int i;
            if (PrivacyCheckBox.this.f114756a) {
                paint = PrivacyCheckBox.this.f114760e;
                i = PrivacyCheckBox.this.f114764i;
            } else {
                paint = PrivacyCheckBox.this.f114760e;
                i = PrivacyCheckBox.this.f114765j;
            }
            paint.setColor(i);
            PrivacyCheckBox.this.f114760e.setStyle(Paint.Style.STROKE);
            canvas.save();
            canvas.translate(-(PrivacyCheckBox.this.f114759d / 8.0f), PrivacyCheckBox.this.f114759d / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(PrivacyCheckBox.this.f114761f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-PrivacyCheckBox.this.f114761f) / 2.0f);
            canvas.drawPath(path, PrivacyCheckBox.this.f114760e);
            canvas.restore();
        }

        /* synthetic */ C43854a(PrivacyCheckBox privacyCheckBox, byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.common.view.PrivacyCheckBox$b */
    /* loaded from: classes10.dex */
    class C43855b extends C43854a {
        private C43855b() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.C43854a
        /* renamed from: a */
        protected final void mo4756a(Canvas canvas) {
            Paint paint;
            Paint.Style style;
            if (PrivacyCheckBox.this.f114756a) {
                paint = PrivacyCheckBox.this.f114760e;
                style = Paint.Style.FILL;
            } else {
                paint = PrivacyCheckBox.this.f114760e;
                style = Paint.Style.STROKE;
            }
            paint.setStyle(style);
            super.mo4756a(canvas);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.C43854a
        /* renamed from: b */
        protected final void mo4757b(Canvas canvas) {
            if (PrivacyCheckBox.this.f114756a) {
                PrivacyCheckBox.this.f114760e.setXfermode(PrivacyCheckBox.this.f114766k);
                super.mo4757b(canvas);
                PrivacyCheckBox.this.f114760e.setXfermode(null);
            }
        }

        /* synthetic */ C43855b(PrivacyCheckBox privacyCheckBox, byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.common.view.PrivacyCheckBox$c */
    /* loaded from: classes10.dex */
    class C43856c extends C43854a {
        private C43856c() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.C43854a
        /* renamed from: a */
        protected final void mo4756a(Canvas canvas) {
            PrivacyCheckBox.this.f114760e.setStyle(Paint.Style.FILL);
            super.mo4756a(canvas);
        }

        /* synthetic */ C43856c(PrivacyCheckBox privacyCheckBox, byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.common.view.PrivacyCheckBox$d */
    /* loaded from: classes10.dex */
    public interface InterfaceC43857d {
        /* renamed from: a */
        void mo4755a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.view.PrivacyCheckBox$e */
    /* loaded from: classes10.dex */
    public class View$OnClickListenerC43858e implements View.OnClickListener {

        /* renamed from: b */
        private View.OnClickListener f114775b;

        View$OnClickListenerC43858e(View.OnClickListener onClickListener) {
            this.f114775b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PrivacyCheckBox privacyCheckBox = PrivacyCheckBox.this;
            privacyCheckBox.f114756a = !privacyCheckBox.f114756a;
            PrivacyCheckBox.this.invalidate();
            if (PrivacyCheckBox.this.f114769n != null) {
                PrivacyCheckBox.this.f114769n.mo4755a(PrivacyCheckBox.this.f114756a);
            }
            View.OnClickListener onClickListener = this.f114775b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m4770a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(80, size);
        }
        return 80;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer((-this.f114757b) / 2.0f, (-this.f114758c) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f114757b / 2, this.f114758c / 2);
        this.f114768m.mo4756a(canvas);
        this.f114768m.mo4757b(canvas);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m4770a(i), m4770a(i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f114757b = i;
        this.f114758c = i2;
        this.f114759d = (Math.min(i, i2) / 2.0f) * 0.9f;
        this.f114761f = (Math.min(this.f114757b, this.f114758c) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(InterfaceC43857d interfaceC43857d) {
        this.f114769n = interfaceC43857d;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(new View$OnClickListenerC43858e(onClickListener));
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final PrivacyCheckBox m4767a(boolean z) {
        this.f114756a = z;
        InterfaceC43857d interfaceC43857d = this.f114769n;
        if (interfaceC43857d != null) {
            interfaceC43857d.mo4755a(z);
        }
        invalidate();
        return this;
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C43854a c43856c;
        float f = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42750R.styleable.PrivacyCheckBox, i, 0);
            this.f114762g = obtainStyledAttributes.getColor(C42750R.styleable.PrivacyCheckBox_hcb_check_circle_color, -16736769);
            this.f114763h = obtainStyledAttributes.getColor(C42750R.styleable.PrivacyCheckBox_hcb_uncheck_circle_color, -1);
            this.f114764i = obtainStyledAttributes.getColor(C42750R.styleable.PrivacyCheckBox_hcb_check_hook_color, ViewCompat.MEASURED_STATE_MASK);
            this.f114765j = obtainStyledAttributes.getColor(C42750R.styleable.PrivacyCheckBox_hcb_uncheck_hook_color, -1);
            i2 = obtainStyledAttributes.getInt(C42750R.styleable.PrivacyCheckBox_hcb_style, 1);
            this.f114756a = obtainStyledAttributes.getBoolean(C42750R.styleable.PrivacyCheckBox_hcb_is_check, false);
            this.f114767l = obtainStyledAttributes.getDimension(C42750R.styleable.PrivacyCheckBox_hcb_line_width, f);
            obtainStyledAttributes.recycle();
        } else {
            this.f114762g = -16736769;
            this.f114763h = -1;
            this.f114764i = ViewCompat.MEASURED_STATE_MASK;
            this.f114765j = -1;
            this.f114767l = f;
            this.f114756a = false;
            i2 = 1;
        }
        if (i2 != 2) {
            c43856c = i2 == 1 ? new C43856c(this, (byte) 0) : c43856c;
            Paint paint = new Paint();
            this.f114760e = paint;
            paint.setAntiAlias(true);
            this.f114760e.setStyle(Paint.Style.FILL);
            this.f114760e.setColor(this.f114763h);
            this.f114760e.setStrokeWidth(this.f114767l);
            this.f114760e.setStrokeJoin(Paint.Join.ROUND);
            this.f114760e.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.f114766k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        new C43855b(this, (byte) 0);
        this.f114768m = c43856c;
        Paint paint2 = new Paint();
        this.f114760e = paint2;
        paint2.setAntiAlias(true);
        this.f114760e.setStyle(Paint.Style.FILL);
        this.f114760e.setColor(this.f114763h);
        this.f114760e.setStrokeWidth(this.f114767l);
        this.f114760e.setStrokeJoin(Paint.Join.ROUND);
        this.f114760e.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.f114766k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
