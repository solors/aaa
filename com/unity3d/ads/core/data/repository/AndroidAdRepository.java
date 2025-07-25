package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAdRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidAdRepository implements AdRepository {
    @NotNull
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public Object addAd(@NotNull ByteString byteString, @NotNull AdObject adObject, @NotNull Continuation<? super Unit> continuation) {
        this.loadedAds.put(byteString, adObject);
        return Unit.f99208a;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public Object getAd(@NotNull ByteString byteString, @NotNull Continuation<? super AdObject> continuation) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public Object hasOpportunityId(@NotNull ByteString byteString, @NotNull Continuation<? super Boolean> continuation) {
        return boxing.m17100a(this.loadedAds.containsKey(byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    @Nullable
    public Object removeAd(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation) {
        this.loadedAds.remove(byteString);
        return Unit.f99208a;
    }
}
