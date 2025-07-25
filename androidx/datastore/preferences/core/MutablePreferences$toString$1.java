package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Preferences.kt */
@Metadata
/* loaded from: classes.dex */
final class MutablePreferences$toString$1 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {
    public static final MutablePreferences$toString$1 INSTANCE = new MutablePreferences$toString$1();

    MutablePreferences$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Map.Entry<Preferences.Key<?>, Object> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return "  " + entry.getKey().getName() + " = " + entry.getValue();
    }
}
