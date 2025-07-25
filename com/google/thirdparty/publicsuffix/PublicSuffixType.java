package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
/* loaded from: classes5.dex */
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    

    /* renamed from: b */
    private final char f44143b;

    /* renamed from: c */
    private final char f44144c;

    PublicSuffixType(char c, char c2) {
        this.f44143b = c;
        this.f44144c = c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static PublicSuffixType m66143c(char c) {
        PublicSuffixType[] values;
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.m66142d() == c || publicSuffixType.m66141e() == c) {
                return publicSuffixType;
            }
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("No enum corresponding to given code: ");
        sb2.append(c);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    char m66142d() {
        return this.f44143b;
    }

    /* renamed from: e */
    char m66141e() {
        return this.f44144c;
    }
}
