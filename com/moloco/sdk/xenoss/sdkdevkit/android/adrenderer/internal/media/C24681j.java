package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j */
/* loaded from: classes7.dex */
public final class C24681j {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC24650f.AbstractC24651a.AbstractC24652a m45936a(@NotNull Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof UnknownHostException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24669q.f63699a;
        }
        if (e instanceof SocketException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24661i.f63691a;
        }
        if (e instanceof SSLHandshakeException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24662j.f63692a;
        }
        if (e instanceof IOException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24658f.f63688a;
        }
        if (e instanceof SecurityException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24659g.f63689a;
        }
        if (e instanceof C24682k) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24665m.f63695a;
        }
        if (e instanceof NumberFormatException) {
            return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24664l.f63694a;
        }
        return InterfaceC24650f.AbstractC24651a.AbstractC24652a.C24670r.f63700a;
    }
}
