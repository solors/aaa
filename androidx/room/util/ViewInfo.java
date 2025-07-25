package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* compiled from: ViewInfo.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ViewInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public final String name;
    @Nullable
    public final String sql;

    /* compiled from: ViewInfo.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ViewInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String viewName) {
            ViewInfo viewInfo;
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            Cursor query = database.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
            try {
                Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(0)");
                    viewInfo = new ViewInfo(string, cursor.getString(1));
                } else {
                    viewInfo = new ViewInfo(viewName, null);
                }
                Closeable.m1220a(query, null);
                return viewInfo;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Closeable.m1220a(query, th);
                    throw th2;
                }
            }
        }
    }

    public ViewInfo(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.sql = str;
    }

    @NotNull
    public static final ViewInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) obj;
        if (Intrinsics.m17075f(this.name, viewInfo.name)) {
            String str = this.sql;
            String str2 = viewInfo.sql;
            if (str != null) {
                z = Intrinsics.m17075f(str, str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.name.hashCode() * 31;
        String str = this.sql;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }
}
