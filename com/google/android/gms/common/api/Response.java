package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes4.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t) {
        this.zza = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Response(@NonNull T t) {
        this.zza = t;
    }
}
