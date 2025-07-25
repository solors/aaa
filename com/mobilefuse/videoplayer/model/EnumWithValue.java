package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnumWithValue.kt */
@Metadata
/* loaded from: classes7.dex */
public interface EnumWithValue<T> {

    /* compiled from: EnumWithValue.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static <T> String getStringValue(@NotNull EnumWithValue<T> enumWithValue) {
            return String.valueOf(enumWithValue.getValue());
        }
    }

    @NotNull
    String getStringValue();

    T getValue();
}
