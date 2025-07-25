package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: VungleError.kt */
@Metadata
/* renamed from: com.vungle.ads.e1 */
/* loaded from: classes7.dex */
public final class C29128e1 extends AbstractC29537l2 {
    public C29128e1() {
        this(null, 1, null);
    }

    public /* synthetic */ C29128e1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public C29128e1(@Nullable String str) {
        super(130, Sdk$SDKError.EnumC29425b.MRAID_DOWNLOAD_JS_ERROR, str, null, null, null, 56, null);
    }
}
