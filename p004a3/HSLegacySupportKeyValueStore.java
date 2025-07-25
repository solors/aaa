package p004a3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: a3.a */
/* loaded from: classes5.dex */
public class HSLegacySupportKeyValueStore extends SQLiteOpenHelper {
    public HSLegacySupportKeyValueStore(Context context) {
        super(context, "__hs__db_support_key_values", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
