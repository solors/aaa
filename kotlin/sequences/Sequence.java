package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequence.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Sequence<T> {
    @NotNull
    Iterator<T> iterator();
}
