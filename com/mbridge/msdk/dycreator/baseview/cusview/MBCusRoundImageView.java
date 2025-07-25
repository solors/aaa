package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.BufferViewUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class MBCusRoundImageView extends ImageView {

    /* renamed from: a */
    private int f55681a;

    /* renamed from: b */
    private int f55682b;

    /* renamed from: c */
    private int f55683c;

    /* renamed from: d */
    private int f55684d;

    /* renamed from: e */
    private Xfermode f55685e;

    /* renamed from: f */
    private int f55686f;

    /* renamed from: g */
    private int f55687g;

    /* renamed from: h */
    private int f55688h;

    /* renamed from: i */
    private int f55689i;

    /* renamed from: j */
    private int f55690j;

    /* renamed from: k */
    private int f55691k;

    /* renamed from: l */
    private int f55692l;

    /* renamed from: m */
    private int f55693m;

    /* renamed from: n */
    private int f55694n;

    /* renamed from: o */
    private float[] f55695o;

    /* renamed from: p */
    private float[] f55696p;

    /* renamed from: q */
    private RectF f55697q;

    /* renamed from: r */
    private RectF f55698r;

    /* renamed from: s */
    private boolean f55699s;

    /* renamed from: t */
    private boolean f55700t;

    /* renamed from: u */
    private Path f55701u;

    /* renamed from: v */
    private Paint f55702v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218421 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55703a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55703a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55703a[SystemParamValue.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55703a[SystemParamValue.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55703a[SystemParamValue.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55703a[SystemParamValue.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55703a[SystemParamValue.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55703a[SystemParamValue.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55703a[SystemParamValue.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55703a[SystemParamValue.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55703a[SystemParamValue.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55703a[SystemParamValue.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55703a[SystemParamValue.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55703a[SystemParamValue.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55703a[SystemParamValue.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55703a[SystemParamValue.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55703a[SystemParamValue.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218421.f55703a[systemParamValue.ordinal()];
                if (i2 != 6) {
                    if (i2 != 13) {
                        if (i2 == 14) {
                            String attributeValue = attributeSet.getAttributeValue(i);
                            if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith("m")) {
                                if (attributeValue.startsWith("wrap")) {
                                    layoutParams.height = -2;
                                } else {
                                    layoutParams.height = MBResource.m53054a().m53047b(attributeValue);
                                }
                            } else {
                                layoutParams.height = -1;
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.width = -2;
                            } else {
                                layoutParams.width = MBResource.m53054a().m53047b(attributeValue2);
                            }
                        } else {
                            layoutParams.width = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f55697q, null, 31);
            int i = this.f55686f;
            int i2 = this.f55693m;
            int i3 = this.f55687g;
            canvas.scale(((i - (i2 * 2)) * 1.0f) / i, ((i3 - (i2 * 2)) * 1.0f) / i3, i / 2.0f, i3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f55702v;
            if (paint != null) {
                paint.reset();
                this.f55702v.setAntiAlias(true);
                this.f55702v.setStyle(Paint.Style.FILL);
                this.f55702v.setXfermode(this.f55685e);
            }
            Path path = this.f55701u;
            if (path != null) {
                path.reset();
                this.f55701u.addRoundRect(this.f55697q, this.f55696p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f55701u, this.f55702v);
            Paint paint2 = this.f55702v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f55699s) {
                int i4 = this.f55693m;
                int i5 = this.f55694n;
                RectF rectF = this.f55698r;
                float[] fArr = this.f55695o;
                try {
                    Path path2 = this.f55701u;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f55702v;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i4);
                        this.f55702v.setColor(i5);
                        this.f55702v.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f55701u;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f55701u, this.f55702v);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            SameLogTool.m51827a("MBridgeImageView", e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[Catch: Exception -> 0x00c3, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x0003, B:35:0x009b, B:37:0x009f, B:38:0x00b4, B:40:0x00b8, B:25:0x0078, B:27:0x007c, B:34:0x0098, B:24:0x0074, B:29:0x0080, B:31:0x0085, B:6:0x000e, B:8:0x0012, B:12:0x0019, B:15:0x0030, B:18:0x0047, B:21:0x005f), top: B:49:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c3, blocks: (B:3:0x0003, B:35:0x009b, B:37:0x009f, B:38:0x00b4, B:40:0x00b8, B:25:0x0078, B:27:0x007c, B:34:0x0098, B:24:0x0074, B:29:0x0080, B:31:0x0085, B:6:0x000e, B:8:0x0012, B:12:0x0019, B:15:0x0030, B:18:0x0047, B:21:0x005f), top: B:49:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView.onSizeChanged(int, int, int, int):void");
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                switch (C218421.f55703a[systemParamValue.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(attributeValue.substring(5).hashCode());
                            continue;
                        }
                    case 2:
                        MBResource.m53054a().m53050a(attributeSet.getAttributeValue(i), this);
                        continue;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                                continue;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) BufferViewUtil.f55960a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = BufferViewUtil.f55960a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                continue;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            continue;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            continue;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55684d = m53047b;
                        this.f55683c = m53047b;
                        this.f55682b = m53047b;
                        this.f55681a = m53047b;
                        setPadding(m53047b, m53047b, m53047b, m53047b);
                        continue;
                    case 9:
                        int m53047b2 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55682b = m53047b2;
                        setPadding(this.f55681a, m53047b2, this.f55683c, this.f55684d);
                        continue;
                    case 10:
                        int m53047b3 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55684d = m53047b3;
                        setPadding(this.f55681a, this.f55682b, this.f55683c, m53047b3);
                        continue;
                    case 11:
                        int m53047b4 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55681a = m53047b4;
                        setPadding(m53047b4, this.f55682b, this.f55683c, this.f55684d);
                        continue;
                    case 12:
                        int m53047b5 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55683c = m53047b5;
                        setPadding(this.f55681a, this.f55682b, m53047b5, this.f55684d);
                        continue;
                }
            }
        }
    }

    public void setBorder(int i, int i2, int i3) {
        this.f55699s = true;
        this.f55693m = i2;
        this.f55694n = i3;
        this.f55688h = i;
    }

    public void setCornerRadius(int i) {
        this.f55688h = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f55699s = true;
        this.f55700t = true;
        this.f55693m = i5;
        this.f55694n = i6;
        this.f55689i = i;
        this.f55691k = i3;
        this.f55690j = i2;
        this.f55692l = i4;
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55701u = new Path();
        this.f55702v = new Paint();
        this.f55695o = new float[8];
        this.f55696p = new float[8];
        this.f55698r = new RectF();
        this.f55697q = new RectF();
        this.f55685e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
