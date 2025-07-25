package com.five_corp.p372ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.five_corp.p372ad.FiveAdNative;
import com.five_corp.p372ad.internal.C13617C;
import com.five_corp.p372ad.internal.C13618D;
import com.five_corp.p372ad.internal.C13779g;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.InterfaceC14066q;
import com.five_corp.p372ad.internal.adselector.InterfaceC13701c;
import com.five_corp.p372ad.internal.context.C13757f;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.context.EnumC13756e;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13643d;
import com.five_corp.p372ad.internal.soundstate.C14071c;
import java.util.List;

/* renamed from: com.five_corp.ad.FiveAdNative */
/* loaded from: classes4.dex */
public class FiveAdNative implements FiveAdInterface, InterfaceC13701c, InterfaceC13608c {

    /* renamed from: a */
    public final Context f25024a;

    /* renamed from: b */
    public final C13614i f25025b;

    /* renamed from: c */
    public final C13757f f25026c;

    /* renamed from: d */
    public final C13618D f25027d;

    /* renamed from: e */
    public final C14071c f25028e;

    /* renamed from: f */
    public final FrameLayout f25029f;

    /* renamed from: g */
    public final C13836a f25030g;

    /* renamed from: h */
    public final Object f25031h;

    /* renamed from: i */
    public FiveAdState f25032i;

    /* renamed from: j */
    public C13611f f25033j;

    /* renamed from: k */
    public C13617C f25034k;

    /* renamed from: l */
    public final NativeMainView f25035l;

    /* renamed from: m */
    public final Handler f25036m;

    /* renamed from: n */
    public String f25037n;

    /* renamed from: com.five_corp.ad.FiveAdNative$LoadImageCallback */
    /* loaded from: classes4.dex */
    public interface LoadImageCallback {
        void onImageLoad(@Nullable Bitmap bitmap);
    }

