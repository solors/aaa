package p820od;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapBuilder.kt */
@Metadata
/* renamed from: od.i */
/* loaded from: classes7.dex */
final class C39156i implements Externalizable {
    @NotNull

    /* renamed from: c */
    public static final C39157a f102855c = new C39157a(null);
    @NotNull

    /* renamed from: b */
    private Map<?, ?> f102856b;

    /* compiled from: MapBuilder.kt */
    @Metadata
    /* renamed from: od.i$a */
    /* loaded from: classes7.dex */
    public static final class C39157a {
        private C39157a() {
        }

        public /* synthetic */ C39157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39156i(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f102856b = map;
    }

    private final Object readResolve() {
        return this.f102856b;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Map m17293e;
        Map<?, ?> m17295c;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                m17293e = MapsJVM.m17293e(readInt);
                for (int i = 0; i < readInt; i++) {
                    m17293e.put(input.readObject(), input.readObject());
                }
                m17295c = MapsJVM.m17295c(m17293e);
                this.f102856b = m17295c;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.f102856b.size());
        for (Map.Entry<?, ?> entry : this.f102856b.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39156i() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.C37554o0.m17366j()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p820od.C39156i.<init>():void");
    }
}
