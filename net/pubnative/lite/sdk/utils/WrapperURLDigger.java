package net.pubnative.lite.sdk.utils;

/* loaded from: classes10.dex */
public class WrapperURLDigger {
    public String getURL(String str) {
        try {
            if (str.contains("\n") && str.split("\n").length > 0) {
                return str.split("\n")[0];
            }
            return str;
        } catch (RuntimeException unused) {
            return str;
        }
    }
}
