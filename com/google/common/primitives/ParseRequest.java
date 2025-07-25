package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
final class ParseRequest {

    /* renamed from: a */
    final String f41486a;

    /* renamed from: b */
    final int f41487b;

    private ParseRequest(String str, int i) {
        this.f41486a = str;
        this.f41487b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ParseRequest m67976a(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            int i = 16;
            if (!str.startsWith("0x") && !str.startsWith("0X")) {
                if (charAt == '#') {
                    str = str.substring(1);
                } else if (charAt == '0' && str.length() > 1) {
                    str = str.substring(1);
                    i = 8;
                } else {
                    i = 10;
                }
            } else {
                str = str.substring(2);
            }
            return new ParseRequest(str, i);
        }
        throw new NumberFormatException("empty string");
    }
}
