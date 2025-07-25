package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.C7392bg;
import com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.C7329IL;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C7354bX;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7465ldr;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7466zx;
import com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg;
import com.bytedance.sdk.component.adexpress.dynamic.p247IL.C7328bg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import com.bytedance.sdk.component.utils.C7739LZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx */
/* loaded from: classes3.dex */
public abstract class AbstractC7449zx extends FrameLayout implements IAnimation, ZQc, ayS {

    /* renamed from: Fy */
    private float f16110Fy;

    /* renamed from: IL */
    private float f16111IL;

    /* renamed from: Kg */
    protected int f16112Kg;

    /* renamed from: LZ */
    private C7739LZ f16113LZ;

    /* renamed from: Lq */
    protected View f16114Lq;

    /* renamed from: PX */
    protected C7464iR f16115PX;

    /* renamed from: Ta */
    protected C7457Kg f16116Ta;

    /* renamed from: VB */
    protected Context f16117VB;
    C7354bX VzQ;

    /* renamed from: WR */
    protected int f16118WR;

    /* renamed from: bX */
    protected float f16119bX;

    /* renamed from: bg */
    private float f16120bg;

    /* renamed from: eo */
    protected int f16121eo;
    protected float eqN;

    /* renamed from: iR */
    protected int f16122iR;
    protected float ldr;
    private float tuV;

    /* renamed from: vb */
    protected boolean f16123vb;
    protected C7329IL xxp;
    protected DynamicRootView yDt;

    /* renamed from: zx */
    protected float f16124zx;

