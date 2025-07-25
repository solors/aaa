package com.smaato.sdk.core.p573ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.ui.AdContentView */
/* loaded from: classes7.dex */
public abstract class AdContentView extends FrameLayout {
    protected static final String OMID = "omid";

    public AdContentView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static FrameLayout.LayoutParams generateDefaultLayoutParams(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2, 17);
    }

    public abstract void destroy();

    @NonNull
    public abstract View getViewForOmTracking();

    @NonNull
    public abstract View getViewForVisibilityTracking();

    public abstract Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap();

    @MainThread
    public abstract void showProgressIndicator(boolean z);

    @MainThread
    public abstract void startShowingView();

    public AdContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public AdContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
