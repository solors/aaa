package p697h7;

import java.util.ArrayList;
import java.util.List;
import p684g7.AbstractC33214a;

/* renamed from: h7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC33485a extends AbstractC33214a {

    /* renamed from: h7.a$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC33486a {

        /* renamed from: a */
        public boolean f91357a = false;

        /* renamed from: b */
        public List<String> f91358b = new ArrayList();

        /* renamed from: a */
        public abstract AbstractC33485a mo23652a();

        /* renamed from: b */
        public AbstractC33486a m23657b(boolean z) {
            this.f91357a = z;
            return this;
        }

        /* renamed from: c */
        public AbstractC33486a m23656c(List<String> list) {
            this.f91358b.addAll(list);
            return this;
        }
    }

    public AbstractC33485a(AbstractC33486a abstractC33486a) {
        this.f90777a = abstractC33486a.f91357a;
        this.f90778b = abstractC33486a.f91358b;
    }
}
