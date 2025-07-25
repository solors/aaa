package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.d */
/* loaded from: classes7.dex */
public final class CollectionsConcurrencyUtil {
    @NotNull
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    public static final synchronized void addToSet(@NotNull HashSet<String> hashset, @NotNull String set) {
        synchronized (CollectionsConcurrencyUtil.class) {
            Intrinsics.checkNotNullParameter(hashset, "hashset");
            Intrinsics.checkNotNullParameter(set, "set");
            hashset.add(set);
        }
    }

    @NotNull
    public static final synchronized HashSet<String> getNewHashSet(@Nullable HashSet<String> hashSet) {
        HashSet<String> hashSet2;
        synchronized (CollectionsConcurrencyUtil.class) {
            hashSet2 = new HashSet<>(hashSet);
        }
        return hashSet2;
    }
}
