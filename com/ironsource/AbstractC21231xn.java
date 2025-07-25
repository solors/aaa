package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.xn */
/* loaded from: classes6.dex */
public abstract class AbstractC21231xn {
    @Nullable

    /* renamed from: a */
    private InterfaceC21274yn f54500a;

    /* renamed from: b */
    private long f54501b;

    /* renamed from: c */
    private boolean f54502c;

    public AbstractC21231xn() {
        this(false, 1, null);
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC21274yn m54113a() {
        return this.f54500a;
    }

    @NotNull
    /* renamed from: b */
    public abstract String mo54110b();

    /* renamed from: c */
    public final long m54109c() {
        return this.f54501b;
    }

    /* renamed from: d */
    public final boolean m54108d() {
        return this.f54502c;
    }

    public AbstractC21231xn(boolean z) {
        this.f54502c = z;
    }

    /* renamed from: a */
    public final void m54112a(@Nullable InterfaceC21274yn interfaceC21274yn) {
        this.f54500a = interfaceC21274yn;
    }

    public /* synthetic */ AbstractC21231xn(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: a */
    public final void m54111a(boolean z) {
        this.f54502c = z;
        if (!z) {
            InterfaceC21274yn interfaceC21274yn = this.f54500a;
            if (interfaceC21274yn != null) {
                interfaceC21274yn.mo53948b(this);
                return;
            }
            return;
        }
        this.f54501b = System.currentTimeMillis();
        InterfaceC21274yn interfaceC21274yn2 = this.f54500a;
        if (interfaceC21274yn2 != null) {
            interfaceC21274yn2.mo53949a(this);
        }
    }
}
