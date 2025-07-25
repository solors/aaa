package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.bidmachine.analytics.internal.v */
/* loaded from: classes9.dex */
public final class C35648v extends AbstractC35592d {

    /* renamed from: i */
    public static final C35649a f96545i = new C35649a(null);

    /* renamed from: g */
    private final File f96546g;

    /* renamed from: h */
    private final String f96547h = "aints";

    /* renamed from: io.bidmachine.analytics.internal.v$a */
    /* loaded from: classes9.dex */
    public static final class C35649a {
        private C35649a() {
        }

        public /* synthetic */ C35649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C35648v(File file) {
        this.f96546g = file;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35617j
    /* renamed from: a */
    public String mo20114a() {
        return this.f96547h;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35592d
    /* renamed from: c */
    public File mo20115c(ReaderConfig.Rule rule) {
        return new File(this.f96546g, AbstractC35634l0.m20145b(rule.getPath()));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35617j
    /* renamed from: d */
    public void mo20109d(Context context) {
    }
}
