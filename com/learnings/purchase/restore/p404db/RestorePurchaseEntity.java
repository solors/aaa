package com.learnings.purchase.restore.p404db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "restore_purchase")
/* renamed from: com.learnings.purchase.restore.db.RestorePurchaseEntity */
/* loaded from: classes6.dex */
public class RestorePurchaseEntity {
    public static final String RESTORE_TYPE_CONSUMABLE = "consumable";
    public static final String RESTORE_TYPE_PENDING = "pending";
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "token")
    private String token;
    @ColumnInfo(name = "type")
    private String type;

    @NonNull
    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public void setToken(@NonNull String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
