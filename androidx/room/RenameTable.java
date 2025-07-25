package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RenameTable.kt */
@Target({ElementType.TYPE})
@Metadata
@Repeatable(Entries.class)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface RenameTable {

    /* compiled from: RenameTable.kt */
    @Target({ElementType.TYPE})
    @Metadata
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface Entries {
        RenameTable[] value();
    }

    String fromTableName();

    String toTableName();
}
