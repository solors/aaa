package com.p551my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25846ja;
import com.p551my.target.C25902m;
import com.p551my.target.C26253y9;
import com.p551my.target.ads.MyTargetView;
import com.p551my.target.common.CustomParams;
import com.p551my.target.common.models.IAdLoadingError;
import com.p551my.target.mediation.MediationStandardAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetStandardAdAdapter */
/* loaded from: classes7.dex */
public final class MyTargetStandardAdAdapter implements MediationStandardAdAdapter {
    @Nullable
    private MyTargetView myTargetView;
    @Nullable
    private C26253y9 section;

    /* renamed from: com.my.target.mediation.MyTargetStandardAdAdapter$AdListener */
    /* loaded from: classes7.dex */
    public class AdListener implements MyTargetView.MyTargetViewListener {
        @NonNull
        private final MediationStandardAdAdapter.MediationStandardAdListener mediationListener;

        public AdListener(@NonNull MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener) {
            this.mediationListener = mediationStandardAdListener;
        }

        @Override // com.p551my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(@NonNull MyTargetView myTargetView) {
            AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Ad clicked");
            this.mediationListener.onClick(MyTargetStandardAdAdapter.this);
        }

        @Override // com.p551my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(@NonNull MyTargetView myTargetView) {
            AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Ad loaded");
            this.mediationListener.onLoad(myTargetView, MyTargetStandardAdAdapter.this);
        }

        @Override // com.p551my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView) {
            AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.mediationListener.onNoAd(iAdLoadingError, MyTargetStandardAdAdapter.this);
        }

        @Override // com.p551my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(@NonNull MyTargetView myTargetView) {
            AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Ad shown");
            this.mediationListener.onShow(MyTargetStandardAdAdapter.this);
        }
    }

    @Override // com.p551my.target.mediation.MediationAdapter
    public void destroy() {
        MyTargetView myTargetView = this.myTargetView;
        if (myTargetView == null) {
            return;
        }
        myTargetView.setListener(null);
        this.myTargetView.destroy();
        this.myTargetView = null;
    }

    @Override // com.p551my.target.mediation.MediationStandardAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MyTargetView.AdSize adSize, @NonNull MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            MyTargetView myTargetView = new MyTargetView(context);
            this.myTargetView = myTargetView;
            myTargetView.setSlotId(parseInt);
            this.myTargetView.setAdSize(adSize);
            this.myTargetView.setRefreshAd(false);
            this.myTargetView.setMediationEnabled(false);
            this.myTargetView.setListener(new AdListener(mediationStandardAdListener));
            CustomParams customParams = this.myTargetView.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Got banner from mediation response");
                this.myTargetView.handleSection(this.section, adSize);
            } else if (TextUtils.isEmpty(payload)) {
                AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Load id " + parseInt);
                this.myTargetView.load();
            } else {
                AbstractC25846ja.m43680a("MyTargetStandardAdAdapter: Load id " + parseInt + " from BID " + payload);
                this.myTargetView.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            AbstractC25846ja.m43678b("MyTargetStandardAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationStandardAdListener.onNoAd(C25902m.f67233o, this);
        }
    }

    public void setSection(@Nullable C26253y9 c26253y9) {
        this.section = c26253y9;
    }
}
