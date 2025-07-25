package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public abstract class ParsedResult {

    /* renamed from: a */
    private final ParsedResultType f44287a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ParsedResult(ParsedResultType parsedResultType) {
        this.f44287a = parsedResultType;
    }

    public static void maybeAppend(String str, StringBuilder sb2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append('\n');
        }
        sb2.append(str);
    }

    public abstract String getDisplayResult();

    public final ParsedResultType getType() {
        return this.f44287a;
    }

    public final String toString() {
        return getDisplayResult();
    }

    public static void maybeAppend(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                maybeAppend(str, sb2);
            }
        }
    }
}
