package com.p551my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.AbstractC26019q;
import com.p551my.target.C25658b7;
import com.p551my.target.C25681c7;
import com.p551my.target.C25735ea;
import com.p551my.target.C25752f7;
import com.p551my.target.C25902m;
import com.p551my.target.C25974o2;
import com.p551my.target.C25984o7;
import com.p551my.target.C26233y0;
import com.p551my.target.C26272z6;
import com.p551my.target.common.BaseAd;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.banners.NativeAppwallBanner;
import com.p551my.target.nativeads.views.AppwallAdView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeAppwallAd */
/* loaded from: classes7.dex */
public final class NativeAppwallAd extends BaseAd {
    private static final String DEFAULT_TITLE = "Apps";
    private static final int DEFAULT_TITLE_BACKGROUND_COLOR = -12232093;
    private static final int DEFAULT_TITLE_SUPPLEMENTARY_COLOR = -13220531;
    private static final int DEFAULT_TITLE_TEXT_COLOR = -1;
    @NonNull
    private final ArrayList<NativeAppwallBanner> banners;
    @NonNull
    private final HashMap<NativeAppwallBanner, C26272z6> bannersMap;
    @NonNull
    private final C26233y0 clickHandler;
    @NonNull
    private final Context context;
    @Nullable
    private C25658b7 engine;
    private boolean hideStatusBarInDialog;
    @Nullable
    private AppwallAdListener listener;
    @Nullable
    private C25752f7 section;
    @NonNull
    private String title;
    private int titleBackgroundColor;
    private int titleSupplementaryColor;
    private int titleTextColor;
    @Nullable
    private WeakReference<AppwallAdView> viewWeakReference;

    /* renamed from: com.my.target.nativeads.NativeAppwallAd$AppwallAdListener */
    /* loaded from: classes7.dex */
    public interface AppwallAdListener {
        void onClick(@NonNull NativeAppwallBanner nativeAppwallBanner, @NonNull NativeAppwallAd nativeAppwallAd);

        void onDismiss(@NonNull NativeAppwallAd nativeAppwallAd);

        void onDisplay(@NonNull NativeAppwallAd nativeAppwallAd);

        void onLoad(@NonNull NativeAppwallAd nativeAppwallAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAppwallAd nativeAppwallAd);
    }

    public NativeAppwallAd(int i, @NonNull Context context) {
        super(i, "appwall");
        this.clickHandler = C26233y0.m42418a();
        this.bannersMap = new HashMap<>();
        this.banners = new ArrayList<>();
        this.title = DEFAULT_TITLE;
        this.titleBackgroundColor = DEFAULT_TITLE_BACKGROUND_COLOR;
        this.titleSupplementaryColor = DEFAULT_TITLE_SUPPLEMENTARY_COLOR;
        this.titleTextColor = -1;
        this.hideStatusBarInDialog = false;
        this.context = context;
        this.adConfig.setCachePolicy(0);
        AbstractC25846ja.m43676c("Native appwall ad created. Version - 5.22.1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(@Nullable C25752f7 c25752f7, @Nullable IAdLoadingError iAdLoadingError) {
        AppwallAdListener appwallAdListener = this.listener;
        if (appwallAdListener == null) {
            return;
        }
        if (c25752f7 == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = C25902m.f67227i;
            }
            appwallAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        this.section = c25752f7;
        for (C26272z6 c26272z6 : c25752f7.m43925c()) {
            NativeAppwallBanner newBanner = NativeAppwallBanner.newBanner(c26272z6);
            this.banners.add(newBanner);
            this.bannersMap.put(newBanner, c26272z6);
        }
        this.listener.onLoad(this);
    }

    public static void loadImageToView(@NonNull ImageData imageData, @NonNull ImageView imageView) {
        C25974o2.m43269b(imageData, imageView);
    }

    public void destroy() {
        unregisterAppwallAdView();
        C25658b7 c25658b7 = this.engine;
        if (c25658b7 != null) {
            c25658b7.m44168a();
            this.engine = null;
        }
        this.listener = null;
    }

    public void dismiss() {
        C25658b7 c25658b7 = this.engine;
        if (c25658b7 != null) {
            c25658b7.m44162b();
        }
    }

    @NonNull
    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.banners;
    }

    public long getCachePeriod() {
        return this.adConfig.getCachePeriod();
    }

    @Nullable
    public AppwallAdListener getListener() {
        return this.listener;
    }

    @NonNull
    public String getTitle() {
        return this.title;
    }

    public int getTitleBackgroundColor() {
        return this.titleBackgroundColor;
    }

    public int getTitleSupplementaryColor() {
        return this.titleSupplementaryColor;
    }

    public int getTitleTextColor() {
        return this.titleTextColor;
    }

