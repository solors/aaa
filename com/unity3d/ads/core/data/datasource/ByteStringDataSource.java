package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteStringDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public interface ByteStringDataSource {
    @Nullable
    Object get(@NotNull Continuation<? super ByteStringStoreOuterClass.ByteStringStore> continuation);

    @Nullable
    Object set(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);
}
