package com.mobilefuse.videoplayer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: VideoPlayerController.kt */
@Metadata
/* renamed from: com.mobilefuse.videoplayer.VideoPlayerController$selectBestMediaFile$selectFailureCallback$1 */
/* loaded from: classes7.dex */
final class C23748xb9344610 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Function1 $selectMediaFileListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23748xb9344610(Function1 function1) {
        super(0);
        this.$selectMediaFileListener = function1;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectMediaFileListener.invoke(null);
    }
}
