package kotlin.p764io;

import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* renamed from: kotlin.io.FileWalkDirection */
/* loaded from: classes7.dex */
public final class FileTreeWalk {

    /* renamed from: b */
    public static final FileTreeWalk f99300b = new FileTreeWalk("TOP_DOWN", 0);

    /* renamed from: c */
    public static final FileTreeWalk f99301c = new FileTreeWalk("BOTTOM_UP", 1);

    /* renamed from: d */
    private static final /* synthetic */ FileTreeWalk[] f99302d;

    /* renamed from: f */
    private static final /* synthetic */ EnumEntries f99303f;

    static {
        FileTreeWalk[] m17081b = m17081b();
        f99302d = m17081b;
        f99303f = C44401b.m3113a(m17081b);
    }

    private FileTreeWalk(String str, int i) {
    }

    /* renamed from: b */
    private static final /* synthetic */ FileTreeWalk[] m17081b() {
        return new FileTreeWalk[]{f99300b, f99301c};
    }

    public static FileTreeWalk valueOf(String str) {
        return (FileTreeWalk) Enum.valueOf(FileTreeWalk.class, str);
    }

    public static FileTreeWalk[] values() {
        return (FileTreeWalk[]) f99302d.clone();
    }
}
