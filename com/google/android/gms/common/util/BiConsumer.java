package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@NonNull T t, @NonNull U u);
}
