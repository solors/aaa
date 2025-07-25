package io.bidmachine.analytics;

import java.util.List;
import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public final class ReaderConfig {

    /* renamed from: a */
    private final String f96270a;

    /* renamed from: b */
    private final String f96271b;

    /* renamed from: c */
    private final long f96272c;

    /* renamed from: d */
    private final boolean f96273d;

    /* renamed from: e */
    private final List f96274e;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Rule {

        /* renamed from: a */
        private final String f96275a;

        /* renamed from: b */
        private final String f96276b;

        public Rule(String str, String str2) {
            this.f96275a = str;
            this.f96276b = str2;
        }

        public final String getPath() {
            return this.f96276b;
        }

        public final String getTag() {
            return this.f96275a;
        }
    }

    public ReaderConfig(String str, String str2, long j, boolean z, List<Rule> list) {
        this.f96270a = str;
        this.f96271b = str2;
        this.f96272c = j;
        this.f96273d = z;
        this.f96274e = list;
    }

    public final long getInterval() {
        return this.f96272c;
    }

    public final String getName() {
        return this.f96270a;
    }

    public final List<Rule> getRules() {
        return this.f96274e;
    }

    public final boolean getUniqueOnly() {
        return this.f96273d;
    }

    public final String getUrl() {
        return this.f96271b;
    }
}
