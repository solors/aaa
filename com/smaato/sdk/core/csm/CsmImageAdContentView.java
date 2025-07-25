package com.smaato.sdk.core.csm;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p573ui.AdContentView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class CsmImageAdContentView extends AdContentView {
    private View csmView;

    public CsmImageAdContentView(@NonNull Context context, @NonNull View view) {
        super(context);
        this.csmView = view;
        addView(view);
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void destroy() {
        this.csmView = null;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForOmTracking() {
        return this.csmView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForVisibilityTracking() {
        return this.csmView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap() {
        return new HashMap();
    }

    public CsmImageAdContentView(@NonNull Context context) {
        super(context);
        this.csmView = null;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void startShowingView() {
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void showProgressIndicator(boolean z) {
    }
}
