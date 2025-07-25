package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.videoplayer.model.VastError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastEventTracker.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastEventTracker$createMacros$26 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$26 INSTANCE = new VastEventTracker$createMacros$26();

    VastEventTracker$createMacros$26() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        String valueOf;
        return (vastError == null || (valueOf = String.valueOf(vastError.getErrorCode())) == null) ? "-1" : valueOf;
    }
}
