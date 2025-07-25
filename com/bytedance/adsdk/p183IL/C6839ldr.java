package com.bytedance.adsdk.p183IL;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.C6733IL;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.C6741bX;
import com.bytedance.adsdk.ugeno.InterfaceC7032bX;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RawRes;
import com.inmobi.commons.core.configs.CrashConfig;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.adsdk.IL.ldr */
/* loaded from: classes3.dex */
public class C6839ldr extends ImageView {

    /* renamed from: IL */
    private static final InterfaceC6685VB<Throwable> f14694IL = new InterfaceC6685VB<Throwable>() { // from class: com.bytedance.adsdk.IL.ldr.1
        @Override // com.bytedance.adsdk.p183IL.InterfaceC6685VB
        /* renamed from: bg */
        public void mo90654bg(Throwable th) {
            C6863ldr.m90609bg(th);
        }
    };

    /* renamed from: bg */
    private static final String f14695bg = "ldr";
    private InterfaceC6854IL DDQ;

    /* renamed from: Fy */
    private long f14696Fy;
    private int JAA;

    /* renamed from: Ja */
    private String f14697Ja;

    /* renamed from: Kg */
    private String f14698Kg;

    /* renamed from: LZ */
    private C6741bX f14699LZ;

    /* renamed from: Lq */
    private final Set<Object> f14700Lq;

    /* renamed from: PX */
    private boolean f14701PX;

    /* renamed from: Ta */
    private boolean f14702Ta;

    /* renamed from: Uq */
    private InterfaceC6857bg f14703Uq;

    /* renamed from: Uw */
    private final Runnable f14704Uw;

    /* renamed from: VB */
    private boolean f14705VB;
    private final Handler VzQ;
    @RawRes

    /* renamed from: WR */
    private int f14706WR;

    /* renamed from: bX */
    private final InterfaceC6685VB<C6832iR> f14707bX;

    /* renamed from: eo */
    private InterfaceC7032bX f14708eo;
    private final InterfaceC6685VB<Throwable> eqN;

    /* renamed from: iR */
    private final C6687WR f14709iR;
    private int kMt;
    private int ldr;
    private int rri;

    /* renamed from: tC */
    private int f14710tC;
    private Handler tuV;

    /* renamed from: vb */
    private C6682Ta<C6832iR> f14711vb;
    private C6832iR xxp;
    private final Set<EnumC6858eqN> yDt;

    /* renamed from: zx */
    private InterfaceC6685VB<Throwable> f14712zx;

    /* renamed from: com.bytedance.adsdk.IL.ldr$4 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C68474 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f14724bg;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f14724bg = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14724bg[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14724bg[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14724bg[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.IL.ldr$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC6854IL {
    }

    /* renamed from: com.bytedance.adsdk.IL.ldr$bX */
    /* loaded from: classes3.dex */
    public static class C6855bX extends View.BaseSavedState {
        public static final Parcelable.Creator<C6855bX> CREATOR = new Parcelable.Creator<C6855bX>() { // from class: com.bytedance.adsdk.IL.ldr.bX.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: bg */
            public C6855bX createFromParcel(Parcel parcel) {
                return new C6855bX(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: bg */
            public C6855bX[] newArray(int i) {
                return new C6855bX[i];
            }
        };

        /* renamed from: IL */
        int f14731IL;

        /* renamed from: bX */
        float f14732bX;

        /* renamed from: bg */
        String f14733bg;
        boolean eqN;

        /* renamed from: iR */
        int f14734iR;
        int ldr;

        /* renamed from: zx */
        String f14735zx;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f14733bg);
            parcel.writeFloat(this.f14732bX);
            parcel.writeInt(this.eqN ? 1 : 0);
            parcel.writeString(this.f14735zx);
            parcel.writeInt(this.ldr);
            parcel.writeInt(this.f14734iR);
        }

        C6855bX(Parcelable parcelable) {
            super(parcelable);
        }

        private C6855bX(Parcel parcel) {
            super(parcel);
            this.f14733bg = parcel.readString();
            this.f14732bX = parcel.readFloat();
            this.eqN = parcel.readInt() == 1;
            this.f14735zx = parcel.readString();
            this.ldr = parcel.readInt();
            this.f14734iR = parcel.readInt();
        }
    }

