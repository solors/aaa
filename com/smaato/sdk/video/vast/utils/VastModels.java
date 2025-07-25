package com.smaato.sdk.video.vast.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class VastModels {
    private VastModels() {
    }

    @NonNull
    public static <T, C extends Collection<T>> C requireNonEmpty(@Nullable C c, @Nullable String str) throws VastElementMissingException {
        if (c != null && !c.isEmpty()) {
            return c;
        }
        throw new VastElementMissingException(str);
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t, @Nullable String str) throws VastElementMissingException {
        if (t != null) {
            return t;
        }
        throw new VastElementMissingException(str);
    }

    @NonNull
    public static <T> List<T> toImmutableList(@Nullable List<T> list) {
        if (list != null && !list.isEmpty()) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return Collections.emptyList();
    }
}
