package com.mobilefuse.sdk.vast.endcard;

import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ThumbnailEndCardScheduler.kt */
@Metadata
/* loaded from: classes7.dex */
final class ThumbnailEndCardScheduler$getNextEndCardConfig$1 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ EndCardPresenter $presenter;
    final /* synthetic */ ThumbnailEndCardScheduler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbnailEndCardScheduler$getNextEndCardConfig$1(ThumbnailEndCardScheduler thumbnailEndCardScheduler, EndCardPresenter endCardPresenter) {
        super(0);
        this.this$0 = thumbnailEndCardScheduler;
        this.$presenter = endCardPresenter;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(invoke2());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2() {
        boolean isThumbnailModeActive;
        isThumbnailModeActive = this.this$0.isThumbnailModeActive(this.$presenter);
        return isThumbnailModeActive;
    }
}
