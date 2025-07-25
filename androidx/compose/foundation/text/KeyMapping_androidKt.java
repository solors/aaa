package androidx.compose.foundation.text;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyMapping.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    @NotNull
    private static final KeyMapping platformDefaultKeyMapping = KeyMappingKt.getDefaultKeyMapping();

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
