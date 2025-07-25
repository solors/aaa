package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppSetIdManager.kt */
@DebugMetadata(m17095c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl", m17094f = "AppSetIdManager.kt", m17093l = {55}, m17092m = "getAppSetId")
@Metadata
/* loaded from: classes2.dex */
public final class AppSetIdManager$Api33Ext4Impl$getAppSetId$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSetIdManager.Api33Ext4Impl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Api33Ext4Impl$getAppSetId$1(AppSetIdManager.Api33Ext4Impl api33Ext4Impl, Continuation<? super AppSetIdManager$Api33Ext4Impl$getAppSetId$1> continuation) {
        super(continuation);
        this.this$0 = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAppSetId(this);
    }
}
