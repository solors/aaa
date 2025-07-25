package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata
/* renamed from: kotlinx.serialization.json.e */
/* loaded from: classes8.dex */
public @interface JsonAnnotations {
    String discriminator();
}
