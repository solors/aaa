package io.appmetrica.analytics.coreapi.internal.p723db;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: io.appmetrica.analytics.coreapi.internal.db.DatabaseScript */
/* loaded from: classes9.dex */
public abstract class DatabaseScript {
    public abstract void runScript(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException;
}
