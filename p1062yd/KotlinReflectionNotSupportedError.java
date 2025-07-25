package p1062yd;

import kotlin.Metadata;

@Metadata
/* renamed from: yd.b */
/* loaded from: classes7.dex */
public class KotlinReflectionNotSupportedError extends Error {
    public KotlinReflectionNotSupportedError() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
