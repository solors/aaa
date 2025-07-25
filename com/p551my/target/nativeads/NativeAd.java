package com.p551my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25755f9;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC26059r6;
import com.p551my.target.C25821i5;
import com.p551my.target.C25822i6;
import com.p551my.target.C25902m;
import com.p551my.target.C25908m5;
import com.p551my.target.C25982o6;
import com.p551my.target.C26007p6;
import com.p551my.target.C26165v6;
import com.p551my.target.InterfaceC25791h2;
import com.p551my.target.common.BaseAd;
import com.p551my.target.common.menu.MenuFactory;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.banners.NativePromoBanner;
import com.p551my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeAd */
/* loaded from: classes7.dex */
public final class NativeAd extends BaseAd implements INativeAd {
    @Nullable
    private NativeAdChoicesListener adChoicesListener;
    @Nullable
    private NativeAdChoicesOptionListener adChoicesOptionListener;
    private int adChoicesPlacement;
    @NonNull
    private final Context appContext;
    @Nullable
    private InterfaceC25791h2 engine;
    @Nullable
    private NativeAdListener listener;
    @Nullable
    private NativeAdMediaListener mediaListener;
    @Nullable
    private MenuFactory menuFactory;
    @NonNull
    private final C26007p6.C26008a nativeAdStrategy;
    private boolean useExoPlayer;

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdChoicesListener */
    /* loaded from: classes7.dex */
    public interface NativeAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z, @NonNull NativeAd nativeAd);
    }

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdChoicesOptionListener */
    /* loaded from: classes7.dex */
    public interface NativeAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeAd nativeAd);

        void onCloseAutomatically(@NonNull NativeAd nativeAd);

        boolean shouldCloseAutomatically();
    }

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdListener */
    /* loaded from: classes7.dex */
    public interface NativeAdListener {
        void onClick(@NonNull NativeAd nativeAd);

        void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull NativeAd nativeAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAd nativeAd);

        void onShow(@NonNull NativeAd nativeAd);

        void onVideoComplete(@NonNull NativeAd nativeAd);

        void onVideoPause(@NonNull NativeAd nativeAd);

        void onVideoPlay(@NonNull NativeAd nativeAd);
    }

    /* renamed from: com.my.target.nativeads.NativeAd$NativeAdMediaListener */
    /* loaded from: classes7.dex */
    public interface NativeAdMediaListener {
        void onIconLoad(@NonNull NativeAd nativeAd);

        void onImageLoad(@NonNull NativeAd nativeAd);
    }

    public NativeAd(int i, @NonNull Context context) {
        super(i, "nativeads");
        this.nativeAdStrategy = new C26007p6.C26008a();
        this.adChoicesPlacement = 0;
        this.useExoPlayer = true;
        this.appContext = context.getApplicationContext();
        this.menuFactory = null;
        AbstractC25846ja.m43676c("Native ad created. Version - 5.22.1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(@Nullable C26165v6 c26165v6, @Nullable IAdLoadingError iAdLoadingError) {
        NativeAdListener nativeAdListener = this.listener;
        if (nativeAdListener == null) {
            return;
        }
        if (c26165v6 == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67233o;
            }
            nativeAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        C25822i6 m42708e = c26165v6.m42708e();
        C25821i5 m43190b = c26165v6.m43190b();
        if (m42708e == null) {
            if (m43190b != null) {
                C25908m5 m43469a = C25908m5.m43469a(this, m43190b, this.adConfig, this.metricFactory, this.menuFactory);
                this.engine = m43469a;
                m43469a.m43645b(this.appContext);
                return;
            }
            NativeAdListener nativeAdListener2 = this.listener;
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67239u;
            }
            nativeAdListener2.onNoAd(iAdLoadingError, this);
            return;
        }
        C25982o6 m43252a = C25982o6.m43252a(this, m42708e, this.menuFactory, this.appContext);
        this.engine = m43252a;
        m43252a.mo43253a(this.mediaListener);
        if (this.engine.mo43247e() != null) {
            this.listener.onLoad(this.engine.mo43247e(), this);
        }
    }

    @Nullable
    public NativeAdChoicesListener getAdChoicesListener() {
        return this.adChoicesListener;
    }

    @Nullable
    public NativeAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.adChoicesOptionListener;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    @Nullable
    public String getAdSource() {
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            return interfaceC25791h2.mo43250b();
        }
        return null;
    }

    public float getAdSourcePriority() {
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            return interfaceC25791h2.mo43249c();
        }
        return 0.0f;
    }

    @Nullable
    public NativePromoBanner getBanner() {
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 == null) {
            return null;
        }
        return interfaceC25791h2.mo43247e();
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    @Nullable
    public NativeAdListener getListener() {
        return this.listener;
    }

    @Nullable
    public NativeAdMediaListener getMediaListener() {
        return this.mediaListener;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 == null) {
            return;
        }
        interfaceC25791h2.handleAdChoicesClick(context);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void handleData(@NonNull String str) {
        C26007p6.m43200a(this.nativeAdStrategy, str, this.adConfig, this.metricFactory).m43581a(new C25948a(this)).mo42269a(this.metricFactory.m42906a(), this.appContext);
    }

    public void handleSection(@NonNull C26165v6 c26165v6) {
        C26007p6.m43201a(this.nativeAdStrategy, c26165v6, this.adConfig, this.metricFactory).m43581a(new C25948a(this)).mo42269a(this.metricFactory.m42906a(), this.appContext);
    }

    public boolean isMediationEnabled() {
        return this.adConfig.isMediationEnabled();
    }

    public boolean isUseExoPlayer() {
        return this.useExoPlayer;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void load() {
        if (isLoadCalled()) {
            AbstractC25846ja.m43680a("NativeAd: Doesn't support multiple load");
            handleResult(null, C25902m.f67238t);
            return;
        }
        C26007p6.m43202a(this.nativeAdStrategy, this.adConfig, this.metricFactory).m43581a(new C25948a(this)).mo42269a(this.metricFactory.m42906a(), this.appContext);
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

    public void setAdChoicesListener(@Nullable NativeAdChoicesListener nativeAdChoicesListener) {
        this.adChoicesListener = nativeAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeAdChoicesOptionListener nativeAdChoicesOptionListener) {
        this.adChoicesOptionListener = nativeAdChoicesOptionListener;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void setAdChoicesPlacement(int i) {
        this.adChoicesPlacement = i;
    }

    public void setBanner(@NonNull C25822i6 c25822i6) {
        this.engine = C25982o6.m43252a(this, c25822i6, this.menuFactory, this.appContext);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public void setListener(@Nullable NativeAdListener nativeAdListener) {
        this.listener = nativeAdListener;
    }

    public void setMediaListener(@Nullable NativeAdMediaListener nativeAdMediaListener) {
        this.mediaListener = nativeAdMediaListener;
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            interfaceC25791h2.mo43253a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z) {
        this.adConfig.setMediationEnabled(z);
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void unregisterView() {
        AbstractC26059r6.m43063a(this);
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            interfaceC25791h2.unregisterView();
        }
    }

    public void useExoPlayer(boolean z) {
        this.useExoPlayer = z;
        if (!z) {
            AbstractC25755f9.m43898g();
        }
    }

    public NativeAd(int i, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i, context);
        this.menuFactory = menuFactory;
    }

    @Override // com.p551my.target.nativeads.INativeAd
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        AbstractC26059r6.m43064a(view, this);
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            interfaceC25791h2.mo43257a(view, list, this.adChoicesPlacement, null);
        }
    }

    public void registerView(@NonNull View view, @Nullable List<View> list, @Nullable MediaAdView mediaAdView) {
        AbstractC26059r6.m43064a(view, this);
        InterfaceC25791h2 interfaceC25791h2 = this.engine;
        if (interfaceC25791h2 != null) {
            interfaceC25791h2.mo43257a(view, list, this.adChoicesPlacement, mediaAdView);
        }
    }
}