    public FiveAdNative(Context context, C13614i c13614i, C13760i c13760i) {
        int i;
        int i2;
        this.f25031h = new Object();
        this.f25024a = context;
        this.f25025b = c13614i;
        this.f25026c = c13760i.f25596g;
        C13618D c13618d = new C13618D(this);
        this.f25027d = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25028e = c14071c;
        this.f25030g = c13614i.f25090a;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25029f = frameLayout;
        this.f25032i = FiveAdState.LOADED;
        this.f25034k = null;
        this.f25033j = new C13611f(context, c13614i, frameLayout, c13618d, c14071c, c13760i, this);
        NativeMainView nativeMainView = new NativeMainView(context, frameLayout, c13614i.f25090a, 0);
        this.f25035l = nativeMainView;
        C13643d c13643d = c13760i.f25595f.f25339b;
        if (c13643d != null && (i = c13643d.f25290a) > 0 && (i2 = c13643d.f25291b) > 0) {
            nativeMainView.setConfigHeightToWidthRatio(i2 / i);
        }
        this.f25036m = new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    public static /* synthetic */ void m78555c(LoadImageCallback loadImageCallback) {
        Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadInformationIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    /* renamed from: a */
    public final C13611f m78559a() {
        C13611f c13611f;
        synchronized (this.f25031h) {
            c13611f = this.f25033j;
        }
        return c13611f;
    }

    /* renamed from: b */
    public final C13760i m78557b() {
        C13611f m78559a = m78559a();
        if (m78559a != null) {
            return m78559a.f25073l;
        }
        return null;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f25028e.m78131a(z);
    }

    @NonNull
    public View getAdMainView() {
        return this.f25035l;
    }

    @NonNull
    public String getAdTitle() {
        String str;
        C13760i m78557b = m78557b();
        if (m78557b != null && (str = m78557b.f25591b.f25203u) != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getAdvertiserName() {
        String str;
        C13760i m78557b = m78557b();
        if (m78557b != null && (str = m78557b.f25591b.f25202t) != null) {
            return str;
        }
        return "";
    }

    @NonNull
    public String getButtonText() {
        String str;
        C13760i m78557b = m78557b();
        if (m78557b != null && (str = m78557b.f25591b.f25204v) != null) {
            return str;
        }
        return "";
    }

    public int getContentViewLogicalHeight() {
        return this.f25035l.getLogicalHeight();
    }

    public int getContentViewLogicalWidth() {
        return this.f25035l.getLogicalWidth();
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        C13611f m78559a = m78559a();
        if (m78559a != null) {
            return m78559a.f25073l.f25591b.f25184b;
        }
        return CreativeType.NOT_LOADED;
    }

    @NonNull
    public String getDescriptionText() {
        String str;
        C13760i m78557b = m78557b();
        if (m78557b != null && (str = m78557b.f25591b.f25205w) != null) {
            return str;
        }
        return "";
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.f25037n;
    }

    @NonNull
    public String getLongDescriptionText() {
        String str;
        C13760i m78557b = m78557b();
        if (m78557b != null && (str = m78557b.f25591b.f25206x) != null) {
            return str;
        }
        return "";
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.f25026c.f25586c;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @NonNull
    @Deprecated
    public FiveAdState getState() {
        FiveAdState fiveAdState;
        synchronized (this.f25031h) {
            fiveAdState = this.f25032i;
        }
        return fiveAdState;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f25028e.m78134a().m78135a();
    }

    public void loadAdAsync() {
        boolean z;
        synchronized (this.f25031h) {
            if (this.f25032i == FiveAdState.NOT_LOADED && this.f25034k != null) {
                this.f25032i = FiveAdState.LOADING;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f25025b.f25102m.m78438a(this.f25026c, EnumC13756e.NATIVE, this.f25028e.m78134a(), this);
            return;
        }
        C13618D c13618d = this.f25027d;
        FiveAdErrorCode fiveAdErrorCode = FiveAdErrorCode.INVALID_STATE;
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) c13618d.f25135b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(c13618d.f25134a, fiveAdErrorCode);
        }
        Log.e("com.five_corp.ad.FiveAdNative", "Invalid state, loadAdAsync is ignored.");
    }

    public void loadIconImageAsync(@NonNull final LoadImageCallback loadImageCallback) {
        C13760i m78557b = m78557b();
        if (m78557b == null) {
            this.f25036m.post(new Runnable() { // from class: x1.v
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.m78558a(loadImageCallback);
                }
            });
            return;
        }
        C13691u c13691u = m78557b.f25591b.f25200r;
        if (c13691u == null) {
            this.f25036m.post(new Runnable() { // from class: x1.w
                @Override // java.lang.Runnable
                public final void run() {
                    loadImageCallback.onImageLoad(null);
                }
            });
        } else {
            m78557b.f25599j.m78418a(c13691u, new C14164k(loadImageCallback));
        }
    }

    public void loadInformationIconImageAsync(@NonNull final LoadImageCallback loadImageCallback) {
        C13760i m78557b = m78557b();
        if (m78557b == null) {
            this.f25036m.post(new Runnable() { // from class: x1.t
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.m78555c(loadImageCallback);
                }
            });
            return;
        }
        C13691u c13691u = m78557b.f25591b.f25201s;
        if (c13691u == null) {
            this.f25036m.post(new Runnable() { // from class: x1.u
                @Override // java.lang.Runnable
                public final void run() {
                    loadImageCallback.onImageLoad(null);
                }
            });
        } else {
            m78557b.f25599j.m78418a(c13691u, new C14165l(loadImageCallback));
        }
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerClose() {
        synchronized (this.f25031h) {
            this.f25033j = null;
            this.f25032i = FiveAdState.CLOSED;
        }
    }

    @Override // com.five_corp.p372ad.InterfaceC13608c
    public void onAdControllerError() {
        synchronized (this.f25031h) {
            this.f25032i = FiveAdState.ERROR;
        }
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onAdSuccessfullySelected(@NonNull C13760i c13760i) {
        C13617C c13617c;
        synchronized (this.f25031h) {
            c13617c = this.f25034k;
            this.f25034k = null;
        }
        C13643d c13643d = c13760i.f25595f.f25339b;
        if (c13643d != null && c13643d.f25290a != 0 && c13643d.f25291b != 0) {
            C13611f c13611f = new C13611f(this.f25024a, this.f25025b, this.f25029f, this.f25027d, this.f25028e, c13760i, this);
            synchronized (this.f25031h) {
                this.f25033j = c13611f;
                this.f25032i = FiveAdState.LOADED;
            }
            this.f25035l.setConfigHeightToWidthRatio(c13643d.f25291b / c13643d.f25290a);
            if (c13617c != null) {
                c13617c.m78490b(c13760i);
                return;
            } else {
                this.f25030g.m78270a("notifyLoad failed @ FiveAdInterstitial.onAdSuccessfullySelected");
                return;
            }
        }
        synchronized (this.f25031h) {
            this.f25032i = FiveAdState.ERROR;
        }
        if (c13617c != null) {
            c13617c.m78491b(this.f25026c, EnumC13756e.NATIVE, new C14068s(EnumC14106t.f26380H4, null, null, null));
        } else {
            this.f25030g.m78270a("notifyLoadError failed @ FiveAdInterstitial.onAdSuccessfullySelected");
        }
    }

    @Override // com.five_corp.p372ad.internal.adselector.InterfaceC13701c
    public void onFailureToSelectAd(@NonNull C14068s c14068s) {
        C13617C c13617c;
        synchronized (this.f25031h) {
            c13617c = this.f25034k;
            this.f25034k = null;
            this.f25032i = FiveAdState.ERROR;
        }
        if (c13617c != null) {
            c13617c.m78491b(this.f25026c, EnumC13756e.NATIVE, c14068s);
        } else {
            this.f25030g.m78270a("notifyLoadError failed @ FiveAdInterstitial.onFailureToSelectAd");
        }
    }

    public void registerFriendlyObstructionView(@NonNull View view) {
        C13611f m78559a = m78559a();
        if (m78559a == null) {
            Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerFriendlyObstructionView` after ad is loaded.");
        } else {
            m78559a.f25070i.m78053a(view, 4);
        }
    }

    public void registerViews(@NonNull View view, @Nullable View view2, @NonNull List<View> list) {
        C13611f m78559a = m78559a();
        if (m78559a == null) {
            Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerViews` after ad is loaded.");
            return;
        }
        m78559a.f25070i.f26823f = view;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC14166m(m78559a));
        }
        for (View view3 : list) {
            view3.setOnClickListener(new View$OnClickListenerC14167n(m78559a));
        }
    }

    public void setEventListener(@NonNull FiveAdNativeEventListener fiveAdNativeEventListener) {
        C13618D c13618d = this.f25027d;
        c13618d.f25137d.set(new C13779g(fiveAdNativeEventListener, this));
        C13618D c13618d2 = this.f25027d;
        c13618d2.f25139f.set(InterfaceC14066q.m78141a(fiveAdNativeEventListener, this));
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.f25037n = str;
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    public void setLoadListener(FiveAdLoadListener fiveAdLoadListener) {
        this.f25027d.f25135b.set(fiveAdLoadListener);
    }

    @Override // com.five_corp.p372ad.FiveAdInterface
    @Deprecated
    public void setViewEventListener(FiveAdViewEventListener fiveAdViewEventListener) {
        this.f25027d.f25136c.set(fiveAdViewEventListener);
    }

    public FiveAdNative(Context context, String str) {
        this(context, str, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m78558a(LoadImageCallback loadImageCallback) {
        Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    public FiveAdNative(Context context, String str, int i) {
        this.f25031h = new Object();
        this.f25024a = context;
        C13614i c13614i = C14163j.m78039a().f26837a;
        this.f25025b = c13614i;
        this.f25026c = c13614i.f25101l.m78398a(str);
        C13618D c13618d = new C13618D(this);
        this.f25027d = c13618d;
        C14071c c14071c = new C14071c(c13614i.m78530a());
        this.f25028e = c14071c;
        this.f25030g = c13614i.f25090a;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25029f = frameLayout;
        this.f25032i = FiveAdState.NOT_LOADED;
        this.f25034k = new C13617C(c13618d, c13614i.f25107r, c14071c);
        this.f25033j = null;
        this.f25035l = new NativeMainView(context, frameLayout, c13614i.f25090a, i);
        this.f25036m = new Handler(Looper.getMainLooper());
    }
}
