package io.bidmachine.media3.common;

import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: io.bidmachine.media3.common.t0 */
/* loaded from: classes9.dex */
public final /* synthetic */ class C35890t0 implements ListenerSet.Event {
    @Override // io.bidmachine.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
