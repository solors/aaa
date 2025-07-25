package p720if;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39217m0;
import okio.C39218n0;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: if.a */
/* loaded from: classes10.dex */
public interface FileSystem {
    @NotNull

    /* renamed from: a */
    public static final C33663a f92157a = C33663a.f92159a;
    @NotNull

    /* renamed from: b */
    public static final FileSystem f92158b = new C33663a.C33664a();

    /* compiled from: FileSystem.kt */
    @Metadata
    /* renamed from: if.a$a */
    /* loaded from: classes10.dex */
    public static final class C33663a {

        /* renamed from: a */
        static final /* synthetic */ C33663a f92159a = new C33663a();

        /* compiled from: FileSystem.kt */
        @Metadata
        /* renamed from: if.a$a$a */
        /* loaded from: classes10.dex */
        private static final class C33664a implements FileSystem {
            @Override // p720if.FileSystem
            @NotNull
            public Sink appendingSink(@NotNull File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return C39217m0.m13510a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C39217m0.m13510a(file);
                }
            }

            @Override // p720if.FileSystem
            public void delete(@NotNull File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(Intrinsics.m17064q("failed to delete ", file));
                }
            }

            @Override // p720if.FileSystem
            public void deleteContents(@NotNull File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file = listFiles[i];
                        i++;
                        if (file.isDirectory()) {
                            Intrinsics.checkNotNullExpressionValue(file, "file");
                            deleteContents(file);
                        }
                        if (!file.delete()) {
                            throw new IOException(Intrinsics.m17064q("failed to delete ", file));
                        }
                    }
                    return;
                }
                throw new IOException(Intrinsics.m17064q("not a readable directory: ", directory));
            }

            @Override // p720if.FileSystem
            public boolean exists(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // p720if.FileSystem
            public void rename(@NotNull File from, @NotNull File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // p720if.FileSystem
            @NotNull
            public Sink sink(@NotNull File file) throws FileNotFoundException {
                Sink m13492g;
                Sink m13492g2;
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    m13492g2 = C39218n0.m13492g(file, false, 1, null);
                    return m13492g2;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    m13492g = C39218n0.m13492g(file, false, 1, null);
                    return m13492g;
                }
            }

            @Override // p720if.FileSystem
            public long size(@NotNull File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // p720if.FileSystem
            @NotNull
            public Source source(@NotNull File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return C39217m0.m13501j(file);
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C33663a() {
        }
    }

    @NotNull
    Sink appendingSink(@NotNull File file) throws FileNotFoundException;

    void delete(@NotNull File file) throws IOException;

    void deleteContents(@NotNull File file) throws IOException;

    boolean exists(@NotNull File file);

    void rename(@NotNull File file, @NotNull File file2) throws IOException;

    @NotNull
    Sink sink(@NotNull File file) throws FileNotFoundException;

    long size(@NotNull File file);

    @NotNull
    Source source(@NotNull File file) throws FileNotFoundException;
}
