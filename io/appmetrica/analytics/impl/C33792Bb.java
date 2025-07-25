package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Bb */
/* loaded from: classes9.dex */
public final class C33792Bb implements InterfaceC34685l2 {

    /* renamed from: a */
    public final C33785B4 f92613a;

    public C33792Bb(@NonNull C33785B4 c33785b4) {
        this.f92613a = c33785b4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34685l2
    @Nullable
    /* renamed from: a */
    public final C34517en mo21463a(@NonNull C34463cn c34463cn, @NonNull C34517en c34517en) {
        int i = c34463cn.f94128b;
        int i2 = this.f92613a.f92606a;
        if (i == i2) {
            if (((C34517en) ((HashMap) c34463cn.f94127a.get(c34517en.f94287b)).get(new String(c34517en.f94286a))) != null) {
                ((HashMap) c34463cn.f94127a.get(c34517en.f94287b)).put(new String(c34517en.f94286a), c34517en);
            }
        } else if (i < i2) {
            ((HashMap) c34463cn.f94127a.get(c34517en.f94287b)).put(new String(c34517en.f94286a), c34517en);
            c34463cn.f94128b++;
        }
        return c34517en;
    }
}
