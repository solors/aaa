package com.moloco.sdk.publisher;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Char;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public enum AdFormatType {
    BANNER,
    INTERSTITIAL,
    REWARDED,
    MREC,
    NATIVE;

    @NotNull
    public final String toLowercase() {
        String lowerCase = toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @NotNull
    public final String toTitlecase() {
        String valueOf;
        String lowercase = toLowercase();
        if (lowercase.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = lowercase.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = Char.m16757i(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = lowercase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return lowercase;
    }
}
