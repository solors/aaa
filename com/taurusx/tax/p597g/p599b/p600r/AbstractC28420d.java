package com.taurusx.tax.p597g.p599b.p600r;

import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import com.taurusx.tax.p597g.p599b.p600r.C28418c;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.taurusx.tax.g.b.r.d */
/* loaded from: classes7.dex */
public abstract class AbstractC28420d implements InterfaceC28416a {

    /* renamed from: b */
    public static final C28392b f73844b = C28393c.m38142a("LruDiskUsage");

    /* renamed from: a */
    public final ExecutorService f73845a = Executors.newSingleThreadExecutor();

    /* renamed from: com.taurusx.tax.g.b.r.d$a */
    /* loaded from: classes7.dex */
    public class CallableC28421a implements Callable<Void> {

        /* renamed from: a */
        public final File f73846a;

        public CallableC28421a(File file) {
            this.f73846a = file;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            AbstractC28420d abstractC28420d = AbstractC28420d.this;
            File file = this.f73846a;
            abstractC28420d.getClass();
            C28418c.m38102b(file);
            File parentFile = file.getParentFile();
            List<File> linkedList = new LinkedList();
            File[] listFiles = parentFile.listFiles();
            if (listFiles != null) {
                linkedList = Arrays.asList(listFiles);
                Collections.sort(linkedList, new C28418c.C28419a());
            }
            long j = 0;
            for (File file2 : linkedList) {
                j += file2.length();
            }
            int size = linkedList.size();
            for (File file3 : linkedList) {
                if (!abstractC28420d.mo38099a(file3, j, size)) {
                    long length = file3.length();
                    if (file3.delete()) {
                        size--;
                        j -= length;
                        AbstractC28420d.f73844b.m38144b("Cache file " + file3 + " is deleted because it exceeds cache limit");
                    } else {
                        AbstractC28420d.f73844b.m38148a(6, "Error deleting file " + file3 + " for trimming cache", (Throwable) null);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void m38101a(File file) throws IOException {
        this.f73845a.submit(new CallableC28421a(file));
    }

    /* renamed from: a */
    public abstract boolean mo38099a(File file, long j, int i);
}
