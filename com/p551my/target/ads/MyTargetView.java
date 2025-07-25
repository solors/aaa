package com.p551my.target.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC25877l;
import com.p551my.target.AbstractC26019q;
import com.p551my.target.C25621R;
import com.p551my.target.C25743f1;
import com.p551my.target.C25832j;
import com.p551my.target.C25869ka;
import com.p551my.target.C25902m;
import com.p551my.target.C26084s5;
import com.p551my.target.C26144u9;
import com.p551my.target.C26170v9;
import com.p551my.target.C26253y9;
import com.p551my.target.common.CustomParams;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.mediation.AdNetworkConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.my.target.ads.MyTargetView */
/* loaded from: classes7.dex */
public final class MyTargetView extends FrameLayout {
    @NonNull
    private final C25832j adConfig;
    @NonNull
    private AdSize adSize;
    private boolean attached;
    @Nullable
    private C26170v9 engine;
    private boolean fixedSize;
    @NonNull
    private final AtomicBoolean isLoaded;
    @Nullable
    private MyTargetViewListener listener;
    @Nullable
    @RequiresApi(26)
    private MyTargetViewRenderCrashListener webViewCrashListener;

    /* renamed from: com.my.target.ads.MyTargetView$AdSize */
    /* loaded from: classes7.dex */
    public static final class AdSize {
        public static final int BANNER_300x250 = 1;
        public static final int BANNER_320x50 = 0;
        public static final int BANNER_728x90 = 2;
        public static final int BANNER_ADAPTIVE = 3;
        private static final float MAX_HEIGHT_PROPORTION = 0.15f;
        private static final int MIN_HEIGHT = 50;
        private final int height;
        private final int heightPixels;
        private final int type;
        private final int width;
        private final int widthPixels;
        public static final AdSize ADSIZE_320x50 = new AdSize(320, 50, 0);
        public static final AdSize ADSIZE_300x250 = new AdSize(300, 250, 1);
        public static final AdSize ADSIZE_728x90 = new AdSize(728, 90, 2);

