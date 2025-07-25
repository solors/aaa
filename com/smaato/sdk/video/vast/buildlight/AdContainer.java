package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.C27719Ad;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.buildlight.a */
/* loaded from: classes7.dex */
public class AdContainer<VastModel> {
    @NonNull

    /* renamed from: a */
    public final C27719Ad f72441a;
    @NonNull

    /* renamed from: b */
    public final VastModel f72442b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdContainer(@NonNull C27719Ad c27719Ad, @NonNull VastModel vastmodel) {
        Objects.requireNonNull(c27719Ad, "Parameter ad cannot be null for AdContainer::new");
        Objects.requireNonNull(vastmodel, "Parameter model cannot be null for AdContainer::new");
        this.f72441a = c27719Ad;
        this.f72442b = vastmodel;
    }
}
