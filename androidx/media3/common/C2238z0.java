package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.common.z0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2238z0 implements ListenerSet.Event {
    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
