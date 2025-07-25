package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: Room.kt */
@Metadata
/* loaded from: classes2.dex */
public final class Room {
    @NotNull
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    @NotNull
    public static final Room INSTANCE = new Room();
    @NotNull
    public static final String LOG_TAG = "ROOM";
    @NotNull
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0020  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.Class<T> r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            if (r4 == 0) goto L16
            boolean r1 = kotlin.text.C37686h.m16727B(r4)
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = r0
        L17:
            r0 = r0 ^ r1
            if (r0 == 0) goto L20
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r0.<init>(r2, r3, r4)
            return r0
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.Room.databaseBuilder(android.content.Context, java.lang.Class, java.lang.String):androidx.room.RoomDatabase$Builder");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T, C> T getGeneratedImplementation(@NotNull Class<C> klass, @NotNull String suffix) {
        boolean z;
        String m16629H;
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r1 = klass.getPackage();
        Intrinsics.m17074g(r1);
        String fullPackage = r1.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.m17074g(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        boolean z2 = false;
        if (fullPackage.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = canonicalName;
        StringBuilder sb2 = new StringBuilder();
        m16629H = StringsJVM.m16629H(str2, '.', '_', false, 4, null);
        sb2.append(m16629H);
        sb2.append(suffix);
        String sb3 = sb2.toString();
        try {
            if (fullPackage.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str = sb3;
            } else {
                str = fullPackage + '.' + sb3;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.m17073h(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    @NotNull
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(@NotNull Context context, @NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }
}
