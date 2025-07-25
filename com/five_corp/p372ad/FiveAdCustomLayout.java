package com.five_corp.p372ad;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.five_corp.p372ad.internal.C13617C;
import com.five_corp.p372ad.internal.C13618D;
import com.five_corp.p372ad.internal.C13769d;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.InterfaceC14066q;
import com.five_corp.p372ad.internal.adselector.InterfaceC13701c;
import com.five_corp.p372ad.internal.context.C13757f;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.context.EnumC13756e;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13643d;
import com.five_corp.p372ad.internal.soundstate.C14071c;
import com.five_corp.p372ad.internal.view.C14137g;

/* renamed from: com.five_corp.ad.FiveAdCustomLayout */
/* loaded from: classes4.dex */
public class FiveAdCustomLayout extends FrameLayout implements FiveAdInterface, InterfaceC13701c, InterfaceC13608c {

    /* renamed from: o */
    public static final String f24995o = FiveAdCustomLayout.class.toString();

    /* renamed from: a */
    public String f24996a;

    /* renamed from: b */
    public final Context f24997b;

    /* renamed from: c */
    public final C13614i f24998c;

    /* renamed from: d */
    public final C13757f f24999d;

    /* renamed from: e */
    public final C13618D f25000e;

    /* renamed from: f */
    public final C14071c f25001f;

    /* renamed from: g */
    public final FrameLayout f25002g;

    /* renamed from: h */
    public final C13836a f25003h;

    /* renamed from: i */
    public final Object f25004i;

    /* renamed from: j */
    public FiveAdState f25005j;

    /* renamed from: k */
    public C13611f f25006k;

    /* renamed from: l */
    public C13617C f25007l;

    /* renamed from: m */
    public final int f25008m;

    /* renamed from: n */
    public boolean f25009n;

    public FiveAdCustomLayout(Context context) {
        super(context);
        this.f24996a = null;
        this.f25004i = new Object();
        this.f25009n = false;
        throw new IllegalArgumentException("please use other constructor.");
    }

    @Nullable
    private C13611f getAdController() {
        C13611f c13611f;
        synchronized (this.f25004i) {
            c13611f = this.f25006k;
        }
        return c13611f;
    }

    @Nullable
    private C13643d getCustomLayoutConfig() {
        C14137g c14137g;
        C13611f adController = getAdController();
        if (adController == null || (c14137g = adController.f25064c) == null) {
            return null;
        }
        return c14137g.getCustomLayoutConfig();
    }

    @Nullable
    private C13760i getLoadedContext() {
        C13611f adController = getAdController();
        if (adController != null) {
            return adController.f25073l;
        }
        return null;
    }

    /* renamed from: a */
    public final void m78560a(int i, int i2) {
        C13643d customLayoutConfig = getCustomLayoutConfig();
        if (customLayoutConfig == null) {
            return;
        }
        if (customLayoutConfig.f25290a * i2 < customLayoutConfig.f25291b * i) {
            this.f25002g.setLayoutParams(new FrameLayout.LayoutParams((customLayoutConfig.f25290a * i2) / customLayoutConfig.f25291b, i2, 17));
        } else {
            this.f25002g.setLayoutParams(new FrameLayout.LayoutParams(i, (customLayoutConfig.f25291b * i) / customLayoutConfig.f25290a, 17));
        }
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f25001f.m78131a(z);
    }

    @NonNull
    public String getAdvertiserName() {
        String str;
        C13760i loadedContext = getLoadedContext();
        if (loadedContext != null && (str = loadedContext.f25591b.f25202t) != null) {
            return str;
        }
        return "";
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        C13611f adController = getAdController();
        if (adController != null) {
            return adController.f25073l.f25591b.f25184b;
        }
        return CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.f24996a;
    }

    public int getLogicalHeight() {
        if (this.f25009n) {
            return getHeight();
        }
        int i = this.f25008m;
        C13643d customLayoutConfig = getCustomLayoutConfig();
        if (getState() == FiveAdState.LOADED && customLayoutConfig != null) {
            return (i * customLayoutConfig.f25291b) / customLayoutConfig.f25290a;
        }
        return 0;
    }

