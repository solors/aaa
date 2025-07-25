package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.n9 */
/* loaded from: classes6.dex */
public class C19386n9 extends AbstractC19515wc {

    /* renamed from: n */
    public final AdConfig.ViewabilityConfig f48544n;

    /* renamed from: o */
    public final int f48545o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19386n9(InterfaceC19431qc visibilityChecker, AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC18850A4 interfaceC18850A4) {
        super(visibilityChecker, b, interfaceC18850A4);
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f48544n = viewabilityConfig;
        this.f48545o = 100;
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: c */
    public int mo59600c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f48544n;
        if (viewabilityConfig != null) {
            return viewabilityConfig.getVisibilityThrottleMillis();
        }
        return this.f48545o;
    }

    @Override // com.inmobi.media.AbstractC19515wc
    /* renamed from: d */
    public final void mo59599d() {
        m59596g();
    }
}
