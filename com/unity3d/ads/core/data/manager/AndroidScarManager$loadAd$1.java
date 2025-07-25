package com.unity3d.ads.core.data.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidScarManager.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.manager.AndroidScarManager", m17094f = "AndroidScarManager.kt", m17093l = {89}, m17092m = "loadAd")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidScarManager$loadAd$1 extends AbstractC37589d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidScarManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$1(AndroidScarManager androidScarManager, Continuation<? super AndroidScarManager$loadAd$1> continuation) {
        super(continuation);
        this.this$0 = androidScarManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAd(null, null, null, null, null, 0, this);
    }
}
