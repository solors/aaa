package p1046xd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p764io.FileTreeWalk;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: FileTreeWalk.kt */
@Metadata
/* renamed from: xd.h */
/* loaded from: classes7.dex */
public final class C44971h implements Sequence<File> {
    @NotNull

    /* renamed from: a */
    private final File f118317a;
    @NotNull

    /* renamed from: b */
    private final FileTreeWalk f118318b;
    @Nullable

    /* renamed from: c */
    private final Function1<File, Boolean> f118319c;
    @Nullable

    /* renamed from: d */
    private final Function1<File, Unit> f118320d;
    @Nullable

    /* renamed from: e */
    private final Function2<File, IOException, Unit> f118321e;

    /* renamed from: f */
    private final int f118322f;

    /* compiled from: FileTreeWalk.kt */
    @Metadata
    /* renamed from: xd.h$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC44972a extends AbstractC44978c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC44972a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    @Metadata
    /* renamed from: xd.h$b */
    /* loaded from: classes7.dex */
    public final class C44973b extends AbstractIterator<File> {
        @NotNull

        /* renamed from: d */
        private final ArrayDeque<AbstractC44978c> f118323d;

        /* compiled from: FileTreeWalk.kt */
        @Metadata
        /* renamed from: xd.h$b$a */
        /* loaded from: classes7.dex */
        public final class C44974a extends AbstractC44972a {

            /* renamed from: b */
            private boolean f118325b;
            @Nullable

            /* renamed from: c */
            private File[] f118326c;

            /* renamed from: d */
            private int f118327d;

            /* renamed from: e */
            private boolean f118328e;

            /* renamed from: f */
            final /* synthetic */ C44973b f118329f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44974a(@NotNull C44973b c44973b, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f118329f = c44973b;
            }

