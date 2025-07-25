package com.smaato.sdk.core.mvvm.model.csm;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes7.dex */
public class CsmException extends IOException {
    @NonNull
    public CsmParameters csmParameters;
    @NonNull
    public String somaCsmJson;

    public CsmException(@NonNull String str, @NonNull CsmParameters csmParameters) {
        this.somaCsmJson = str;
        this.csmParameters = csmParameters;
    }
}