    public void handleBannerClick(NativeAppwallBanner nativeAppwallBanner) {
        C26272z6 c26272z6 = this.bannersMap.get(nativeAppwallBanner);
        if (c26272z6 != null) {
            this.clickHandler.m42417a(c26272z6, 1, this.context);
            if (this.section != null) {
                nativeAppwallBanner.setHasNotification(false);
                C25984o7.m43240a(this.section, this.adConfig).m43237a(c26272z6, false, this.context);
            }
            AppwallAdListener appwallAdListener = this.listener;
            if (appwallAdListener != null) {
                appwallAdListener.onClick(nativeAppwallBanner, this);
                return;
            }
            return;
        }
        AbstractC25846ja.m43680a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannerShow(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        C26272z6 c26272z6 = this.bannersMap.get(nativeAppwallBanner);
        if (c26272z6 != null) {
            C25735ea.m43958a(c26272z6.getStatHolder().m43997b("playbackStarted"), this.context);
            return;
        }
        AbstractC25846ja.m43680a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannersShow(@NonNull List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner nativeAppwallBanner : list) {
            C26272z6 c26272z6 = this.bannersMap.get(nativeAppwallBanner);
            if (c26272z6 != null) {
                AbstractC25846ja.m43680a("NativeAppwallAd: Ad shown, banner Id = " + nativeAppwallBanner.getId());
                arrayList.addAll(c26272z6.getStatHolder().m43997b("playbackStarted"));
            } else {
                AbstractC25846ja.m43680a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
            }
        }
        if (arrayList.size() > 0) {
            C25735ea.m43958a(arrayList, this.context);
        }
    }

    public boolean hasNotifications() {
        for (NativeAppwallBanner nativeAppwallBanner : this.bannersMap.keySet()) {
            if (nativeAppwallBanner.isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int cachePolicy = this.adConfig.getCachePolicy();
        if (cachePolicy == 0 || cachePolicy == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideStatusBarInDialog() {
        return this.hideStatusBarInDialog;
    }

    public void load() {
        if (isLoadCalled()) {
            AbstractC25846ja.m43680a("NativeAppwallAd: Appwall ad doesn't support multiple load");
            handleResult(null, C25902m.f67238t);
            return;
        }
        C25681c7.m44080a(this.adConfig, this.metricFactory).m43581a(new C25681c7.InterfaceC25683b() { // from class: com.my.target.nativeads.c
            @Override // com.p551my.target.AbstractC25877l.InterfaceC25879b
            /* renamed from: a */
            public final void mo18137a(AbstractC26019q abstractC26019q, C25902m c25902m) {
                NativeAppwallAd.this.handleResult((C25752f7) abstractC26019q, c25902m);
            }
        }).mo42269a(this.metricFactory.m42906a(), this.context);
    }

    @Nullable
    public String prepareBannerClickLink(NativeAppwallBanner nativeAppwallBanner) {
        C26272z6 c26272z6 = this.bannersMap.get(nativeAppwallBanner);
        if (c26272z6 != null) {
            C25735ea.m43958a(c26272z6.getStatHolder().m43997b("click"), this.context);
            C25752f7 c25752f7 = this.section;
            if (c25752f7 != null) {
                C25984o7.m43240a(c25752f7, this.adConfig).m43237a(c26272z6, false, this.context);
            }
            return c26272z6.getTrackingLink();
        }
        AbstractC25846ja.m43680a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
        return null;
    }

    public void registerAppwallAdView(@NonNull AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.viewWeakReference = new WeakReference<>(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new AppwallAdView.AppwallAdViewListener() { // from class: com.my.target.nativeads.NativeAppwallAd.1
            @Override // com.p551my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
            public void onBannerClick(@NonNull NativeAppwallBanner nativeAppwallBanner) {
                AppwallAdView appwallAdView2;
                NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
                WeakReference weakReference = NativeAppwallAd.this.viewWeakReference;
                if (weakReference != null && (appwallAdView2 = (AppwallAdView) weakReference.get()) != null) {
                    appwallAdView2.notifyDataSetChanged();
                }
            }

            @Override // com.p551my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
            public void onBannersShow(@NonNull List<NativeAppwallBanner> list) {
                NativeAppwallAd.this.handleBannersShow(list);
            }
        });
    }

    public void setAutoLoadImages(boolean z) {
        this.adConfig.setCachePolicy(0);
    }

    public void setCachePeriod(long j) {
        this.adConfig.setCachePeriod(j);
    }

    public void setHideStatusBarInDialog(boolean z) {
        this.hideStatusBarInDialog = z;
    }

    public void setListener(@Nullable AppwallAdListener appwallAdListener) {
        this.listener = appwallAdListener;
    }

    public void setTitle(@NonNull String str) {
        this.title = str;
    }

    public void setTitleBackgroundColor(int i) {
        this.titleBackgroundColor = i;
    }

    public void setTitleSupplementaryColor(int i) {
        this.titleSupplementaryColor = i;
    }

    public void setTitleTextColor(int i) {
        this.titleTextColor = i;
    }

    public void show() {
        if (this.section != null && this.banners.size() > 0) {
            if (this.engine == null) {
                this.engine = C25658b7.m44163a(this);
            }
            this.engine.m44166a(this.context);
            return;
        }
        AbstractC25846ja.m43676c("Native appwall ad show - no ad");
    }

    public void unregisterAppwallAdView() {
        WeakReference<AppwallAdView> weakReference = this.viewWeakReference;
        if (weakReference != null) {
            AppwallAdView appwallAdView = weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener(null);
            }
            this.viewWeakReference.clear();
            this.viewWeakReference = null;
        }
    }
}
