package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C20794s9;

/* loaded from: classes6.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    Context f49917a;

    /* renamed from: b */
    C20794s9 f49918b;

    /* renamed from: c */
    String f49919c;

    /* renamed from: e */
    Uri f49921e;

    /* renamed from: h */
    String f49924h;

    /* renamed from: i */
    String f49925i;

    /* renamed from: d */
    UriMatcher f49920d = new UriMatcher(-1);

    /* renamed from: f */
    final int f49922f = 1;

    /* renamed from: g */
    final int f49923g = 2;

    /* renamed from: j */
    final String f49926j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f49920d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.f49925i;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.f49924h;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f49917a = getContext();
        this.f49918b = new C20794s9(this.f49917a);
        this.f49919c = this.f49917a.getPackageName();
        this.f49921e = Uri.parse("content://" + this.f49919c + RemoteSettings.FORWARD_SLASH_STRING + "REPORTS");
        this.f49924h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f49925i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f49920d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return C20794s9.m55373a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return C20794s9.m55369c();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
