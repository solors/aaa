package androidx.room;

import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DelegatingOpenHelper.kt */
@Metadata
/* loaded from: classes2.dex */
public interface DelegatingOpenHelper {
    @NotNull
    SupportSQLiteOpenHelper getDelegate();
}
