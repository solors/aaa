package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bX */
/* loaded from: classes3.dex */
public class C9329bX implements Cursor {

    /* renamed from: IL */
    String[] f20835IL;

    /* renamed from: bX */
    int f20836bX = 0;

    /* renamed from: bg */
    Map<String, List<String>> f20837bg;

    public C9329bX(Map<String, List<String>> map) {
        if (map != null && map.keySet() != null) {
            this.f20837bg = map;
            try {
                this.f20835IL = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.f20837bg = new HashMap();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.f20835IL;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.f20835IL;
        if (strArr != null && strArr.length != 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f20835IL;
                if (i >= strArr2.length) {
                    return 0;
                }
                if (str.equals(strArr2[i])) {
                    return i;
                }
                i++;
            }
        } else {
            return -1;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i) {
        if (i >= 0) {
            String[] strArr = this.f20835IL;
            if (i < strArr.length) {
                return strArr[i];
            }
            return "";
        }
        return "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.f20835IL;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.f20835IL;
            if (strArr != null && strArr.length != 0) {
                return this.f20837bg.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        try {
            return Double.parseDouble(getString(i));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        try {
            return Float.parseFloat(getString(i));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        try {
            return Integer.parseInt(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        try {
            return Long.parseLong(getString(i));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.f20836bX;
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        try {
            return Short.parseShort(getString(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i) {
        if (i >= 0 && i < getColumnCount()) {
            return this.f20837bg.get(this.f20835IL[i]).get(getPosition());
        }
        return "";
    }

    @Override // android.database.Cursor
    public int getType(int i) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        if (this.f20836bX == 0) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        if (this.f20836bX == getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        if (getString(i) == null) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        if (this.f20836bX + i >= getCount()) {
            return false;
        }
        this.f20836bX += i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.f20836bX = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.f20836bX = this.f20837bg.get(this.f20835IL[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.f20836bX + 1 >= getCount()) {
            return false;
        }
        this.f20836bX++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.f20836bX = i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.f20836bX;
        if (i - 1 < 0) {
            return false;
        }
        this.f20836bX = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }
}
