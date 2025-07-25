package p1025w8;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p1025w8.BeaconItem;
import p1046xd.Closeable;
import p1057y8.Serialization;
import p804nd.InterfaceC38498g;
import sa.C39638b;

@Metadata
/* renamed from: w8.c */
/* loaded from: classes7.dex */
public class SendBeaconDb extends SQLiteOpenHelper {
    @NotNull

    /* renamed from: b */
    public static final C44590b f117031b = new C44590b(null);
    @NotNull

    /* renamed from: c */
    private static final String[] f117032c = {"_id", "url", "headers", "add_timestamp", "payload"};
    @NotNull

    /* renamed from: d */
    public static InterfaceC44591c f117033d = C44589a.f117034b;

    /* compiled from: SendBeaconDb.kt */
    @Metadata
    /* renamed from: w8.c$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class C44589a implements InterfaceC44591c, FunctionAdapter {

        /* renamed from: b */
        public static final C44589a f117034b = new C44589a();

        C44589a() {
        }

        @Override // p1025w8.SendBeaconDb.InterfaceC44591c
        @NotNull
        /* renamed from: a */
        public final SendBeaconDb mo2287a(@NotNull Context p0, @NotNull String p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return new SendBeaconDb(p0, p1);
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof InterfaceC44591c) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.m17075f(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final InterfaceC38498g<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, SendBeaconDb.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: SendBeaconDb.kt */
    @Metadata
    /* renamed from: w8.c$b */
    /* loaded from: classes7.dex */
    public static final class C44590b {
        private C44590b() {
        }

        public /* synthetic */ C44590b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SendBeaconDb.kt */
    @Metadata
    /* renamed from: w8.c$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC44591c {
        @NotNull
        /* renamed from: a */
        SendBeaconDb mo2287a(@NotNull Context context, @NotNull String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendBeaconDb(@NotNull Context context, @NotNull String databaseName) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        C39638b.m12002j(context instanceof Application);
    }

    /* renamed from: e */
    private BeaconItem.C44588a m2291e(Cursor cursor) {
        Uri parse = Uri.parse(cursor.getString(1));
        Intrinsics.checkNotNullExpressionValue(parse, "parse(cursor.getString(1))");
        return new BeaconItem.C44588a(parse, Serialization.m1045a(cursor.getString(2)), m2290f(cursor, 4), cursor.getLong(3), cursor.getLong(0));
    }

    /* renamed from: f */
    private JSONObject m2290f(Cursor cursor, int i) {
        boolean z;
        String m2289h = m2289h(cursor, i);
        if (m2289h == null) {
            return null;
        }
        if (m2289h.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        try {
            return new JSONObject(m2289h);
        } catch (JSONException e) {
            C39638b.m12001k("Payload parsing exception: " + e);
            return null;
        }
    }

    /* renamed from: h */
    private String m2289h(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @WorkerThread
    @NotNull
    /* renamed from: a */
    public BeaconItem.C44588a m2293a(@NotNull Uri url, @NotNull Map<String, String> headers, long j, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("url", url.toString());
        contentValues.put("headers", Serialization.m1044b(headers));
        contentValues.put("add_timestamp", Long.valueOf(j));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long insert = writableDatabase.insert(FirebaseAnalytics.Param.ITEMS, null, contentValues);
            Closeable.m1220a(writableDatabase, null);
            return new BeaconItem.C44588a(url, headers, jSONObject, j, insert);
        } finally {
        }
    }

    @WorkerThread
    @NotNull
    /* renamed from: b */
    public List<BeaconItem.C44588a> m2292b() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Cursor cursor = null;
        try {
            cursor = readableDatabase.query(FirebaseAnalytics.Param.ITEMS, f117032c, null, null, null, null, null, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    arrayList.add(m2291e(cursor));
                }
            }
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            readableDatabase.close();
        }
    }

    @WorkerThread
    /* renamed from: i */
    public boolean m2288i(@Nullable BeaconItem.C44588a c44588a) {
        if (c44588a == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            int delete = writableDatabase.delete(FirebaseAnalytics.Param.ITEMS, "_id = ?", new String[]{String.valueOf(c44588a.m2298f())});
            Closeable.m1220a(writableDatabase, null);
            if (delete == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Closeable.m1220a(writableDatabase, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("\n            CREATE TABLE items(\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            url TEXT NOT NULL,\n            headers TEXT,\n            add_timestamp INTEGER, \n            payload TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i, int i2) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        if (i == 1) {
            sqLiteDatabase.execSQL("\n            ALTER TABLE items ADD COLUMN payload TEXT;\n        ");
        }
    }
}
