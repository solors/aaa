package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowEvent;
import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p1076zd.InterfaceC45271q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LegacyShowUseCase$invoke$4<T> implements FlowCollector {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ InterfaceC45271q<String, UnityAds.UnityAdsShowError, String, Integer, String, Continuation<? super Unit>, Object> $reportShowError;
    final /* synthetic */ long $startTime;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4(LegacyShowUseCase legacyShowUseCase, long j, String str, Listeners listeners, AdObject adObject, InterfaceC45271q<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super Continuation<? super Unit>, ? extends Object> interfaceC45271q) {
        this.this$0 = legacyShowUseCase;
        this.$startTime = j;
        this.$placement = str;
        this.$listeners = listeners;
        this.$adObject = adObject;
        this.$reportShowError = interfaceC45271q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.ShowEvent r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4.emit(com.unity3d.ads.core.data.model.ShowEvent, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // ge.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((ShowEvent) obj, (Continuation<? super Unit>) continuation);
    }
}
