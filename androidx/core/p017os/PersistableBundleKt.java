package androidx.core.p017os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistableBundle.kt */
@Metadata
/* renamed from: androidx.core.os.PersistableBundleKt */
/* loaded from: classes.dex */
public final class PersistableBundleKt {
    @RequiresApi(21)
    @NotNull
    public static final PersistableBundle persistableBundleOf(@NotNull Tuples<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        PersistableBundle createPersistableBundle = PersistableBundle.createPersistableBundle(pairs.length);
        for (Tuples<String, ? extends Object> tuples : pairs) {
            PersistableBundle.putValue(createPersistableBundle, tuples.m17632a(), tuples.m17631b());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    @NotNull
    public static final PersistableBundle toPersistableBundle(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        PersistableBundle createPersistableBundle = PersistableBundle.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundle.putValue(createPersistableBundle, entry.getKey(), entry.getValue());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    @NotNull
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundle.createPersistableBundle(0);
    }
}
