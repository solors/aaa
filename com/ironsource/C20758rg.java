package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.rg */
/* loaded from: classes6.dex */
public final class C20758rg implements InterfaceC20969sg {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20572o8 f52758a;

    public C20758rg() {
        this(null, 1, null);
    }

    /* renamed from: b */
    private final Object m55490b(String str) {
        Exception exc;
        File file = new File(str);
        if (!file.exists()) {
            Result.C38506a c38506a = Result.f101870c;
            exc = new Exception("file does not exists");
        } else {
            Drawable createFromPath = Drawable.createFromPath(file.getPath());
            if (createFromPath == null) {
                Result.C38506a c38506a2 = Result.f101870c;
                exc = new Exception("failed to create a drawable");
            } else {
                return Result.m14549b(createFromPath);
            }
        }
        return Result.m14549b(C38508r.m14540a(exc));
    }

    /* renamed from: c */
    private final Object m55489c(String str) {
        InputStream mo54501a = this.f52758a.mo54501a(str);
        try {
            Object createFromStream = Drawable.createFromStream(mo54501a, new File(str).getName());
            Closeable.m1220a(mo54501a, null);
            if (createFromStream == null) {
                Result.C38506a c38506a = Result.f101870c;
                createFromStream = C38508r.m14540a(new Exception("failed to create a drawable"));
            }
            return Result.m14549b(createFromStream);
        } finally {
        }
    }

    /* renamed from: d */
    private final boolean m55488d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.InterfaceC20969sg
    @NotNull
    /* renamed from: a */
    public Object mo54958a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            if (m55488d(url)) {
                return m55489c(url);
            }
            return m55490b(url);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            Result.C38506a c38506a = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(e));
        }
    }

    public C20758rg(@NotNull InterfaceC20572o8 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f52758a = connectionFactory;
    }

    public /* synthetic */ C20758rg(InterfaceC20572o8 interfaceC20572o8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C21124v9.f54176a : interfaceC20572o8);
    }
}
