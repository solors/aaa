package p1012v8;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: v8.a */
/* loaded from: classes7.dex */
public enum COPPA {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);
    
    @Nullable
    private final Boolean value;

    COPPA(Boolean bool) {
        this.value = bool;
    }

    @Nullable
    public final Boolean getValue() {
        return this.value;
    }
}
