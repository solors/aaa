package com.unity3d.services.core.domain;

import androidx.exifinterface.media.ExifInterface;
import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

@Metadata
/* renamed from: com.unity3d.services.core.domain.ResultExtensionsKt */
/* loaded from: classes7.dex */
public final class ResultExtensions {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        Throwable m14546e = Result.m14546e(obj);
        Intrinsics.m17067n(3, ExifInterface.LONGITUDE_EAST);
        if (m14546e instanceof Exception) {
            return (E) m14546e;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        Throwable m14546e = Result.m14546e(obj);
        Intrinsics.m17067n(3, ExifInterface.LONGITUDE_EAST);
        if (m14546e instanceof Exception) {
            return (E) m14546e;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    @Nullable
    public static final InitializationException getInitializationExceptionOrNull(@NotNull Object obj) {
        Throwable m14546e = Result.m14546e(obj);
        if (m14546e instanceof InitializationException) {
            return (InitializationException) m14546e;
        }
        return null;
    }

    @NotNull
    public static final InitializationException getInitializationExceptionOrThrow(@NotNull Object obj) {
        Throwable m14546e = Result.m14546e(obj);
        if (m14546e instanceof InitializationException) {
            return (InitializationException) m14546e;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
