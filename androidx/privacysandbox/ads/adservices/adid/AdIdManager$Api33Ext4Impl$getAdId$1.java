package androidx.privacysandbox.ads.adservices.adid;

import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdIdManager.kt */
@DebugMetadata(m17095c = "androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl", m17094f = "AdIdManager.kt", m17093l = {62}, m17092m = "getAdId")
@Metadata
/* loaded from: classes2.dex */
public final class AdIdManager$Api33Ext4Impl$getAdId$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdIdManager.Api33Ext4Impl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManager$Api33Ext4Impl$getAdId$1(AdIdManager.Api33Ext4Impl api33Ext4Impl, Continuation<? super AdIdManager$Api33Ext4Impl$getAdId$1> continuation) {
        super(continuation);
        this.this$0 = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAdId(this);
    }
}