            @Override // p1046xd.C44971h.AbstractC44978c
            @Nullable
            /* renamed from: b */
            public File mo1206b() {
                if (!this.f118328e && this.f118326c == null) {
                    Function1 function1 = C44971h.this.f118319c;
                    boolean z = false;
                    if (function1 != null && !((Boolean) function1.invoke(m1207a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = m1207a().listFiles();
                    this.f118326c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = C44971h.this.f118321e;
                        if (function2 != null) {
                            function2.mo105910invoke(m1207a(), new C44967a(m1207a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f118328e = true;
                    }
                }
                File[] fileArr = this.f118326c;
                if (fileArr != null) {
                    int i = this.f118327d;
                    Intrinsics.m17074g(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f118326c;
                        Intrinsics.m17074g(fileArr2);
                        int i2 = this.f118327d;
                        this.f118327d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.f118325b) {
                    Function1 function12 = C44971h.this.f118320d;
                    if (function12 != null) {
                        function12.invoke(m1207a());
                    }
                    return null;
                }
                this.f118325b = true;
                return m1207a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        @Metadata
        /* renamed from: xd.h$b$b */
        /* loaded from: classes7.dex */
        public final class C44975b extends AbstractC44978c {

            /* renamed from: b */
            private boolean f118330b;

            /* renamed from: c */
            final /* synthetic */ C44973b f118331c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44975b(@NotNull C44973b c44973b, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f118331c = c44973b;
            }

            @Override // p1046xd.C44971h.AbstractC44978c
            @Nullable
            /* renamed from: b */
            public File mo1206b() {
                if (this.f118330b) {
                    return null;
                }
                this.f118330b = true;
                return m1207a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata
        /* renamed from: xd.h$b$c */
        /* loaded from: classes7.dex */
        public final class C44976c extends AbstractC44972a {

            /* renamed from: b */
            private boolean f118332b;
            @Nullable

            /* renamed from: c */
            private File[] f118333c;

            /* renamed from: d */
            private int f118334d;

            /* renamed from: e */
            final /* synthetic */ C44973b f118335e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C44976c(@NotNull C44973b c44973b, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f118335e = c44973b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:71:0x0083, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // p1046xd.C44971h.AbstractC44978c
            @org.jetbrains.annotations.Nullable
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File mo1206b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f118332b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    xd.h$b r0 = r10.f118335e
                    xd.h r0 = p1046xd.C44971h.this
                    kotlin.jvm.functions.Function1 r0 = p1046xd.C44971h.m1214e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.m1207a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f118332b = r3
                    java.io.File r0 = r10.m1207a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f118333c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f118334d
                    kotlin.jvm.internal.Intrinsics.m17074g(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    xd.h$b r0 = r10.f118335e
                    xd.h r0 = p1046xd.C44971h.this
                    kotlin.jvm.functions.Function1 r0 = p1046xd.C44971h.m1212g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.m1207a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f118333c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.m1207a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f118333c = r0
                    if (r0 != 0) goto L7b
                    xd.h$b r0 = r10.f118335e
                    xd.h r0 = p1046xd.C44971h.this
                    kotlin.jvm.functions.Function2 r0 = p1046xd.C44971h.m1213f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.m1207a()
                    xd.a r9 = new xd.a
                    java.io.File r4 = r10.m1207a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.mo105910invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f118333c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.Intrinsics.m17074g(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    xd.h$b r0 = r10.f118335e
                    xd.h r0 = p1046xd.C44971h.this
                    kotlin.jvm.functions.Function1 r0 = p1046xd.C44971h.m1212g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.m1207a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f118333c
                    kotlin.jvm.internal.Intrinsics.m17074g(r0)
                    int r1 = r10.f118334d
                    int r2 = r1 + 1
                    r10.f118334d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p1046xd.C44971h.C44973b.C44976c.mo1206b():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata
        /* renamed from: xd.h$b$d */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C44977d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileTreeWalk.values().length];
                try {
                    iArr[FileTreeWalk.f99300b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileTreeWalk.f99301c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C44973b() {
            C44971h.this = r3;
            ArrayDeque<AbstractC44978c> arrayDeque = new ArrayDeque<>();
            this.f118323d = arrayDeque;
            if (r3.f118317a.isDirectory()) {
                arrayDeque.push(m1209f(r3.f118317a));
            } else if (r3.f118317a.isFile()) {
                arrayDeque.push(new C44975b(this, r3.f118317a));
            } else {
                m17603b();
            }
        }

        /* renamed from: f */
        private final AbstractC44972a m1209f(File file) {
            int i = C44977d.$EnumSwitchMapping$0[C44971h.this.f118318b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C44974a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C44976c(this, file);
        }

        /* renamed from: g */
        private final File m1208g() {
            File mo1206b;
            while (true) {
                AbstractC44978c peek = this.f118323d.peek();
                if (peek == null) {
                    return null;
                }
                mo1206b = peek.mo1206b();
                if (mo1206b == null) {
                    this.f118323d.pop();
                } else if (Intrinsics.m17075f(mo1206b, peek.m1207a()) || !mo1206b.isDirectory() || this.f118323d.size() >= C44971h.this.f118322f) {
                    break;
                } else {
                    this.f118323d.push(m1209f(mo1206b));
                }
            }
            return mo1206b;
        }

        @Override // kotlin.collections.AbstractIterator
        /* renamed from: a */
        protected void mo1210a() {
            File m1208g = m1208g();
            if (m1208g != null) {
                m17602c(m1208g);
            } else {
                m17603b();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata
    /* renamed from: xd.h$c */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC44978c {
        @NotNull

        /* renamed from: a */
        private final File f118336a;

        public AbstractC44978c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f118336a = root;
        }

        @NotNull
        /* renamed from: a */
        public final File m1207a() {
            return this.f118336a;
        }

        @Nullable
        /* renamed from: b */
        public abstract File mo1206b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C44971h(File file, FileTreeWalk fileTreeWalk, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.f118317a = file;
        this.f118318b = fileTreeWalk;
        this.f118319c = function1;
        this.f118320d = function12;
        this.f118321e = function2;
        this.f118322f = i;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new C44973b();
    }

    /* synthetic */ C44971h(File file, FileTreeWalk fileTreeWalk, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileTreeWalk.f99300b : fileTreeWalk, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C44971h(@NotNull File start, @NotNull FileTreeWalk direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
