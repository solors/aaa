package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: KTypeParameter.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KTypeParameter extends KClassifier {
    @NotNull
    String getName();

    @NotNull
    List<KType> getUpperBounds();

    @NotNull
    KVariance getVariance();

    boolean isReified();
}
