package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.p621di.ServiceProvider;
import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import ge.C33329j;
import ge.FlowCollector;
import ge.InterfaceC33327h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37727f3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p715i8.ScarAdMetadata;
import sd.C42688d;

/* compiled from: AndroidScarManager.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidScarManager implements ScarManager {
    @NotNull
    private final GMAScarAdapterBridge gmaBridge;
    @NotNull
    private final CommonScarEventReceiver scarEventReceiver;
    @NotNull
    private final ScarTimeHackFixer scarTimeHackFixer;

    public AndroidScarManager(@NotNull CommonScarEventReceiver scarEventReceiver, @NotNull GMAScarAdapterBridge gmaBridge, @NotNull ScarTimeHackFixer scarTimeHackFixer) {
        Intrinsics.checkNotNullParameter(scarEventReceiver, "scarEventReceiver");
        Intrinsics.checkNotNullParameter(gmaBridge, "gmaBridge");
        Intrinsics.checkNotNullParameter(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getSignals(@Nullable List<? extends InitializationResponseOuterClass.AdFormat> list, @NotNull Continuation<? super BiddingSignals> continuation) {
        return C37727f3.m16350e(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AndroidScarManager$getSignals$2(list, this, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getVersion(@NotNull Continuation<? super String> continuation) {
        return C37727f3.m16350e(5000L, new AndroidScarManager$getVersion$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, int r22, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            r16 = this;
            r9 = r16
            r0 = r23
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            if (r1 == 0) goto L17
            r1 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            goto L1c
        L17:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r1.<init>(r9, r0)
        L1c:
            r10 = r1
            java.lang.Object r0 = r10.result
            java.lang.Object r11 = sd.C42683b.m6964e()
            int r1 = r10.label
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L37
            if (r1 != r13) goto L2f
            p804nd.C38508r.m14539b(r0)
            goto L73
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            p804nd.C38508r.m14539b(r0)
            i8.d r0 = p715i8.UnityAdFormat.INTERSTITIAL
            java.lang.String r0 = r0.toString()
            r1 = r17
            boolean r2 = kotlin.text.C37686h.m16656y(r1, r0, r13)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r9.scarEventReceiver
            ge.d0 r14 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r15 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r21
            r5 = r19
            r6 = r20
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            ge.d0 r0 = ge.C33329j.m24109J(r14, r15)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r2 = r18
            r1.<init>(r2, r12)
            r10.label = r13
            java.lang.Object r0 = ge.C33329j.m24077x(r0, r1, r10)
            if (r0 != r11) goto L73
            return r11
        L73:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.c r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED
            r3 = 0
            if (r1 == r2) goto L80
            goto L81
        L80:
            r13 = r3
        L81:
            if (r13 == 0) goto L84
            r12 = r0
        L84:
            com.unity3d.ads.core.domain.scar.GmaEventData r12 = (com.unity3d.ads.core.domain.scar.GmaEventData) r12
            if (r12 == 0) goto La9
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.append(r2)
            java.lang.String r2 = r12.getErrorMessage()
            if (r2 != 0) goto L9e
            com.unity3d.scar.adapter.common.c r2 = r12.getGmaEvent()
        L9e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            throw r0
        La9:
            kotlin.Unit r0 = kotlin.Unit.f99208a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public InterfaceC33327h<GmaEventData> loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull ScarAdMetadata scarAdMetadata, @NotNull UnityBannerSize bannerSize, @NotNull final String opportunityId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(scarAdMetadata, "scarAdMetadata");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        final InterfaceC33327h m24110I = C33329j.m24110I(this.scarEventReceiver.getGmaEventFlow(), new AndroidScarManager$loadBannerAd$1(this, context, bannerView, opportunityId, scarAdMetadata, bannerSize, null));
        return new InterfaceC33327h<GmaEventData>() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata
            /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2 */
            /* loaded from: classes7.dex */
            public static final class C286602<T> implements FlowCollector {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @DebugMetadata(m17095c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", m17094f = "AndroidScarManager.kt", m17093l = {223}, m17092m = "emit")
                @Metadata
                /* renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C286611 extends AbstractC37589d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public C286611(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C286602.this.emit(null, this);
                    }
                }

                public C286602(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // ge.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C286602.C286611
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C286602.C286611) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = sd.C42683b.m6964e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        p804nd.C38508r.m14539b(r8)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        p804nd.C38508r.m14539b(r8)
                        ge.i r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.c r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.c r5 = com.unity3d.scar.adapter.common.GMAEvent.BANNER
                        if (r4 != r5) goto L4f
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.Intrinsics.m17075f(r2, r4)
                        if (r2 == 0) goto L4f
                        r2 = r3
                        goto L50
                    L4f:
                        r2 = 0
                    L50:
                        if (r2 == 0) goto L5b
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L5b
                        return r1
                    L5b:
                        kotlin.Unit r7 = kotlin.Unit.f99208a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.C286602.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // ge.InterfaceC33327h
            @Nullable
            public Object collect(@NotNull FlowCollector<? super GmaEventData> flowCollector, @NotNull Continuation continuation) {
                Object m6959e;
                Object collect = InterfaceC33327h.this.collect(new C286602(flowCollector, opportunityId), continuation);
                m6959e = C42688d.m6959e();
                if (collect == m6959e) {
                    return collect;
                }
                return Unit.f99208a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public InterfaceC33327h<GmaEventData> show(@NotNull String placementId, @NotNull String queryId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(queryId, "queryId");
        return C33329j.m24101R(C33329j.m24109J(this.scarEventReceiver.getGmaEventFlow(), new AndroidScarManager$show$1(this, placementId, queryId, null)), new AndroidScarManager$show$2(null));
    }
}
