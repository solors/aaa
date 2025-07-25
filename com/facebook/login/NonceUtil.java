package com.facebook.login;

import kotlin.Metadata;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NonceUtil.kt */
@Metadata
/* loaded from: classes4.dex */
public final class NonceUtil {
    @NotNull
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(@Nullable String str) {
        boolean z;
        int m16568d0;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        m16568d0 = C37690r.m16568d0(str, ' ', 0, false, 6, null);
        if (m16568d0 >= 0) {
            z2 = true;
        }
        return !z2;
    }
}
