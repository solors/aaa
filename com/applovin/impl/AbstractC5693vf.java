package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.applovin.impl.vf */
/* loaded from: classes2.dex */
public abstract class AbstractC5693vf {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.vf$a */
    /* loaded from: classes2.dex */
    public class C5694a extends AbstractC5697d {

        /* renamed from: a */
        final /* synthetic */ Comparator f11487a;

        C5694a(Comparator comparator) {
            this.f11487a = comparator;
        }

        @Override // com.applovin.impl.AbstractC5693vf.AbstractC5697d
        /* renamed from: b */
        Map mo93900b() {
            return new TreeMap(this.f11487a);
        }
    }

    /* renamed from: com.applovin.impl.vf$b */
    /* loaded from: classes2.dex */
    private static final class C5695b implements Supplier, Serializable {

        /* renamed from: a */
        private final int f11488a;

        C5695b(int i) {
            this.f11488a = AbstractC5103p3.m96598a(i, "expectedValuesPerKey");
        }

        @Override // com.applovin.exoplayer2.common.base.Supplier
        public List get() {
            return new ArrayList(this.f11488a);
        }
    }

    /* renamed from: com.applovin.impl.vf$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5696c extends AbstractC5693vf {
        AbstractC5696c() {
            super(null);
        }

        /* renamed from: b */
        public abstract InterfaceC4317ec mo93899b();
    }

    /* renamed from: com.applovin.impl.vf$d */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5697d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.impl.vf$d$a */
        /* loaded from: classes2.dex */
        public class C5698a extends AbstractC5696c {

            /* renamed from: a */
            final /* synthetic */ int f11489a;

            C5698a(int i) {
                this.f11489a = i;
            }

            @Override // com.applovin.impl.AbstractC5693vf.AbstractC5696c
            /* renamed from: b */
            public InterfaceC4317ec mo93899b() {
                return AbstractC5777wf.m93524a(AbstractC5697d.this.mo93900b(), new C5695b(this.f11489a));
            }
        }

        AbstractC5697d() {
        }

        /* renamed from: a */
        public AbstractC5696c m93902a() {
            return m93901a(2);
        }

        /* renamed from: b */
        abstract Map mo93900b();

        /* renamed from: a */
        public AbstractC5696c m93901a(int i) {
            AbstractC5103p3.m96598a(i, "expectedValuesPerKey");
            return new C5698a(i);
        }
    }

    private AbstractC5693vf() {
    }

    /* synthetic */ AbstractC5693vf(AbstractC5635uf abstractC5635uf) {
        this();
    }

    /* renamed from: a */
    public static AbstractC5697d m93903a(Comparator comparator) {
        Preconditions.checkNotNull(comparator);
        return new C5694a(comparator);
    }

    /* renamed from: a */
    public static AbstractC5697d m93904a() {
        return m93903a(AbstractC5699vg.m93898a());
    }
}
