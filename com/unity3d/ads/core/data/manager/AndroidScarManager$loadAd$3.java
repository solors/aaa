package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidScarManager.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", m17094f = "AndroidScarManager.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class AndroidScarManager$loadAd$3 extends AbstractC37596l implements Function2<GmaEventData, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $placementId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidScarManager$loadAd$3(String str, Continuation<? super AndroidScarManager$loadAd$3> continuation) {
        super(2, continuation);
        this.$placementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AndroidScarManager$loadAd$3 androidScarManager$loadAd$3 = new AndroidScarManager$loadAd$3(this.$placementId, continuation);
        androidScarManager$loadAd$3.L$0 = obj;
        return androidScarManager$loadAd$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull GmaEventData gmaEventData, @Nullable Continuation<? super Boolean> continuation) {
        return ((AndroidScarManager$loadAd$3) create(gmaEventData, continuation)).invokeSuspend(Unit.f99208a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r0.contains(r6.getGmaEvent()) != false) goto L7;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            sd.C42683b.m6964e()
            int r0 = r5.label
            if (r0 != 0) goto L58
            p804nd.C38508r.m14539b(r6)
            java.lang.Object r6 = r5.L$0
            com.unity3d.ads.core.domain.scar.GmaEventData r6 = (com.unity3d.ads.core.domain.scar.GmaEventData) r6
            r0 = 2
            com.unity3d.scar.adapter.common.c[] r1 = new com.unity3d.scar.adapter.common.GMAEvent[r0]
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED
            r3 = 0
            r1[r3] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.LOAD_ERROR
            r4 = 1
            r1[r4] = r2
            java.util.List r1 = kotlin.collections.C37561t.m17197p(r1)
            com.unity3d.scar.adapter.common.c r2 = r6.getGmaEvent()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L35
            java.lang.String r1 = r6.getPlacementId()
            java.lang.String r2 = r5.$placementId
            boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r1, r2)
            if (r1 != 0) goto L52
        L35:
            r1 = 3
            com.unity3d.scar.adapter.common.c[] r1 = new com.unity3d.scar.adapter.common.GMAEvent[r1]
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.METHOD_ERROR
            r1[r3] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.SCAR_NOT_PRESENT
            r1[r4] = r2
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.INTERNAL_LOAD_ERROR
            r1[r0] = r2
            java.util.List r0 = kotlin.collections.C37561t.m17197p(r1)
            com.unity3d.scar.adapter.common.c r6 = r6.getGmaEvent()
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L53
        L52:
            r3 = r4
        L53:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.m17100a(r3)
            return r6
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
