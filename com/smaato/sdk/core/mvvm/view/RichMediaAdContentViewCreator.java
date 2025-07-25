package com.smaato.sdk.core.mvvm.view;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.p573ui.AdContentView;

/* loaded from: classes7.dex */
public interface RichMediaAdContentViewCreator {
    AdContentView createAdContentView(@NonNull Context context, @NonNull String str, int i, int i2, boolean z, @NonNull ImpressionCountingType impressionCountingType, @NonNull SmaatoSdkViewDelegate smaatoSdkViewDelegate);
}
