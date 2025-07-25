package com.mobilefuse.videoplayer;

import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastVerificationError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerController.kt */
@Metadata
/* loaded from: classes7.dex */
final class VideoPlayerController$sendAdVerificationError$customMacros$1 extends Lambda implements Function1<VastError, String> {
    final /* synthetic */ VastVerificationError $error;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayerController$sendAdVerificationError$customMacros$1(VastVerificationError vastVerificationError) {
        super(1);
        this.$error = vastVerificationError;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        return String.valueOf(this.$error.getErrorCode());
    }
}