        private AdSize(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            float m43615a = C25869ka.m43615a();
            this.widthPixels = (int) (i * m43615a);
            this.heightPixels = (int) (i2 * m43615a);
            this.type = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public static AdSize fromInt(int i, @NonNull Context context) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return ADSIZE_320x50;
                    }
                    return getAdSizeForCurrentOrientation(context);
                }
                return ADSIZE_728x90;
            }
            return ADSIZE_300x250;
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i, int i2, @NonNull Context context) {
            Point m43597b = C25869ka.m43597b(context);
            float m43615a = C25869ka.m43615a();
            return getSize(i * m43615a, Math.min(i2 * m43615a, m43597b.y * 0.15f));
        }

        @NonNull
        private static AdSize getSize(float f, float f2) {
            float f3;
            float m43615a = C25869ka.m43615a();
            if (f > 524.0f) {
                f3 = (f / 728.0f) * 90.0f;
            } else {
                f3 = (f / 320.0f) * 50.0f;
            }
            float max = Math.max(Math.min(f3, f2), 50.0f * m43615a);
            return new AdSize((int) (f / m43615a), (int) (max / m43615a), (int) f, (int) max, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSame(@NonNull AdSize adSize, @NonNull AdSize adSize2) {
            if (adSize.height == adSize2.height && adSize.width == adSize2.width && adSize.type == adSize2.type) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.height;
        }

        public int getHeightPixels() {
            return this.heightPixels;
        }

        public int getType() {
            return this.type;
        }

        public int getWidth() {
            return this.width;
        }

        public int getWidthPixels() {
            return this.widthPixels;
        }

        private AdSize(int i, int i2, int i3, int i4, int i5) {
            this.width = i;
            this.height = i2;
            this.widthPixels = i3;
            this.heightPixels = i4;
            this.type = i5;
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(int i, @NonNull Context context) {
            return getSize(i * C25869ka.m43615a(), C25869ka.m43597b(context).y * 0.15f);
        }

        @NonNull
        public static AdSize getAdSizeForCurrentOrientation(@NonNull Context context) {
            Point m43597b = C25869ka.m43597b(context);
            return getSize(m43597b.x, m43597b.y * 0.15f);
        }
    }

    /* renamed from: com.my.target.ads.MyTargetView$MyTargetViewListener */
    /* loaded from: classes7.dex */
    public interface MyTargetViewListener {
        void onClick(@NonNull MyTargetView myTargetView);

        void onLoad(@NonNull MyTargetView myTargetView);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView);

        void onShow(@NonNull MyTargetView myTargetView);
    }

    @RequiresApi(26)
    /* renamed from: com.my.target.ads.MyTargetView$MyTargetViewRenderCrashListener */
    /* loaded from: classes7.dex */
    public interface MyTargetViewRenderCrashListener {
        void onViewRenderCrash(@NonNull MyTargetView myTargetView);
    }

    public MyTargetView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResult */
    public void lambda$load$0(@Nullable C26253y9 c26253y9, @Nullable IAdLoadingError iAdLoadingError, @NonNull C26084s5.C26085a c26085a) {
        MyTargetViewListener myTargetViewListener = this.listener;
        if (myTargetViewListener == null) {
            return;
        }
        if (c26253y9 == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67227i;
            }
            myTargetViewListener.onNoAd(iAdLoadingError, this);
            return;
        }
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42693a();
        }
        C26170v9 m42691a = C26170v9.m42691a(this, this.adConfig, c26085a);
        this.engine = m42691a;
        m42691a.m42686a(this.attached);
        this.engine.m42684b(c26253y9);
        this.adConfig.setBidId(null);
    }

    private void setFormat() {
        C25832j c25832j;
        String str;
        AdSize adSize = this.adSize;
        if (adSize == AdSize.ADSIZE_320x50) {
            c25832j = this.adConfig;
            str = "standard_320x50";
        } else if (adSize == AdSize.ADSIZE_300x250) {
            c25832j = this.adConfig;
            str = "standard_300x250";
        } else if (adSize == AdSize.ADSIZE_728x90) {
            c25832j = this.adConfig;
            str = "standard_728x90";
        } else {
            c25832j = this.adConfig;
            str = Reporting.CreativeType.STANDARD;
        }
        c25832j.setFormat(str);
    }

    private void updateAdaptiveSize() {
        AdSize adSize;
        Context context = getContext();
        Point m43597b = C25869ka.m43597b(context);
        int i = m43597b.x;
        float f = m43597b.y;
        if (i == this.adSize.width && adSize.height <= f * 0.15f) {
            return;
        }
        AdSize adSizeForCurrentOrientation = AdSize.getAdSizeForCurrentOrientation(context);
        this.adSize = adSizeForCurrentOrientation;
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42692a(adSizeForCurrentOrientation);
        }
    }

    public void destroy() {
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42693a();
            this.engine = null;
        }
        this.listener = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.webViewCrashListener = null;
        }
    }

    @Nullable
    public String getAdSource() {
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            return c26170v9.m42685b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            return c26170v9.m42682c();
        }
        return 0.0f;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    @Nullable
    public MyTargetViewListener getListener() {
        return this.listener;
    }

    @Nullable
    @RequiresApi(26)
    public MyTargetViewRenderCrashListener getRenderCrashListener() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            AbstractC25846ja.m43678b("Trying to get a MyTargetViewRenderCrashListener on api = " + i + ", but min api = 26, return null");
            return null;
        }
        return this.webViewCrashListener;
    }

    @NonNull
    public AdSize getSize() {
        return this.adSize;
    }

    public void handleSection(@NonNull C26253y9 c26253y9, @NonNull AdSize adSize) {
        final C26084s5.C26085a m42913a = C26084s5.m42913a(this.adConfig.getSlotId());
        C26144u9.m42744a(c26253y9, this.adConfig, m42913a).m43581a(new AbstractC25877l.InterfaceC25879b() { // from class: com.my.target.ads.d
            @Override // com.p551my.target.AbstractC25877l.InterfaceC25879b
            /* renamed from: a */
            public final void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m) {
                MyTargetView.this.lambda$handleSection$1(m42913a, (C26253y9) abstractC26019q, c25902m);
            }
        }).mo42269a(m42913a.m42906a(), getContext());
    }

    @Deprecated
    public void init(int i) {
        init(i, true);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public void load() {
        if (!this.isLoaded.compareAndSet(false, true)) {
            AbstractC25846ja.m43680a("MyTargetView: Doesn't support multiple load");
            return;
        }
        final C26084s5.C26085a m42913a = C26084s5.m42913a(this.adConfig.getSlotId());
        C26084s5 m42906a = m42913a.m42906a();
        AbstractC25846ja.m43680a("MyTargetView: View load");
        setFormat();
        C26144u9.m42745a(this.adConfig, m42913a).m43581a(new AbstractC25877l.InterfaceC25879b() { // from class: com.my.target.ads.c
            @Override // com.p551my.target.AbstractC25877l.InterfaceC25879b
            /* renamed from: a */
            public final void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m) {
                MyTargetView.this.lambda$load$0(m42913a, (C26253y9) abstractC26019q, c25902m);
            }
        }).mo42269a(m42906a, getContext());
    }

    public void loadFromBid(@NonNull String str) {
        this.adConfig.setBidId(str);
        this.adConfig.setRefreshAd(false);
        load();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42686a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42686a(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.fixedSize) {
            updateAdaptiveSize();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C26170v9 c26170v9 = this.engine;
        if (c26170v9 != null) {
            c26170v9.m42683b(z);
        }
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.adConfig.setAdNetworkConfig(str, adNetworkConfig);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        if (adSize == null) {
            AbstractC25846ja.m43680a("MyTargetView: AdSize cannot be null");
        } else if (this.fixedSize && AdSize.isSame(this.adSize, adSize)) {
        } else {
            this.fixedSize = true;
            if (this.isLoaded.get()) {
                AdSize adSize2 = this.adSize;
                AdSize adSize3 = AdSize.ADSIZE_300x250;
                if (AdSize.isSame(adSize2, adSize3) || AdSize.isSame(adSize, adSize3)) {
                    AbstractC25846ja.m43680a("MyTargetView: unable to switch size to/from 300x250");
                    return;
                }
            }
            C26170v9 c26170v9 = this.engine;
            if (c26170v9 != null) {
                c26170v9.m42692a(adSize);
                View childAt = getChildAt(0);
                if (childAt instanceof C25743f1) {
                    childAt.requestLayout();
                }
            }
            this.adSize = adSize;
            setFormat();
        }
    }

    public void setListener(@Nullable MyTargetViewListener myTargetViewListener) {
        this.listener = myTargetViewListener;
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    public void setRefreshAd(boolean z) {
        this.adConfig.setRefreshAd(z);
    }

    @RequiresApi(26)
    public void setRenderCrashListener(@Nullable MyTargetViewRenderCrashListener myTargetViewRenderCrashListener) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            AbstractC25846ja.m43678b("Can't set MyTargetViewRenderCrashListener: available only on api >= 26, your api = " + i);
            return;
        }
        this.webViewCrashListener = myTargetViewRenderCrashListener;
    }

    public void setSlotId(int i) {
        if (this.isLoaded.get()) {
            return;
        }
        this.adConfig.setSlotId(i);
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void init(int i, int i2) {
        init(i, i2, true);
    }

    public MyTargetView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.isLoaded = new AtomicBoolean();
        this.fixedSize = false;
        AbstractC25846ja.m43676c("MyTargetView created. Version - 5.22.1");
        this.adConfig = C25832j.newConfig(0, "");
        this.adSize = AdSize.getAdSizeForCurrentOrientation(context);
        if (attributeSet == null) {
            return;
        }
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, C25621R.styleable.MyTargetView);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("MyTargetView: Unable to get view attributes - " + th.getMessage());
            typedArray = null;
        }
        if (typedArray == null) {
            return;
        }
        this.adConfig.setSlotId(typedArray.getInt(C25621R.styleable.MyTargetView_myTarget_slotId, 0));
        this.adConfig.setRefreshAd(typedArray.getBoolean(C25621R.styleable.MyTargetView_myTarget_isRefreshAd, true));
        int i2 = typedArray.getInt(C25621R.styleable.MyTargetView_myTarget_adSize, -1);
        if (i2 >= 0) {
            if (i2 != 3) {
                this.fixedSize = true;
            }
            this.adSize = AdSize.fromInt(i2, context);
        }
        typedArray.recycle();
    }

    @Deprecated
    public void init(int i, int i2, boolean z) {
        setAdSize(AdSize.fromInt(i2, getContext()));
        this.adConfig.setSlotId(i);
        this.adConfig.setRefreshAd(z);
        AbstractC25846ja.m43680a("MyTargetView: Initialized");
    }

    @Deprecated
    public void init(int i, boolean z) {
        init(i, 0, z);
    }
}
