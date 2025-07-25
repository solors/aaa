package p1012v8;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: v8.b */
/* loaded from: classes7.dex */
public enum PrivacyConsent {
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");
    
    @NotNull
    private final String value;

    PrivacyConsent(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
