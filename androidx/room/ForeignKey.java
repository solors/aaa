package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForeignKey.kt */
@Target({})
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface ForeignKey {
    public static final int CASCADE = 5;
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NO_ACTION = 1;
    public static final int RESTRICT = 2;
    public static final int SET_DEFAULT = 4;
    public static final int SET_NULL = 3;

    /* compiled from: ForeignKey.kt */
    @Retention(RetentionPolicy.CLASS)
    @Metadata
    /* loaded from: classes2.dex */
    public @interface Action {
    }

    /* compiled from: ForeignKey.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CASCADE = 5;
        public static final int NO_ACTION = 1;
        public static final int RESTRICT = 2;
        public static final int SET_DEFAULT = 4;
        public static final int SET_NULL = 3;

        private Companion() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @Action
    int onDelete() default 1;

    @Action
    int onUpdate() default 1;

    String[] parentColumns();
}
