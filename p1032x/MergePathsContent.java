package p1032x;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p035c0.MergePaths;

@TargetApi(19)
/* renamed from: x.l */
/* loaded from: classes2.dex */
public class MergePathsContent implements PathContent, GreedyContent {

    /* renamed from: d */
    private final String f117252d;

    /* renamed from: f */
    private final MergePaths f117254f;

    /* renamed from: a */
    private final Path f117249a = new Path();

    /* renamed from: b */
    private final Path f117250b = new Path();

    /* renamed from: c */
    private final Path f117251c = new Path();

    /* renamed from: e */
    private final List<PathContent> f117253e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* renamed from: x.l$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C44660a {

        /* renamed from: a */
        static final /* synthetic */ int[] f117255a;

        static {
            int[] iArr = new int[MergePaths.EnumC3406a.values().length];
            f117255a = iArr;
            try {
                iArr[MergePaths.EnumC3406a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117255a[MergePaths.EnumC3406a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117255a[MergePaths.EnumC3406a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117255a[MergePaths.EnumC3406a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117255a[MergePaths.EnumC3406a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.f117252d = mergePaths.m103744c();
        this.f117254f = mergePaths;
    }

    /* renamed from: d */
    private void m2094d() {
        for (int i = 0; i < this.f117253e.size(); i++) {
            this.f117251c.addPath(this.f117253e.get(i).getPath());
        }
    }

    @TargetApi(19)
    /* renamed from: e */
    private void m2093e(Path.Op op) {
        this.f117250b.reset();
        this.f117249a.reset();
        for (int size = this.f117253e.size() - 1; size >= 1; size--) {
            PathContent pathContent = this.f117253e.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                List<PathContent> m2106i = contentGroup.m2106i();
                for (int size2 = m2106i.size() - 1; size2 >= 0; size2--) {
                    Path path = m2106i.get(size2).getPath();
                    path.transform(contentGroup.m2105j());
                    this.f117250b.addPath(path);
                }
            } else {
                this.f117250b.addPath(pathContent.getPath());
            }
        }
        PathContent pathContent2 = this.f117253e.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List<PathContent> m2106i2 = contentGroup2.m2106i();
            for (int i = 0; i < m2106i2.size(); i++) {
                Path path2 = m2106i2.get(i).getPath();
                path2.transform(contentGroup2.m2105j());
                this.f117249a.addPath(path2);
            }
        } else {
            this.f117249a.set(pathContent2.getPath());
        }
        this.f117251c.op(this.f117249a, this.f117250b, op);
    }

    @Override // p1032x.GreedyContent
    /* renamed from: b */
    public void mo2087b(ListIterator<InterfaceC44659c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC44659c previous = listIterator.previous();
            if (previous instanceof PathContent) {
                this.f117253e.add((PathContent) previous);
                listIterator.remove();
            }
        }
    }

    @Override // p1032x.InterfaceC44659c
    /* renamed from: f */
    public void mo2080f(List<InterfaceC44659c> list, List<InterfaceC44659c> list2) {
        for (int i = 0; i < this.f117253e.size(); i++) {
            this.f117253e.get(i).mo2080f(list, list2);
        }
    }

    @Override // p1032x.PathContent
    public Path getPath() {
        this.f117251c.reset();
        if (this.f117254f.m103743d()) {
            return this.f117251c;
        }
        int i = C44660a.f117255a[this.f117254f.m103745b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m2093e(Path.Op.XOR);
                        }
                    } else {
                        m2093e(Path.Op.INTERSECT);
                    }
                } else {
                    m2093e(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m2093e(Path.Op.UNION);
            }
        } else {
            m2094d();
        }
        return this.f117251c;
    }
}
