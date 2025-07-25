package com.unity3d.ads.core.data.datasource;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44980k;
import p1046xd.C44983m;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2", m17094f = "AndroidRemoteCacheDataSource.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class AndroidRemoteCacheDataSource$saveToCache$2 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final /* synthetic */ Object $body;
    final /* synthetic */ File $dest;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRemoteCacheDataSource$saveToCache$2(Object obj, File file, Continuation<? super AndroidRemoteCacheDataSource$saveToCache$2> continuation) {
        super(2, continuation);
        this.$body = obj;
        this.$dest = file;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AndroidRemoteCacheDataSource$saveToCache$2(this.$body, this.$dest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, (Continuation<Object>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            Object obj2 = this.$body;
            if (obj2 instanceof File) {
                C44983m.m1176q((File) obj2, this.$dest, true, 0, 4, null);
                return boxing.m17100a(((File) this.$body).delete());
            } else if (obj2 instanceof byte[]) {
                this.$dest.createNewFile();
                C44980k.m1183j(this.$dest, (byte[]) this.$body);
                return Unit.f99208a;
            } else {
                throw new IllegalStateException("Unknown body type".toString());
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<Object> continuation) {
        return ((AndroidRemoteCacheDataSource$saveToCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
