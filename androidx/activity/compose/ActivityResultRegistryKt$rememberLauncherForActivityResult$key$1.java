package androidx.activity.compose;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityResultRegistry.kt */
@Metadata
/* loaded from: classes.dex */
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements Functions<String> {
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();

    ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
