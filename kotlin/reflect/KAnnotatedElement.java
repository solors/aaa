package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: KAnnotatedElement.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KAnnotatedElement {
    @NotNull
    List<Annotation> getAnnotations();
}
