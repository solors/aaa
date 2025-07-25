package p004a3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

/* renamed from: a3.b */
/* loaded from: classes5.dex */
public class HSNativeSDKUserDBHelper extends SQLiteOpenHelper {
    public HSNativeSDKUserDBHelper(@Nullable Context context) {
        super(context, "__hs_db_helpshift_users", (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
