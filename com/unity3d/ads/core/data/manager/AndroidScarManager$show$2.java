package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.GMAEvent;
import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: AndroidScarManager.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", m17094f = "AndroidScarManager.kt", m17093l = {123}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class AndroidScarManager$show$2 extends AbstractC37596l implements InterfaceC45268n<FlowCollector<? super GmaEventData>, GmaEventData, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidScarManager$show$2(Continuation<? super AndroidScarManager$show$2> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super GmaEventData> flowCollector, @NotNull GmaEventData gmaEventData, @Nullable Continuation<? super Boolean> continuation) {
        AndroidScarManager$show$2 androidScarManager$show$2 = new AndroidScarManager$show$2(continuation);
        androidScarManager$show$2.L$0 = flowCollector;
        androidScarManager$show$2.L$1 = gmaEventData;
        return androidScarManager$show$2.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        GmaEventData gmaEventData;
        boolean m17338N;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                gmaEventData = (GmaEventData) this.L$0;
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
            this.L$0 = gmaEventData2;
            this.label = 1;
            if (((FlowCollector) this.L$0).emit(gmaEventData2, this) == m6959e) {
                return m6959e;
            }
            gmaEventData = gmaEventData2;
        }
        m17338N = _Arrays.m17338N(new GMAEvent[]{GMAEvent.AD_CLOSED, GMAEvent.NO_AD_ERROR, GMAEvent.INTERSTITIAL_SHOW_ERROR, GMAEvent.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent());
        return boxing.m17100a(!m17338N);
    }
}
