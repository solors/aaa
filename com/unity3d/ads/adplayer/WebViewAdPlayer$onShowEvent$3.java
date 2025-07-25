package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: WebViewAdPlayer.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", m17094f = "WebViewAdPlayer.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$onShowEvent$3 extends AbstractC37596l implements InterfaceC45268n<ShowEvent, Boolean, Continuation<? super ShowEvent>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewAdPlayer$onShowEvent$3(Continuation<? super WebViewAdPlayer$onShowEvent$3> continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull ShowEvent showEvent, boolean z, @Nullable Continuation<? super ShowEvent> continuation) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(continuation);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            ShowEvent showEvent = (ShowEvent) this.L$0;
            if (this.Z$0) {
                return new ShowEvent.Completed(ShowStatus.COMPLETED);
            }
            return showEvent;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Object invoke(ShowEvent showEvent, Boolean bool, Continuation<? super ShowEvent> continuation) {
        return invoke(showEvent, bool.booleanValue(), continuation);
    }
}
