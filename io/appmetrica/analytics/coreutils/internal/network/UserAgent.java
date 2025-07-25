package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class UserAgent {
    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    @NotNull
    public static final String getFor(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        boolean m16624M;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        sb2.append(str2);
        sb2.append('.');
        sb2.append(str3);
        sb2.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        m16624M = StringsJVM.m16624M(str4, str5, false, 2, null);
        if (!m16624M) {
            str4 = str5 + ' ' + str4;
        }
        sb2.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb2.append("; Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(')');
        return sb2.toString();
    }
}
