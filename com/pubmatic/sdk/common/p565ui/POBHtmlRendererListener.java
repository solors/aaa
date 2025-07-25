package com.pubmatic.sdk.common.p565ui;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;

/* renamed from: com.pubmatic.sdk.common.ui.POBHtmlRendererListener */
/* loaded from: classes7.dex */
public interface POBHtmlRendererListener {
    void onRenderProcessGone();

    void onViewClicked(@Nullable String str);

    void onViewRendered(@NonNull View view);

    void onViewRenderingFailed(@NonNull POBError pOBError);
}
