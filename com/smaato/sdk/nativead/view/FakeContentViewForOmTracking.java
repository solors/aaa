package com.smaato.sdk.nativead.view;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p573ui.AdContentView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class FakeContentViewForOmTracking extends AdContentView {
    String omTrackerUrl;
    View viewRegisteredForImpression;

    public FakeContentViewForOmTracking(View view, String str) {
        super(view.getContext());
        this.viewRegisteredForImpression = view;
        this.omTrackerUrl = str;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForOmTracking() {
        return this.viewRegisteredForImpression;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForVisibilityTracking() {
        return this.viewRegisteredForImpression;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap() {
        ViewabilityVerificationResource viewabilityVerificationResource = new ViewabilityVerificationResource("iabtechlab.com-omid", this.omTrackerUrl, "", "iabtechlab-smaato", true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(viewabilityVerificationResource);
        HashMap hashMap = new HashMap();
        hashMap.put(CampaignEx.KEY_OMID, arrayList);
        return hashMap;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void destroy() {
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void startShowingView() {
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void showProgressIndicator(boolean z) {
    }
}
