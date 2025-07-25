package androidx.sqlite.p021db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SupportSQLiteCompat.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.sqlite.db.SupportSQLiteCompat */
/* loaded from: classes2.dex */
public final class SupportSQLiteCompat {

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata
    @RequiresApi(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.sqlite.db.SupportSQLiteCompat$Api16Impl */
    /* loaded from: classes2.dex */
    public static final class Api16Impl {
        @NotNull
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void cancel(@NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean deleteDatabase(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void disableWriteAheadLogging(@NotNull SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isWriteAheadLoggingEnabled(@NotNull SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final Cursor rawQueryWithFactory(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @NotNull String[] selectionArgs, @Nullable String str, @NotNull CancellationSignal cancellationSignal, @NotNull SQLiteDatabase.CursorFactory cursorFactory) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setForeignKeyConstraintsEnabled(@NotNull SQLiteDatabase sQLiteDatabase, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setWriteAheadLoggingEnabled(@NotNull SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.sqlite.db.SupportSQLiteCompat$Api19Impl */
    /* loaded from: classes2.dex */
    public static final class Api19Impl {
        @NotNull
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final Uri getNotificationUri(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isLowRamDevice(@NotNull ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata
    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.sqlite.db.SupportSQLiteCompat$Api21Impl */
    /* loaded from: classes2.dex */
    public static final class Api21Impl {
        @NotNull
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final File getNoBackupFilesDir(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.sqlite.db.SupportSQLiteCompat$Api23Impl */
    /* loaded from: classes2.dex */
    public static final class Api23Impl {
        @NotNull
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(@NotNull Cursor cursor, @NotNull Bundle extras) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata
    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.sqlite.db.SupportSQLiteCompat$Api29Impl */
    /* loaded from: classes2.dex */
    public static final class Api29Impl {
        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final List<Uri> getNotificationUris(@NotNull Cursor cursor) {
            List<Uri> notificationUris;
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            notificationUris = cursor.getNotificationUris();
            Intrinsics.m17074g(notificationUris);
            return notificationUris;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(@NotNull Cursor cursor, @NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
