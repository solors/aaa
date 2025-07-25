package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: VungleError.kt */
@Metadata
/* renamed from: com.vungle.ads.w1 */
/* loaded from: classes7.dex */
public final class C29575w1 extends AbstractC29537l2 {
    public C29575w1() {
        this(null, 1, null);
    }

    public /* synthetic */ C29575w1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public C29575w1(@Nullable String str) {
        super(3001, Sdk$SDKError.EnumC29425b.OUT_OF_MEMORY, str, null, null, null, 56, null);
    }
}
