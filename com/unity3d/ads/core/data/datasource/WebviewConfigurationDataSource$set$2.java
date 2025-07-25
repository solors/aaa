package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.WebviewConfigurationStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebviewConfigurationDataSource.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", m17094f = "WebviewConfigurationDataSource.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class WebviewConfigurationDataSource$set$2 extends AbstractC37596l implements Function2<WebviewConfigurationStore.WebViewConfigurationStore, Continuation<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
    final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewConfigurationDataSource$set$2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, Continuation<? super WebviewConfigurationDataSource$set$2> continuation) {
        super(2, continuation);
        this.$data = webViewConfigurationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebviewConfigurationDataSource$set$2(this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @Nullable Continuation<? super WebviewConfigurationStore.WebViewConfigurationStore> continuation) {
        return ((WebviewConfigurationDataSource$set$2) create(webViewConfigurationStore, continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            return this.$data;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
