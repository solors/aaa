package com.mobilefuse.videoplayer.utils;

import com.mobilefuse.videoplayer.model.enums;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.utils.EnumExtensionsKt */
/* loaded from: classes7.dex */
public final class EnumExtensions {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/mobilefuse/videoplayer/model/EnumWithValue<*>;>(Ljava/lang/String;)TT; */
    public static final /* synthetic */ Enum enumValueFromString(String str) {
        if (str == null) {
            return null;
        }
        Intrinsics.m17067n(5, "T");
        return null;
    }

    public static final boolean isAutoplayed(@NotNull enums isAutoplayed) {
        Intrinsics.checkNotNullParameter(isAutoplayed, "$this$isAutoplayed");
        if (isAutoplayed != enums.UNMUTED_AUTOPLAY && isAutoplayed != enums.MUTED_AUTOPLAY) {
            return false;
        }
        return true;
    }

    public static final /* synthetic */ <T extends Enum<T>> T valueOfOrNull(String str) {
        if (str == null) {
            return null;
        }
        try {
            Intrinsics.m17067n(4, "T");
            return (T) Enum.valueOf(Enum.class, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
