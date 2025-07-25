package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KType.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KType extends KAnnotatedElement {
    @NotNull
    List<KTypeProjection> getArguments();

    @Nullable
    KClassifier getClassifier();

    boolean isMarkedNullable();

    /* compiled from: KType.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getArguments$annotations() {
        }

        public static /* synthetic */ void getClassifier$annotations() {
        }
    }
}
