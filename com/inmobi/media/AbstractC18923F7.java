package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.F7 */
/* loaded from: classes6.dex */
public abstract class AbstractC18923F7 extends FrameLayout {

    /* renamed from: a */
    public final byte f47234a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC18923F7(Context context, byte b) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47234a = b;
    }

    /* renamed from: a */
    public abstract void mo61116a(C19216b7 c19216b7, InterfaceC18937G7 interfaceC18937G7, int i, int i2, InterfaceC18909E7 interfaceC18909E7);

    public final byte getType() {
        return this.f47234a;
    }
}
