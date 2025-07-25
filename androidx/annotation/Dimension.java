package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dimension.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Metadata
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface Dimension {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: DP */
    public static final int f308DP = 0;

    /* renamed from: PX */
    public static final int f309PX = 1;

    /* renamed from: SP */
    public static final int f310SP = 2;

    /* compiled from: Dimension.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: DP */
        public static final int f311DP = 0;

        /* renamed from: PX */
        public static final int f312PX = 1;

        /* renamed from: SP */
        public static final int f313SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}
