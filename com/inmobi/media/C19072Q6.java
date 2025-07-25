package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Q6 */
/* loaded from: classes6.dex */
public final class C19072Q6 implements InterfaceC19431qc {

    /* renamed from: a */
    public final Rect f47644a = new Rect();

    @Override // com.inmobi.media.InterfaceC19431qc
    /* renamed from: a */
    public final boolean mo59925a(View rootView, View adView, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(adView, "adView");
        return true;
    }

    @Override // com.inmobi.media.InterfaceC19431qc
    /* renamed from: a */
    public final boolean mo59924a(View view, View view2, int i, Object obj) {
        C18853A7 mediaPlayer;
        if ((obj instanceof C19020M6) && !((C19020M6) obj).f47507s) {
            if ((!(view2 instanceof C19273f8) || (mediaPlayer = ((C19273f8) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f47094a) && view2 != null && view2.isShown()) {
                if ((view != null ? view.getParent() : null) != null && view2.getGlobalVisibleRect(this.f47644a)) {
                    long height = this.f47644a.height() * this.f47644a.width();
                    long width = view.getWidth() * view.getHeight();
                    return width > 0 && ((long) 100) * height >= ((long) i) * width;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