    /* renamed from: com.bytedance.adsdk.IL.ldr$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC6857bg {
    }

    /* renamed from: com.bytedance.adsdk.IL.ldr$eqN */
    /* loaded from: classes3.dex */
    public enum EnumC6858eqN {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public C6839ldr(Context context) {
        super(context);
        this.f14707bX = new InterfaceC6685VB<C6832iR>() { // from class: com.bytedance.adsdk.IL.ldr.5
            {
                C6839ldr.this = this;
            }

            @Override // com.bytedance.adsdk.p183IL.InterfaceC6685VB
            /* renamed from: bg */
            public void mo90654bg(C6832iR c6832iR) {
                C6839ldr.this.setComposition(c6832iR);
            }
        };
        this.eqN = new InterfaceC6685VB<Throwable>() { // from class: com.bytedance.adsdk.IL.ldr.6
            {
                C6839ldr.this = this;
            }

            @Override // com.bytedance.adsdk.p183IL.InterfaceC6685VB
            /* renamed from: bg */
            public void mo90654bg(Throwable th) {
                if (C6839ldr.this.ldr != 0) {
                    C6839ldr c6839ldr = C6839ldr.this;
                    c6839ldr.setImageResource(c6839ldr.ldr);
                }
                (C6839ldr.this.f14712zx == null ? C6839ldr.f14694IL : C6839ldr.this.f14712zx).mo90654bg(th);
            }
        };
        this.ldr = 0;
        this.f14709iR = new C6687WR();
        this.f14705VB = false;
        this.f14701PX = false;
        this.f14702Ta = true;
        this.yDt = new HashSet();
        this.f14700Lq = new HashSet();
        this.VzQ = new Handler(Looper.getMainLooper());
        this.f14696Fy = 0L;
        this.f14704Uw = new Runnable() { // from class: com.bytedance.adsdk.IL.ldr.3
            {
                C6839ldr.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + C6839ldr.this.f14710tC + ", " + C6839ldr.this.rri);
                if (C6839ldr.this.f14710tC > C6839ldr.this.rri) {
                    C6839ldr.m90700Lq(C6839ldr.this);
                    C6741bX c6741bX = C6839ldr.this.f14699LZ;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C6839ldr.this.f14710tC);
                    c6741bX.m90958bg(sb2.toString());
                    C6839ldr.this.invalidate();
                    C6839ldr.this.m90701Lq();
                    return;
                }
                if (C6839ldr.this.kMt >= 0 && C6839ldr.this.JAA >= 0) {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + C6839ldr.this.kMt);
                    C6839ldr.this.m90687bg();
                    C6839ldr c6839ldr = C6839ldr.this;
                    c6839ldr.setFrame(c6839ldr.kMt);
                    C6839ldr.this.m90683bg(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.3.1
                        {
                            RunnableC68453.this = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (C6839ldr.this.getFrame() >= C6839ldr.this.JAA - 1 && C6839ldr.this.getFrame() < C6839ldr.this.JAA + 2) {
                                Log.i("TMe", "--==--- timer end, play anim, endframe: " + C6839ldr.this.JAA);
                                C6839ldr.this.m90708IL(this);
                                C6839ldr.this.ldr();
                            }
                        }
                    });
                } else {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + C6839ldr.this.kMt + "," + C6839ldr.this.JAA);
                }
                if (!TextUtils.isEmpty(C6839ldr.this.f14697Ja) && C6839ldr.this.DDQ != null) {
                    InterfaceC6854IL unused = C6839ldr.this.DDQ;
                    String unused2 = C6839ldr.this.f14697Ja;
                }
            }
        };
        m90703Kg();
    }

    /* renamed from: Lq */
    static /* synthetic */ int m90700Lq(C6839ldr c6839ldr) {
        int i = c6839ldr.f14710tC;
        c6839ldr.f14710tC = i - 1;
        return i;
    }

    public C6832iR.C6835bg getGlobalConfig() {
        C6832iR kMt;
        C6687WR c6687wr = this.f14709iR;
        if (c6687wr != null && (kMt = c6687wr.kMt()) != null) {
            return kMt.m90737VB();
        }
        return null;
    }

    private C6832iR.C6833IL getGlobalEvent() {
        C6832iR kMt;
        C6687WR c6687wr = this.f14709iR;
        if (c6687wr != null && (kMt = c6687wr.kMt()) != null) {
            return kMt.m90726eo();
        }
        return null;
    }

    public String getPlayDelayedELExpressTimeS() {
        C6832iR kMt;
        C6687WR c6687wr = this.f14709iR;
        if (c6687wr != null && (kMt = c6687wr.kMt()) != null) {
            return kMt.m90736WR();
        }
        return null;
    }

    private void setCompositionTask(C6682Ta<C6832iR> c6682Ta) {
        this.yDt.add(EnumC6858eqN.SET_ANIMATION);
        xxp();
        m90697Ta();
        this.f14711vb = c6682Ta.m91147bg(this.f14707bX).m91154bX(this.eqN);
    }

    public boolean getClipToCompositionBounds() {
        return this.f14709iR.m91142IL();
    }

    public C6832iR getComposition() {
        return this.xxp;
    }

    public long getDuration() {
        C6832iR c6832iR = this.xxp;
        if (c6832iR != null) {
            return c6832iR.m90723zx();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f14709iR.xxp();
    }

    public String getImageAssetsFolder() {
        return this.f14709iR.m91120bX();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f14709iR.eqN();
    }

    public float getMaxFrame() {
        return this.f14709iR.m91127Ta();
    }

    public float getMinFrame() {
        return this.f14709iR.m91128PX();
    }

    public C6869tuV getPerformanceTracker() {
        return this.f14709iR.ldr();
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getProgress() {
        return this.f14709iR.m91125Uw();
    }

    public EnumC6664Fy getRenderMode() {
        return this.f14709iR.m91084zx();
    }

    public int getRepeatCount() {
        return this.f14709iR.tuV();
    }

    public int getRepeatMode() {
        return this.f14709iR.VzQ();
    }

    public float getSpeed() {
        return this.f14709iR.yDt();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C6687WR) && ((C6687WR) drawable).m91084zx() == EnumC6664Fy.SOFTWARE) {
            this.f14709iR.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C6687WR c6687wr = this.f14709iR;
        if (drawable2 == c6687wr) {
            super.invalidateDrawable(c6687wr);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f14701PX) {
            this.f14709iR.m91121WR();
        }
        InterfaceC7032bX interfaceC7032bX = this.f14708eo;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90223iR();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m90662vb();
        Handler handler = this.tuV;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m90691bX();
        m90710IL();
        InterfaceC7032bX interfaceC7032bX = this.f14708eo;
        if (interfaceC7032bX != null) {
            interfaceC7032bX.mo90228Kg();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C6855bX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6855bX c6855bX = (C6855bX) parcelable;
        super.onRestoreInstanceState(c6855bX.getSuperState());
        this.f14698Kg = c6855bX.f14733bg;
        Set<EnumC6858eqN> set = this.yDt;
        EnumC6858eqN enumC6858eqN = EnumC6858eqN.SET_ANIMATION;
        if (!set.contains(enumC6858eqN) && !TextUtils.isEmpty(this.f14698Kg)) {
            setAnimation(this.f14698Kg);
        }
        this.f14706WR = c6855bX.f14731IL;
        if (!this.yDt.contains(enumC6858eqN) && (i = this.f14706WR) != 0) {
            setAnimation(i);
        }
        if (!this.yDt.contains(EnumC6858eqN.SET_PROGRESS)) {
            m90686bg(c6855bX.f14732bX, false);
        }
        if (!this.yDt.contains(EnumC6858eqN.PLAY_OPTION) && c6855bX.eqN) {
            m90687bg();
        }
        if (!this.yDt.contains(EnumC6858eqN.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(c6855bX.f14735zx);
        }
        if (!this.yDt.contains(EnumC6858eqN.SET_REPEAT_MODE)) {
            setRepeatMode(c6855bX.ldr);
        }
        if (!this.yDt.contains(EnumC6858eqN.SET_REPEAT_COUNT)) {
            setRepeatCount(c6855bX.f14734iR);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C6855bX c6855bX = new C6855bX(super.onSaveInstanceState());
        c6855bX.f14733bg = this.f14698Kg;
        c6855bX.f14731IL = this.f14706WR;
        c6855bX.f14732bX = this.f14709iR.m91125Uw();
        c6855bX.eqN = this.f14709iR.m91130LZ();
        c6855bX.f14735zx = this.f14709iR.m91120bX();
        c6855bX.ldr = this.f14709iR.VzQ();
        c6855bX.f14734iR = this.f14709iR.tuV();
        return c6855bX;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        AbstractC6742bg m90706IL = m90706IL(motionEvent);
        boolean z = true;
        if (m90706IL != null) {
            String m90947WR = m90706IL.m90947WR();
            if (m90706IL instanceof C6733IL) {
                if (getGlobalConfig() != null && getGlobalConfig().f14678bg == 1) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (m90947WR != null && m90947WR.startsWith("CSJCLOSE")) {
                m90662vb();
            }
            C6821eo m90672bg = m90672bg(m90706IL.m90928zx());
            if (m90672bg != null && motionEvent.getAction() == 1) {
                if (TextUtils.isEmpty(m90672bg.m90763zx()) && m90947WR != null && !m90947WR.endsWith("CSJNO")) {
                    m90680bg(motionEvent);
                }
                int[][] ldr = m90672bg.ldr();
                if (ldr != null) {
                    m90667bg(ldr);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f14670IL) != null) {
                    m90667bg(iArr);
                }
            }
            if (m90947WR == null || !m90947WR.startsWith("CSJNTP")) {
                z = false;
            }
            if (z) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        } else if (getGlobalConfig() != null && getGlobalConfig().f14678bg == 1) {
            return false;
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setAnimation(@RawRes int i) {
        this.f14706WR = i;
        this.f14698Kg = null;
        setCompositionTask(m90685bg(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m90670bg(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        C6682Ta<C6832iR> m91183bg;
        if (this.f14702Ta) {
            m91183bg = C6669Kg.m91184bg(getContext(), str);
        } else {
            m91183bg = C6669Kg.m91183bg(getContext(), str, (String) null);
        }
        setCompositionTask(m91183bg);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f14709iR.m91081zx(z);
    }

    public void setCacheComposition(boolean z) {
        this.f14702Ta = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f14709iR.m91092bg(z);
    }

    public void setComposition(C6832iR c6832iR) {
        if (C6873zx.f14778bg) {
            Log.v(f14695bg, "Set Composition \n".concat(String.valueOf(c6832iR)));
        }
        this.f14709iR.setCallback(this);
        this.xxp = c6832iR;
        this.f14705VB = true;
        boolean m91097bg = this.f14709iR.m91097bg(c6832iR, getContext().getApplicationContext());
        this.f14705VB = false;
        if (getDrawable() == this.f14709iR && !m91097bg) {
            return;
        }
        if (!m91097bg) {
            VzQ();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<Object> it = this.f14700Lq.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f14709iR.m91088iR(str);
    }

    public void setFailureListener(InterfaceC6685VB<Throwable> interfaceC6685VB) {
        this.f14712zx = interfaceC6685VB;
    }

    public void setFallbackResource(int i) {
        this.ldr = i;
    }

    public void setFontAssetDelegate(C6703bX c6703bX) {
        this.f14709iR.m91099bg(c6703bX);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f14709iR.m91093bg(map);
    }

    public void setFrame(int i) {
        this.f14709iR.m91118bX(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f14709iR.m91087iR(z);
    }

    public void setImageAssetDelegate(InterfaceC6823eqN interfaceC6823eqN) {
        this.f14709iR.m91098bg(interfaceC6823eqN);
    }

    public void setImageAssetsFolder(String str) {
        this.f14709iR.m91095bg(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m90697Ta();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m90697Ta();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        m90697Ta();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(InterfaceC6857bg interfaceC6857bg) {
        this.f14703Uq = interfaceC6857bg;
    }

    public void setLottieClicklistener(InterfaceC6854IL interfaceC6854IL) {
        this.DDQ = interfaceC6854IL;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f14709iR.m91134IL(z);
    }

    public void setMaxFrame(int i) {
        this.f14709iR.m91140IL(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f14709iR.m91141IL(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f14709iR.eqN(str);
    }

    public void setMinFrame(int i) {
        this.f14709iR.m91113bg(i);
    }

    public void setMinProgress(float f) {
        this.f14709iR.m91114bg(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f14709iR.eqN(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f14709iR.m91116bX(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        m90686bg(f, true);
    }

    public void setRenderMode(EnumC6664Fy enumC6664Fy) {
        this.f14709iR.m91103bg(enumC6664Fy);
    }

    public void setRepeatCount(int i) {
        this.yDt.add(EnumC6858eqN.SET_REPEAT_COUNT);
        this.f14709iR.m91083zx(i);
    }

    public void setRepeatMode(int i) {
        this.yDt.add(EnumC6858eqN.SET_REPEAT_MODE);
        this.f14709iR.eqN(i);
    }

    public void setSafeMode(boolean z) {
        this.f14709iR.ldr(z);
    }

    public void setSpeed(float f) {
        this.f14709iR.m91119bX(f);
    }

    public void setTextDelegate(C6677LZ c6677lz) {
        this.f14709iR.m91102bg(c6677lz);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f14709iR.m91131Kg(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C6687WR c6687wr;
        if (!this.f14705VB && drawable == (c6687wr = this.f14709iR) && c6687wr.m91143Fy()) {
            ldr();
        } else if (!this.f14705VB && (drawable instanceof C6687WR)) {
            C6687WR c6687wr2 = (C6687WR) drawable;
            if (c6687wr2.m91143Fy()) {
                c6687wr2.m91133Ja();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: IL */
    private AbstractC6742bg m90706IL(MotionEvent motionEvent) {
        C6733IL m91115bg;
        C6687WR c6687wr = this.f14709iR;
        if (c6687wr == null || (m91115bg = c6687wr.m91115bg()) == null) {
            return null;
        }
        return m90678bg(m91115bg, motionEvent);
    }

    /* renamed from: Kg */
    private void m90703Kg() {
        setSaveEnabled(false);
        this.f14702Ta = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        m90686bg(0.0f, false);
        m90668bg(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.f14709iR.m91096bg(Boolean.valueOf(C6863ldr.m90618bg(getContext()) != 0.0f));
        m90693WR();
        m90666eo();
        m90699PX();
    }

    /* renamed from: Lq */
    public void m90701Lq() {
        this.VzQ.postDelayed(this.f14704Uw, 1000L);
    }

    /* renamed from: PX */
    private void m90699PX() {
        m90684bg(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.IL.ldr.9
            {
                C6839ldr.this = this;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C6677LZ m91086tC;
                C6839ldr.this.m90709IL(this);
                String playDelayedELExpressTimeS = C6839ldr.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (m91086tC = C6839ldr.this.f14709iR.m91086tC()) != null) {
                    try {
                        int parseInt = Integer.parseInt(m91086tC.m91165bg(playDelayedELExpressTimeS)) * 1000;
                        if (C6839ldr.this.f14696Fy > 0) {
                            long elapsedRealtime = (C6839ldr.this.f14696Fy + parseInt) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(elapsedRealtime)));
                            if (elapsedRealtime > 0) {
                                C6839ldr.this.ldr();
                                C6839ldr.this.setVisibility(8);
                                if (C6839ldr.this.tuV == null) {
                                    C6839ldr.this.tuV = new Handler(Looper.getMainLooper());
                                }
                                C6839ldr.this.tuV.removeCallbacksAndMessages(null);
                                C6839ldr.this.tuV.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.IL.ldr.9.1
                                    {
                                        C68529.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        C6839ldr.this.setVisibility(0);
                                        C6839ldr.this.m90687bg();
                                        C6839ldr.this.m90695VB();
                                    }
                                }, elapsedRealtime);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                C6839ldr.this.m90695VB();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    /* renamed from: Ta */
    private void m90697Ta() {
        C6682Ta<C6832iR> c6682Ta = this.f14711vb;
        if (c6682Ta != null) {
            c6682Ta.m91155IL(this.f14707bX);
            this.f14711vb.eqN(this.eqN);
        }
    }

    /* renamed from: VB */
    public void m90695VB() {
        Map<String, Object> map;
        C6832iR.C6835bg globalConfig = getGlobalConfig();
        if (globalConfig == null || (map = globalConfig.f14676IL) == null) {
            return;
        }
        map.isEmpty();
    }

    private void VzQ() {
        boolean eqN = eqN();
        setImageDrawable(null);
        setImageDrawable(this.f14709iR);
        if (eqN) {
            this.f14709iR.m91124VB();
        }
    }

    /* renamed from: WR */
    private void m90693WR() {
        m90684bg(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.IL.ldr.7
            {
                C6839ldr.this = this;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C6839ldr.this.m90709IL(this);
                C6839ldr.this.yDt();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
    }

    /* renamed from: bX */
    private void m90690bX(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    /* renamed from: eo */
    private void m90666eo() {
        m90683bg(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.8
            {
                C6839ldr.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Map<String, Object> map;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && ((Float) animatedValue).floatValue() >= 0.98f) {
                    C6839ldr.this.m90708IL(this);
                    C6832iR.C6835bg globalConfig = C6839ldr.this.getGlobalConfig();
                    if (globalConfig != null && (map = globalConfig.f14677bX) != null && !map.isEmpty() && C6839ldr.this.f14703Uq != null) {
                        InterfaceC6857bg unused = C6839ldr.this.f14703Uq;
                    }
                }
            }
        });
    }

    private void eqN(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            }
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        } else if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    /* renamed from: vb */
    private void m90662vb() {
        this.VzQ.removeCallbacksAndMessages(null);
    }

    private void xxp() {
        this.xxp = null;
        this.f14709iR.m91132Kg();
    }

    public void yDt() {
        C6687WR c6687wr;
        int i;
        int i2;
        final int i3;
        if (this.xxp == null || (c6687wr = this.f14709iR) == null) {
            return;
        }
        C6677LZ m91086tC = c6687wr.m91086tC();
        C6832iR.C6834bX m90741Kg = this.xxp.m90741Kg();
        if (m90741Kg == null || m91086tC == null) {
            return;
        }
        final int i4 = m90741Kg.f14674bg;
        if (i4 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4)));
            return;
        }
        int[] iArr = m90741Kg.f14675zx;
        final int i5 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i2 = iArr[0];
            i = iArr[1];
        }
        String m91165bg = m91086tC.m91165bg(m90741Kg.f14673bX);
        String m91165bg2 = m91086tC.m91165bg(m90741Kg.eqN);
        try {
            i3 = Integer.parseInt(m91165bg);
            try {
                i5 = Integer.parseInt(m91165bg2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        if (!TextUtils.isEmpty(m90741Kg.f14672IL)) {
            Log.i("TMe", "--==--- timer, id:" + m90741Kg.f14672IL);
            C6741bX m90688bX = m90688bX(m90741Kg.f14672IL);
            if (m90688bX != null) {
                Log.i("TMe", "--==--- timer success");
                this.f14697Ja = m90741Kg.ldr;
                this.f14699LZ = m90688bX;
                this.f14710tC = i3;
                this.rri = i3 - i5;
                this.kMt = i2;
                this.JAA = i;
                m90683bg(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.2
                    {
                        C6839ldr.this = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (C6839ldr.this.getFrame() >= i4 - 1 && C6839ldr.this.getFrame() < i4 + 2) {
                            Log.i("TMe", "--==--- enter timer point, frame: " + C6839ldr.this.getFrame());
                            C6839ldr.this.m90708IL(this);
                            if (i3 >= 0 && i5 >= 0) {
                                Log.i("TMe", "--==--- enter timer callback, start timer");
                                C6839ldr.this.m90701Lq();
                            } else {
                                Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                            }
                            C6839ldr.this.ldr();
                        }
                    }
                });
                return;
            }
            return;
        }
        Log.i("TMe", "--==--- timer fail, id is invalid: " + m90741Kg.f14672IL);
    }

    @MainThread
    public void ldr() {
        this.f14701PX = false;
        this.f14709iR.m91133Ja();
    }

    public void setMaxFrame(String str) {
        this.f14709iR.m91117bX(str);
    }

    public void setMinFrame(String str) {
        this.f14709iR.m91135IL(str);
    }

    @MainThread
    /* renamed from: zx */
    public void m90660zx() {
        this.yDt.add(EnumC6858eqN.PLAY_OPTION);
        this.f14709iR.JAA();
    }

    /* renamed from: bX */
    private C6741bX m90688bX(String str) {
        C6733IL m91115bg;
        C6687WR c6687wr = this.f14709iR;
        if (c6687wr == null || (m91115bg = c6687wr.m91115bg()) == null) {
            return null;
        }
        return m90677bg(m91115bg, str);
    }

    /* renamed from: bg */
    public void m90674bg(InterfaceC7032bX interfaceC7032bX) {
        this.f14708eo = interfaceC7032bX;
    }

    /* renamed from: bg */
    private C6821eo m90672bg(String str) {
        C6687WR c6687wr;
        C6832iR kMt;
        Map<String, C6821eo> m90724vb;
        if (TextUtils.isEmpty(str) || (c6687wr = this.f14709iR) == null || (kMt = c6687wr.kMt()) == null || (m90724vb = kMt.m90724vb()) == null) {
            return null;
        }
        return m90724vb.get(str);
    }

    public void setAnimation(String str) {
        this.f14698Kg = str;
        this.f14706WR = 0;
        setCompositionTask(m90704IL(str));
    }

    /* renamed from: IL */
    private void m90707IL(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
        } else if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    /* renamed from: bX */
    public void m90691bX() {
        this.f14709iR.m91085vb();
    }

    /* renamed from: bg */
    private void m90667bg(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            m90662vb();
            m90687bg();
            setFrame(i);
            m90683bg(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.IL.ldr.10
                {
                    C6839ldr.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C6839ldr.this.getFrame() >= i2 - 1 && C6839ldr.this.getFrame() < i2 + 2) {
                        Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + C6839ldr.this.getFrame());
                        C6839ldr.this.m90708IL(this);
                        C6839ldr.this.ldr();
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    private C6682Ta<C6832iR> m90704IL(final String str) {
        if (isInEditMode()) {
            return new C6682Ta<>(new Callable<C6681PX<C6832iR>>() { // from class: com.bytedance.adsdk.IL.ldr.12
                {
                    C6839ldr.this = this;
                }

                @Override // java.util.concurrent.Callable
                /* renamed from: bg */
                public C6681PX<C6832iR> call() throws Exception {
                    if (C6839ldr.this.f14702Ta) {
                        return C6669Kg.m91190bX(C6839ldr.this.getContext(), str);
                    }
                    return C6669Kg.m91189bX(C6839ldr.this.getContext(), str, null);
                }
            }, true);
        }
        return this.f14702Ta ? C6669Kg.m91196IL(getContext(), str) : C6669Kg.m91195IL(getContext(), str, (String) null);
    }

    public boolean eqN() {
        return this.f14709iR.m91143Fy();
    }

    /* renamed from: IL */
    public void m90708IL(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14709iR.m91137IL(animatorUpdateListener);
    }

    /* renamed from: IL */
    public void m90710IL() {
        this.f14709iR.m91129Lq();
    }

    /* renamed from: IL */
    public void m90709IL(Animator.AnimatorListener animatorListener) {
        this.f14709iR.m91138IL(animatorListener);
    }

    /* renamed from: bg */
    private boolean m90680bg(MotionEvent motionEvent) {
        C6832iR.C6833IL globalEvent = getGlobalEvent();
        return (globalEvent == null || TextUtils.isEmpty(globalEvent.f14671bg)) ? false : true;
    }

    /* renamed from: bg */
    private AbstractC6742bg m90678bg(C6733IL c6733il, MotionEvent motionEvent) {
        AbstractC6742bg m90678bg;
        for (AbstractC6742bg abstractC6742bg : c6733il.m90983PX()) {
            if (abstractC6742bg instanceof C6733IL) {
                if (abstractC6742bg.m90951Kg() && abstractC6742bg.ldr() > 0.0f) {
                    RectF rectF = new RectF();
                    abstractC6742bg.mo90772bg(rectF, abstractC6742bg.eqN(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (m90678bg = m90678bg((C6733IL) abstractC6742bg, motionEvent)) != null) {
                        return m90678bg;
                    }
                }
            } else if (abstractC6742bg.m90951Kg() && abstractC6742bg.ldr() > 0.0f) {
                RectF rectF2 = new RectF();
                abstractC6742bg.mo90772bg(rectF2, abstractC6742bg.eqN(), true);
                RectF rectF3 = new RectF();
                m90681bg(rectF3, rectF2);
                if (m90679bg(motionEvent, rectF3)) {
                    return abstractC6742bg;
                }
            }
        }
        return null;
    }

    /* renamed from: bg */
    private boolean m90679bg(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bg */
    private void m90681bg(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.f14709iR.getBounds().width();
        float height2 = this.f14709iR.getBounds().height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = C68474.f14724bg[getScaleType().ordinal()];
        if (i == 1) {
            m90682bg(matrix, width, height, width2, height2);
        } else if (i == 2) {
            m90707IL(matrix, width, height, width2, height2);
        } else if (i == 3) {
            m90690bX(matrix, width, height, width2, height2);
        } else if (i == 4) {
            eqN(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF, rectF2);
    }

    /* renamed from: bg */
    private void m90682bg(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
            return;
        }
        float f6 = f / f3;
        matrix.preScale(f6, f6);
        matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
    }

    /* renamed from: bg */
    public void m90668bg(boolean z, Context context) {
        this.f14709iR.m91091bg(z, context);
    }

    /* renamed from: bg */
    private C6682Ta<C6832iR> m90685bg(@RawRes final int i) {
        if (isInEditMode()) {
            return new C6682Ta<>(new Callable<C6681PX<C6832iR>>() { // from class: com.bytedance.adsdk.IL.ldr.11
                {
                    C6839ldr.this = this;
                }

                @Override // java.util.concurrent.Callable
                /* renamed from: bg */
                public C6681PX<C6832iR> call() throws Exception {
                    if (C6839ldr.this.f14702Ta) {
                        return C6669Kg.m91198IL(C6839ldr.this.getContext(), i);
                    }
                    return C6669Kg.m91197IL(C6839ldr.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.f14702Ta ? C6669Kg.m91186bg(getContext(), i) : C6669Kg.m91185bg(getContext(), i, (String) null);
    }

    /* renamed from: bg */
    public void m90670bg(String str, String str2) {
        m90673bg(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* renamed from: bg */
    public void m90673bg(InputStream inputStream, String str) {
        setCompositionTask(C6669Kg.m91177bg(inputStream, str));
    }

    /* renamed from: bg */
    private C6741bX m90677bg(C6733IL c6733il, String str) {
        for (AbstractC6742bg abstractC6742bg : c6733il.m90983PX()) {
            if (abstractC6742bg instanceof C6733IL) {
                C6741bX m90677bg = m90677bg((C6733IL) abstractC6742bg, str);
                if (m90677bg != null) {
                    return m90677bg;
                }
            } else if (TextUtils.equals(str, abstractC6742bg.m90947WR()) && (abstractC6742bg instanceof C6741bX)) {
                return (C6741bX) abstractC6742bg;
            }
        }
        return null;
    }

    @MainThread
    /* renamed from: bg */
    public void m90687bg() {
        this.yDt.add(EnumC6858eqN.PLAY_OPTION);
        this.f14709iR.m91121WR();
        if (this.f14696Fy == 0) {
            this.f14696Fy = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: bg */
    public void m90683bg(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14709iR.m91110bg(animatorUpdateListener);
    }

    /* renamed from: bg */
    public void m90684bg(Animator.AnimatorListener animatorListener) {
        this.f14709iR.m91111bg(animatorListener);
    }

    @Deprecated
    /* renamed from: bg */
    public void m90669bg(boolean z) {
        this.f14709iR.m91083zx(z ? -1 : 0);
    }

    /* renamed from: bg */
    public Bitmap m90671bg(String str, Bitmap bitmap) {
        return this.f14709iR.m91094bg(str, bitmap);
    }

    /* renamed from: bg */
    private void m90686bg(@FloatRange(from = 0.0d, to = 1.0d) float f, boolean z) {
        if (z) {
            this.yDt.add(EnumC6858eqN.SET_PROGRESS);
        }
        this.f14709iR.eqN(f);
    }
}
