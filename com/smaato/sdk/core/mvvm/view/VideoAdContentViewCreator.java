package com.smaato.sdk.core.mvvm.view;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.mvvm.view.SmaatoSdkViewDelegate;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public interface VideoAdContentViewCreator {
    void createAdContentView(@NonNull Object obj, boolean z, boolean z2, @NonNull ImpressionCountingType impressionCountingType, @NonNull SmaatoSdkViewDelegate smaatoSdkViewDelegate, @NonNull Consumer<AdContentView> consumer, @NonNull Consumer<SmaatoSdkViewDelegate.VideoActivityLifecycleListener> consumer2);
}
