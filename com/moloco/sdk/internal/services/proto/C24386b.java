package com.moloco.sdk.internal.services.proto;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.C24490t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.internal.services.proto.b */
/* loaded from: classes7.dex */
public final class C24386b implements InterfaceC24384a {
    @Override // com.moloco.sdk.internal.services.proto.InterfaceC24384a
    @NotNull
    /* renamed from: a */
    public String mo46510a(@NotNull C24490t input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        String encodeToString = Base64.encodeToString(input.toByteArray(), i);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(input.toByteArray(), flags)");
        return encodeToString;
    }
}
