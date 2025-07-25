package p1046xd;

import ae.KMarkers;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: xd.n */
/* loaded from: classes7.dex */
public final class ReadWrite implements Sequence<String> {
    @NotNull

    /* renamed from: a */
    private final BufferedReader f118338a;

    /* compiled from: ReadWrite.kt */
    @Metadata
    /* renamed from: xd.n$a */
    /* loaded from: classes7.dex */
    public static final class C44984a implements Iterator<String>, KMarkers {
        @Nullable

        /* renamed from: b */
        private String f118339b;

        /* renamed from: c */
        private boolean f118340c;

        C44984a() {
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f118339b;
                this.f118339b = null;
                Intrinsics.m17074g(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f118339b == null && !this.f118340c) {
                String readLine = ReadWrite.this.f118338a.readLine();
                this.f118339b = readLine;
                if (readLine == null) {
                    this.f118340c = true;
                }
            }
            if (this.f118339b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ReadWrite(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f118338a = reader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<String> iterator() {
        return new C44984a();
    }
}