    /* renamed from: tC */
    private static final View.OnTouchListener f16109tC = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener rri = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public AbstractC7449zx(Context context, DynamicRootView dynamicRootView, C7457Kg c7457Kg) {
        super(context);
        boolean z;
        this.f16117VB = context;
        this.yDt = dynamicRootView;
        this.f16116Ta = c7457Kg;
        this.f16119bX = c7457Kg.ldr();
        this.eqN = c7457Kg.m88976iR();
        this.f16124zx = c7457Kg.m88997Kg();
        this.ldr = c7457Kg.m88991WR();
        this.f16118WR = (int) C7489Kg.m88675bg(this.f16117VB, this.f16119bX);
        this.f16121eo = (int) C7489Kg.m88675bg(this.f16117VB, this.eqN);
        this.f16122iR = (int) C7489Kg.m88675bg(this.f16117VB, this.f16124zx);
        this.f16112Kg = (int) C7489Kg.m88675bg(this.f16117VB, this.ldr);
        C7464iR c7464iR = new C7464iR(c7457Kg.m88977eo());
        this.f16115PX = c7464iR;
        if (c7464iR.VzQ() > 0) {
            this.f16122iR += this.f16115PX.VzQ() * 2;
            this.f16112Kg += this.f16115PX.VzQ() * 2;
            this.f16118WR -= this.f16115PX.VzQ();
            this.f16121eo -= this.f16115PX.VzQ();
            List<C7457Kg> m88992VB = c7457Kg.m88992VB();
            if (m88992VB != null) {
                for (C7457Kg c7457Kg2 : m88992VB) {
                    c7457Kg2.m88989bX(c7457Kg2.ldr() + C7489Kg.m88680IL(this.f16117VB, this.f16115PX.VzQ()));
                    c7457Kg2.eqN(c7457Kg2.m88976iR() + C7489Kg.m88680IL(this.f16117VB, this.f16115PX.VzQ()));
                    c7457Kg2.m88986bg(C7489Kg.m88680IL(this.f16117VB, this.f16115PX.VzQ()));
                    c7457Kg2.m89000IL(C7489Kg.m88680IL(this.f16117VB, this.f16115PX.VzQ()));
                }
            }
        }
        if (this.f16115PX.yDt() > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.f16123vb = z;
        this.VzQ = new C7354bX();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IL */
    public void m89016IL(@NonNull View view) {
        C7465ldr m88755zx;
        C7457Kg c7457Kg = this.f16116Ta;
        if (c7457Kg == null || (m88755zx = c7457Kg.m88977eo().m88755zx()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(m88755zx.mLT()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Kg */
    public boolean m89014Kg() {
        C7457Kg c7457Kg = this.f16116Ta;
        if (c7457Kg != null && c7457Kg.m88977eo() != null && this.f16116Ta.m88977eo().m88755zx() != null && this.f16116Ta.m88977eo().m88755zx().m88802eK() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: bX */
    public boolean m89013bX() {
        mo89018WR();
        ldr();
        eqN();
        return true;
    }

    /* renamed from: bg */
    public void m89011bg(int i) {
        C7464iR c7464iR = this.f16115PX;
        if (c7464iR != null && c7464iR.m88896bg(i)) {
            mo89018WR();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof AbstractC7449zx)) {
                    ((AbstractC7449zx) childAt).m89011bg(i);
                }
            }
        }
    }

    protected boolean eqN() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.f16114Lq;
        if (view == null) {
            view = this;
        }
        if (mo89003zx()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = f16109tC;
            onClickListener = rri;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int m89112bg = C7328bg.m89112bg(this.f16115PX);
            if (m89112bg != 2 && m89112bg != 3) {
                view.setOnClickListener(onClickListener);
            } else {
                view.setOnClickListener(rri);
            }
        }
        m89008bg(view);
        m89016IL(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return m89005bg(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f16123vb;
    }

    public int getClickArea() {
        return this.f16115PX.m88906Uw();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public InterfaceC7468bg getDynamicClickListener() {
        return this.yDt.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.f16112Kg;
    }

    public C7465ldr getDynamicLayoutBrickValue() {
        C7466zx m88977eo;
        C7457Kg c7457Kg = this.f16116Ta;
        if (c7457Kg == null || (m88977eo = c7457Kg.m88977eo()) == null) {
            return null;
        }
        return m88977eo.m88755zx();
    }

    public int getDynamicWidth() {
        return this.f16122iR;
    }

    public String getImageObjectFit() {
        return this.f16115PX.m88888lM();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tuV;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(m89006bg(m89015IL(this.f16115PX.ZQc().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f16120bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f16111IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f16110Fy;
    }

    /* renamed from: iR */
    public void m89004iR() {
        if (m89014Kg()) {
            return;
        }
        View view = this.f16114Lq;
        if (view == null) {
            view = this;
        }
        this.xxp = new C7329IL(view, this.f16116Ta.m88977eo().m88755zx().m88802eK());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.1
            @Override // java.lang.Runnable
            public void run() {
                C7329IL c7329il = AbstractC7449zx.this.xxp;
                if (c7329il != null) {
                    c7329il.m89111bg();
                }
            }
        });
    }

    public void ldr() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f16122iR, this.f16112Kg);
        layoutParams.topMargin = this.f16121eo;
        int i = this.f16118WR;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m89004iR();
        m89012bg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mo89017IL();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.VzQ.m89097bg(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C7354bX c7354bX = this.VzQ;
        View view = this.f16114Lq;
        if (view == null) {
            view = this;
        }
        c7354bX.m89095bg(view, i, i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.tuV = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.f16120bg = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.f16111IL = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.f16123vb = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.f16110Fy = f;
        this.VzQ.m89096bg(this, f);
    }

    /* renamed from: zx */
    public boolean mo89003zx() {
        C7464iR c7464iR = this.f16115PX;
        if (c7464iR != null && c7464iR.m88906Uw() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: IL */
    private List<String> m89015IL(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && i - 1 == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    /* renamed from: bg */
    protected void m89008bg(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f16116Ta.m88997Kg());
            jSONObject.put("height", this.f16116Ta.m88991WR());
            if (C7487eqN.m88685IL()) {
                view.setTag(C7392bg.f15987Fy, this.f16115PX.LKE());
                view.setTag(C7392bg.f15990LZ, this.f16116Ta.m88977eo().m88764IL());
                view.setTag(C7392bg.f16000tC, this.f16116Ta.m88990bX());
                view.setTag(C7392bg.rri, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f16115PX.LKE());
            view.setTag(2097610715, this.f16116Ta.m88977eo().m88764IL());
            view.setTag(2097610714, this.f16116Ta.m88990bX());
            view.setTag(2097610713, jSONObject.toString());
            int m89112bg = C7328bg.m89112bg(this.f16115PX);
            if (m89112bg == 1) {
                view.setTag(2097610707, new Pair(this.f16115PX.JAA(), Long.valueOf(this.f16115PX.m88916Ja())));
                view.setTag(2097610708, Integer.valueOf(m89112bg));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: IL */
    public void mo89017IL() {
        C7329IL c7329il = this.xxp;
        if (c7329il != null) {
            c7329il.mo89017IL();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public Drawable m89005bg(boolean z, String str) {
        String[] split;
        int[] iArr;
        int DDQ;
        if (!TextUtils.isEmpty(this.f16115PX.ZQc())) {
            try {
                String ZQc = this.f16115PX.ZQc();
                String substring = ZQc.substring(ZQc.indexOf("(") + 1, ZQc.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(",")).trim(), substring.substring(substring.indexOf(",") + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{C7464iR.m88895bg(split[1]), C7464iR.m88895bg(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{C7464iR.m88895bg(split[1].substring(0, 7)), C7464iR.m88895bg(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable mo89009bg = mo89009bg(m89007bg(split[0]), iArr);
                mo89009bg.setShape(0);
                mo89009bg.setCornerRadius(C7489Kg.m88675bg(this.f16117VB, this.f16115PX.m88912Lq()));
                return mo89009bg;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float m88675bg = C7489Kg.m88675bg(this.f16117VB, this.f16115PX.m88912Lq());
        drawable.setCornerRadius(m88675bg);
        if (m88675bg < 1.0f) {
            float m88675bg2 = C7489Kg.m88675bg(this.f16117VB, this.f16115PX.aGH());
            float m88675bg3 = C7489Kg.m88675bg(this.f16117VB, this.f16115PX.m88903VW());
            float m88675bg4 = C7489Kg.m88675bg(this.f16117VB, this.f16115PX.m88904VJ());
            float m88675bg5 = C7489Kg.m88675bg(this.f16117VB, this.f16115PX.daV());
            float[] fArr = new float[8];
            if (m88675bg2 > 0.0f) {
                fArr[0] = m88675bg2;
                fArr[1] = m88675bg2;
            }
            if (m88675bg3 > 0.0f) {
                fArr[2] = m88675bg3;
                fArr[3] = m88675bg3;
            }
            if (m88675bg4 > 0.0f) {
                fArr[4] = m88675bg4;
                fArr[5] = m88675bg4;
            }
            if (m88675bg5 > 0.0f) {
                fArr[6] = m88675bg5;
                fArr[7] = m88675bg5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z) {
            DDQ = Color.parseColor(str);
        } else {
            DDQ = this.f16115PX.DDQ();
        }
        drawable.setColor(DDQ);
        if (this.f16115PX.xxp() > 0.0f) {
            drawable.setStroke((int) C7489Kg.m88675bg(this.f16117VB, this.f16115PX.xxp()), this.f16115PX.m88883vb());
            return drawable;
        } else if (this.f16115PX.VzQ() > 0) {
            drawable.setStroke(this.f16115PX.VzQ(), this.f16115PX.m88883vb());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.f16116Ta.m88977eo().m88764IL(), "video-vd")) {
                setLayerType(1, null);
                return new C7400Fy((int) m88675bg, this.f16115PX.VzQ());
            }
            return drawable;
        } else {
            return drawable;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public C7401IL mo89010bg(Bitmap bitmap) {
        return new C7426bg(bitmap, null);
    }

    /* renamed from: bg */
    private Drawable[] m89006bg(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = C7464iR.m88895bg(split[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable mo89009bg = mo89009bg(m89007bg(split[0]), iArr);
                mo89009bg.setShape(0);
                mo89009bg.setCornerRadius(C7489Kg.m88675bg(this.f16117VB, this.f16115PX.m88912Lq()));
                drawableArr[(list.size() - 1) - i] = mo89009bg;
            }
        }
        return drawableArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public GradientDrawable mo89009bg(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public GradientDrawable.Orientation m89007bg(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* renamed from: bg */
    private void m89012bg() {
        if (isShown()) {
            int m89112bg = C7328bg.m89112bg(this.f16115PX);
            if (m89112bg == 2) {
                if (this.f16113LZ == null) {
                    this.f16113LZ = new C7739LZ(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.4
                };
                C7282Ta renderRequest = this.yDt.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.m89339Lq();
                    renderRequest.m89340LZ();
                    renderRequest.tuV();
                }
            } else if (m89112bg == 3) {
                if (this.f16113LZ == null) {
                    this.f16113LZ = new C7739LZ(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx.5
                };
                C7282Ta renderRequest2 = this.yDt.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.xxp();
                    renderRequest2.m89330tC();
                    renderRequest2.VzQ();
                    renderRequest2.m89343Fy();
                }
            }
        }
    }
}
