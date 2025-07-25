package p820od;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.SetsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListBuilder.kt */
@Metadata
/* renamed from: od.h */
/* loaded from: classes7.dex */
public final class C39154h implements Externalizable {
    @NotNull

    /* renamed from: d */
    public static final C39155a f102852d = new C39155a(null);
    @NotNull

    /* renamed from: b */
    private Collection<?> f102853b;

    /* renamed from: c */
    private final int f102854c;

    /* compiled from: ListBuilder.kt */
    @Metadata
    /* renamed from: od.h$a */
    /* loaded from: classes7.dex */
    public static final class C39155a {
        private C39155a() {
        }

        public /* synthetic */ C39155a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39154h(@NotNull Collection<?> collection, int i) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f102853b = collection;
        this.f102854c = i;
    }

    private final Object readResolve() {
        return this.f102853b;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        List m17176d;
        List m17179a;
        List list;
        Set m17128c;
        Set m17130a;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i == 0) {
                    m17176d = CollectionsJVM.m17176d(readInt);
                    while (i2 < readInt) {
                        m17176d.add(input.readObject());
                        i2++;
                    }
                    m17179a = CollectionsJVM.m17179a(m17176d);
                    list = m17179a;
                } else if (i == 1) {
                    m17128c = SetsJVM.m17128c(readInt);
                    while (i2 < readInt) {
                        m17128c.add(input.readObject());
                        i2++;
                    }
                    m17130a = SetsJVM.m17130a(m17128c);
                    list = m17130a;
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
                }
                this.f102853b = list;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f102854c);
        output.writeInt(this.f102853b.size());
        Iterator<?> it = this.f102853b.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39154h() {
        /*
            r2 = this;
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p820od.C39154h.<init>():void");
    }
}
