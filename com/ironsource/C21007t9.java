package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.t9 */
/* loaded from: classes6.dex */
public final class C21007t9 implements InterfaceC19656br<String> {
    @NotNull

    /* renamed from: a */
    private final String f53555a;
    @NotNull

    /* renamed from: b */
    private final String f53556b;

    public C21007t9(@NotNull String encryptedResponse, @NotNull String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f53555a = encryptedResponse;
        this.f53556b = descriptionKey;
    }

    @Override // com.ironsource.InterfaceC19656br
    @NotNull
    /* renamed from: b */
    public String mo54807a() {
        boolean z;
        String value = IronSourceAES.decode(this.f53556b, this.f53555a);
        if (value != null && value.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(value, "value");
            return value;
        }
        throw new IllegalArgumentException("Decryption failed");
    }
}
