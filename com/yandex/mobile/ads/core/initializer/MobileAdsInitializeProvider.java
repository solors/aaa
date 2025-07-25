package com.yandex.mobile.ads.core.initializer;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.mobile.ads.impl.C30724kf;
import com.yandex.mobile.ads.impl.gh2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class MobileAdsInitializeProvider extends ContentProvider {
    @NotNull

    /* renamed from: a */
    private final C30724kf f76572a;

    public MobileAdsInitializeProvider() {
        this(null, 1, null);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            C30724kf c30724kf = this.f76572a;
            gh2 gh2Var = new gh2(context);
            c30724kf.getClass();
            C30724kf.m32568a(context, gh2Var);
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    public MobileAdsInitializeProvider(@NotNull C30724kf appStartupInitializer) {
        Intrinsics.checkNotNullParameter(appStartupInitializer, "appStartupInitializer");
        this.f76572a = appStartupInitializer;
    }

    public /* synthetic */ MobileAdsInitializeProvider(C30724kf c30724kf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C30724kf() : c30724kf);
    }
}
