package com.smaato.sdk.core.mvvm.viewmodel;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.mvvm.model.imagead.Extension;
import java.util.List;

/* loaded from: classes7.dex */
public interface SmaatoSdkViewModelListener {
    void onCsmAdObjectLoaded(@NonNull Object obj, @NonNull ImpressionCountingType impressionCountingType);

    void onImageAdLoaded(@NonNull Bitmap bitmap, int i, int i2, @Nullable List<Extension> list, @NonNull ImpressionCountingType impressionCountingType);

    void onRichMediaAdLoaded(@NonNull String str, int i, int i2, @NonNull ImpressionCountingType impressionCountingType);

    void onVideoAdLoaded(@NonNull Object obj, @NonNull ImpressionCountingType impressionCountingType);
}
