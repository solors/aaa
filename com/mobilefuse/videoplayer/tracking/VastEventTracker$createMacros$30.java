package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.sdk.rtb.IfaType;
import com.mobilefuse.videoplayer.model.VastError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastEventTracker.kt */
@Metadata
/* loaded from: classes7.dex */
final class VastEventTracker$createMacros$30 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$30 INSTANCE = new VastEventTracker$createMacros$30();

    VastEventTracker$createMacros$30() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@Nullable VastError vastError) {
        return IfaType.ANDROID_ID.getValue();
    }
}
