package io.bidmachine.rendering.internal.adform.video.player;

import android.content.Context;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.internal.adform.video.player.exo.C36985a;
import io.bidmachine.rendering.internal.adform.video.player.media.C36987a;
import java.util.Objects;

/* renamed from: io.bidmachine.rendering.internal.adform.video.player.c */
/* loaded from: classes9.dex */
public abstract class AbstractC36982c {
    /* renamed from: a */
    public static InterfaceC36981b m19371a(Context context, String str) {
        if (Objects.equals(str, "exo")) {
            AbstractC37037k.m19162b("PlayerFactory", "Create player (ExoPlayerImpl)", new Object[0]);
            return new C36985a(context);
        }
        AbstractC37037k.m19162b("PlayerFactory", "Create player (MediaPlayerImpl)", new Object[0]);
        return new C36987a(context);
    }
}
