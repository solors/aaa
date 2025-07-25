package com.p551my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC26059r6;
import com.p551my.target.C25798h7;
import com.p551my.target.C25821i5;
import com.p551my.target.C25822i6;
import com.p551my.target.C25902m;
import com.p551my.target.C25932n5;
import com.p551my.target.C26007p6;
import com.p551my.target.C26084s5;
import com.p551my.target.C26165v6;
import com.p551my.target.InterfaceC25813i2;
import com.p551my.target.common.BaseAd;
import com.p551my.target.common.menu.MenuFactory;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeBannerAd */
/* loaded from: classes7.dex */
public final class NativeBannerAd extends BaseAd implements INativeAd {
    @Nullable
    private NativeBannerAdChoicesListener adChoicesListener;
    @Nullable
    private NativeBannerAdChoicesOptionListener adChoicesOptionListener;
    private int adChoicesPlacement;
    @NonNull
    private final Context appContext;
    @Nullable
    private InterfaceC25813i2 engine;
    @Nullable
    private NativeBannerAdListener listener;
    @Nullable
    private NativeBannerAdMediaListener mediaListener;
    @Nullable
    private MenuFactory menuFactory;
    @NonNull
    private final C26007p6.C26009b nativeBannerAdStrategy;

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdChoicesListener */
    /* loaded from: classes7.dex */
    public interface NativeBannerAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @Nullable NativeBannerAd nativeBannerAd);
    }

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdChoicesOptionListener */
    /* loaded from: classes7.dex */
    public interface NativeBannerAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeBannerAd nativeBannerAd);

        void onCloseAutomatically(@NonNull NativeBannerAd nativeBannerAd);

        boolean shouldCloseAutomatically();
    }

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdListener */
    /* loaded from: classes7.dex */
    public interface NativeBannerAdListener {
        void onClick(@NonNull NativeBannerAd nativeBannerAd);

        void onLoad(@NonNull NativeBanner nativeBanner, @NonNull NativeBannerAd nativeBannerAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeBannerAd nativeBannerAd);

        void onShow(@NonNull NativeBannerAd nativeBannerAd);
    }

    /* renamed from: com.my.target.nativeads.NativeBannerAd$NativeBannerAdMediaListener */
    /* loaded from: classes7.dex */
    public interface NativeBannerAdMediaListener {
        void onIconLoad(@NonNull NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i, @NonNull Context context) {
        super(i, "nativebanner");
        this.nativeBannerAdStrategy = new C26007p6.C26009b();
        this.adChoicesPlacement = 0;
        this.appContext = context.getApplicationContext();
        AbstractC25846ja.m43676c("Native banner ad created. Version - 5.22.1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(@Nullable C26165v6 c26165v6, @Nullable IAdLoadingError iAdLoadingError) {
        NativeBannerAdListener nativeBannerAdListener = this.listener;
        if (nativeBannerAdListener == null) {
            return;
        }
        if (c26165v6 == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67233o;
            }
            nativeBannerAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        C25822i6 m42708e = c26165v6.m42708e();
        C25821i5 m43190b = c26165v6.m43190b();
        if (m42708e == null) {
            if (m43190b != null) {
                C25932n5 m43398a = C25932n5.m43398a(this, m43190b, this.adConfig, this.metricFactory, this.menuFactory);
                this.engine = m43398a;
                m43398a.m43645b(this.appContext);
                return;
            }
            NativeBannerAdListener nativeBannerAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67239u;
            }
            nativeBannerAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        C25798h7 m43787a = C25798h7.m43787a(this, m42708e, this.menuFactory, this.appContext);
        this.engine = m43787a;
        m43787a.mo43399a(this.mediaListener);
        NativeBanner mo43395d = this.engine.mo43395d();
        if (mo43395d != null) {
            this.listener.onLoad(mo43395d, this);
        }
    }

    @Nullable
    public NativeBannerAdChoicesListener getAdChoicesListener() {
        return this.adChoicesListener;
    }

    @Nullable
    public NativeBannerAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.adChoicesOptionListener;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    @Nullable
    public String getAdSource() {
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 != null) {
            return interfaceC25813i2.mo43767b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 != null) {
            return interfaceC25813i2.mo43766c();
        }
        return 0.0f;
    }

    @Nullable
    public NativeBanner getBanner() {
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 == null) {
            return null;
        }
        return interfaceC25813i2.mo43395d();
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    @Nullable
    public NativeBannerAdListener getListener() {
        return this.listener;
    }

    @Nullable
    public NativeBannerAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 == null) {
            return;
        }
        interfaceC25813i2.handleAdChoicesClick(context);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void handleData(@NonNull String str) {
        C26007p6.m43200a(this.nativeBannerAdStrategy, str, this.adConfig, this.metricFactory).m43581a(new C25951d(this)).mo42269a(this.metricFactory.m42906a(), this.appContext);
    }

    public void handleSection(@NonNull C26165v6 c26165v6) {
        C26084s5.C26085a m42913a = C26084s5.m42913a(this.adConfig.getSlotId());
        C26007p6.m43201a(this.nativeBannerAdStrategy, c26165v6, this.adConfig, m42913a).m43581a(new C25951d(this)).mo42269a(m42913a.m42906a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void load() {
        if (isLoadCalled()) {
            AbstractC25846ja.m43680a("NativeBannerAd: Doesn't support multiple load");
            handleResult(null, C25902m.f67238t);
            return;
        }
        C26007p6.m43202a(this.nativeBannerAdStrategy, this.adConfig, this.metricFactory).m43581a(new C25951d(this)).mo42269a(this.metricFactory.m42906a(), this.appContext);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void loadFromBid(@NonNull String str) {
        this.adConfig.setBidId(str);
        load();
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void registerView(@NonNull View view) {
        registerView(view, null);
    }

    public void setAdChoicesListener(@Nullable NativeBannerAdChoicesListener nativeBannerAdChoicesListener) {
        this.adChoicesListener = nativeBannerAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeBannerAdChoicesOptionListener nativeBannerAdChoicesOptionListener) {
        this.adChoicesOptionListener = nativeBannerAdChoicesOptionListener;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(@NonNull C25822i6 c25822i6) {
        this.engine = C25798h7.m43787a(this, c25822i6, this.menuFactory, this.appContext);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(@Nullable NativeBannerAdListener nativeBannerAdListener) {
        this.listener = nativeBannerAdListener;
    }

    public void setMediaListener(@Nullable NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.mediaListener = nativeBannerAdMediaListener;
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 != null) {
            interfaceC25813i2.mo43399a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void unregisterView() {
        AbstractC26059r6.m43063a(this);
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 != null) {
            interfaceC25813i2.unregisterView();
        }
    }

    public NativeBannerAd(int i, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i, context);
        this.menuFactory = menuFactory;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        AbstractC26059r6.m43064a(view, this);
        InterfaceC25813i2 interfaceC25813i2 = this.engine;
        if (interfaceC25813i2 != null) {
            interfaceC25813i2.registerView(view, list, this.adChoicesPlacement);
        }
    }
}
