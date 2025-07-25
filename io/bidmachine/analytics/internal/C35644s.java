package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.bidmachine.analytics.internal.s */
/* loaded from: classes9.dex */
public final class C35644s extends AbstractC35592d {

    /* renamed from: h */
    public static final C35645a f96542h = new C35645a(null);

    /* renamed from: g */
    private final String f96543g = "aexs";

    /* renamed from: io.bidmachine.analytics.internal.s$a */
    /* loaded from: classes9.dex */
    public static final class C35645a {
        private C35645a() {
        }

        public /* synthetic */ C35645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35617j
    /* renamed from: a */
    public String mo20114a() {
        return this.f96543g;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35592d
    /* renamed from: c */
    public File mo20115c(ReaderConfig.Rule rule) {
        return new File(AbstractC35634l0.m20145b(rule.getPath()));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC35617j
    /* renamed from: d */
    public void mo20109d(Context context) {
    }
}