    public int getLogicalWidth() {
        if (this.f25009n) {
            return getWidth();
        }
        return this.f25008m;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.f24999d.f25586c;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    @Deprecated
    public FiveAdState getState() {
        FiveAdState fiveAdState;
        synchronized (this.f25004i) {
            fiveAdState = this.f25005j;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f25001f.m78134a().m78135a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.f25004i) {
            if (this.f25005j == FiveAdState.NOT_LOADED && this.f25007l != null) {
                this.f25005j = FiveAdState.LOADING;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f24998c.f25102m.m78438a(this.f24999d, EnumC13756e.CUSTOM_LAYOUT, this.f25001f.m78134a(), this);
            return;
        }
        C13618D c13618d = this.f25000e;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) c13618d.f25135b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(c13618d.f25134a, fiveAdErrorCode);
        }
        Log.e(f24995o, "Invalid state, loadAdAsync is ignored.");
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerClose() {
        synchronized (this.f25004i) {
            this.f25006k = null;
            this.f25005j = FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerError() {
        synchronized (this.f25004i) {
            this.f25005j = FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onAdSuccessfullySelected(@NonNull C13760i c13760i) {
        C13617C c13617c;
        synchronized (this.f25004i) {
            c13617c = this.f25007l;
            this.f25007l = null;
        }
        C13611f c13611f = new C13611f(this.f24997b, this.f24998c, this.f25002g, this.f25000e, this.f25001f, c13760i, this);
        synchronized (this.f25004i) {
            this.f25006k = c13611f;
            this.f25005j = FiveAdState.LOADED;
        }
        if (c13617c != null) {
            c13617c.m78490b(c13760i);
        } else {
            this.f25003h.m78270a("notifyLoad failed @ FiveAdInterstitial.onAdSuccessfullySelected");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25009n = true;
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onFailureToSelectAd(@NonNull C14068s c14068s) {
        C13617C c13617c;
        synchronized (this.f25004i) {
            c13617c = this.f25007l;
            this.f25007l = null;
            this.f25005j = FiveAdState.ERROR;
        }
        if (c13617c != null) {
            c13617c.m78491b(this.f24999d, EnumC13756e.CUSTOM_LAYOUT, c14068s);
        } else {
            this.f25003h.m78270a("notifyLoadError failed @ FiveAdInterstitial.onFailureToSelectAd");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        try {
            i3 = this.f25008m;
            i4 = 0;
        } catch (Throwable th) {
            this.f25003h.m78269a(th);
        }
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int i5 = this.f25008m;
            C13643d customLayoutConfig = getCustomLayoutConfig();
            if (getState() == FiveAdState.LOADED && customLayoutConfig != null) {
                i4 = (i5 * customLayoutConfig.f25291b) / customLayoutConfig.f25290a;
            }
        } else {
            if (View.MeasureSpec.getMode(i) == 0) {
                int size = View.MeasureSpec.getSize(i2);
                C13643d customLayoutConfig2 = getCustomLayoutConfig();
                if (getState() == FiveAdState.LOADED && customLayoutConfig2 != null) {
                    i4 = (size * customLayoutConfig2.f25290a) / customLayoutConfig2.f25291b;
                }
                i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (View.MeasureSpec.getMode(i2) == 0) {
                int size2 = View.MeasureSpec.getSize(i);
                C13643d customLayoutConfig3 = getCustomLayoutConfig();
                if (getState() == FiveAdState.LOADED && customLayoutConfig3 != null) {
                    i4 = (size2 * customLayoutConfig3.f25291b) / customLayoutConfig3.f25290a;
                }
            }
            m78560a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            super.onMeasure(i, i2);
        }
        i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        m78560a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public void setEventListener(@NonNull FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener) {
        C13618D c13618d = this.f25000e;
        c13618d.f25137d.set(new C13769d(fiveAdCustomLayoutEventListener, this));
        C13618D c13618d2 = this.f25000e;
        c13618d2.f25139f.set(InterfaceC14066q.m78142a(fiveAdCustomLayoutEventListener, this));
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.f24996a = str;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener) {
        this.f25000e.f25135b.set(fiveAdLoadListener);
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Deprecated
    public void setViewEventListener(@NonNull FiveAdViewEventListener fiveAdViewEventListener) {
        this.f25000e.f25136c.set(fiveAdViewEventListener);
    }

    public FiveAdCustomLayout(Context context, C13614i c13614i, C13760i c13760i) {
        super(context);
        this.f24996a = null;
        this.f25004i = new Object();
        this.f25009n = false;
        this.f24998c = c13614i;
        this.f24997b = context;
        this.f24999d = c13760i.f25596g;
        C13618D c13618d = new C13618D(this);
        this.f25000e = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25001f = c14071c;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25002g = frameLayout;
        this.f25003h = c13614i.f25090a;
        this.f25005j = FiveAdState.LOADED;
        this.f25007l = null;
        this.f25006k = new C13611f(context, c13614i, frameLayout, c13618d, c14071c, c13760i, this);
        this.f25008m = 0;
        addView(frameLayout);
    }

    public FiveAdCustomLayout(Context context, String str) {
        this(context, str, 0);
    }

    public FiveAdCustomLayout(Context context, String str, int i) {
        super(context);
        this.f24996a = null;
        this.f25004i = new Object();
        this.f25009n = false;
        C13614i c13614i = C14163j.m78039a().f26837a;
        this.f24998c = c13614i;
        this.f24997b = context;
        this.f24999d = c13614i.f25101l.m78398a(str);
        C13618D c13618d = new C13618D(this);
        this.f25000e = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25001f = c14071c;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25002g = frameLayout;
        this.f25003h = c13614i.f25090a;
        this.f25005j = FiveAdState.NOT_LOADED;
        this.f25007l = new C13617C(c13618d, c13614i.f25107r, c14071c);
        this.f25006k = null;
        this.f25008m = i;
        addView(frameLayout);
    }
}
