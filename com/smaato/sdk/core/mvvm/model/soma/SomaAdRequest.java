package com.smaato.sdk.core.mvvm.model.soma;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.mvvm.model.AdRequest;

/* loaded from: classes7.dex */
public abstract class SomaAdRequest {
    private final AdRequest adRequest;

    public SomaAdRequest(@NonNull AdRequest adRequest) {
        this.adRequest = adRequest;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.adRequest;
    }
}
